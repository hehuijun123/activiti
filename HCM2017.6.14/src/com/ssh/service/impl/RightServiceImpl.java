package com.ssh.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.dao.impl.RigthDaoImpl;
import com.ssh.entity.Resources;
import com.ssh.entity.Role;
import com.ssh.entity.Tree;
import com.ssh.service.RightService;
import com.ssh.util.TreeUtil;
@Transactional
@Service
public class RightServiceImpl implements RightService {
	@Resource	
	private RigthDaoImpl rigthDaoImpl;
	@Override
	public List<Tree> select() {
		// TODO Auto-generated method stub
		List<Resources> rList = rigthDaoImpl.select();	//��ѯ������ģ����Ϣ
		List<Tree> tList = new ArrayList<>();	//������ tree��id,text,state,children,iconCls,pid
		System.out.println("resource:"+rList.size());
		for(Resources rs:rList){
			Tree tree = new Tree();
			tree.setId(rs.getRid().toString());	//��ȡresource�е�id
			if(rs.getParents()!=null){	//����resource�ָ�id��Ϊ�㣬������뵽tree��
				tree.setPid(rs.getParents());
			}else{	//��������idΪ�ս�tree�нڵ�״̬����Ϊ�ر�״̬
				tree.setState("closed");
			}
			tree.setIconCls(rs.getIconCls());//����tree�е�iconcls���ԣ�ͼ��
			tree.setText(rs.getName());//���ýڵ�����
			tList.add(tree);//����tree������
		}
		/**
		 * ��ǰ�õ������ļ���ֻ��һ�����ļ��ϣ�����Ҫ�����ļ��Ͻ��д����õ���һ�㣬�ڶ����Լ������������Ľṹ
		 * 1
		 * 		1.1		
		 * 				1.1.1
		 * ����TreeUtil����father����������tList���ϣ��жϸ���id�Ƿ�Ϊ�գ����Ϊ�գ�˵���ǵ�һ��������Ҫ��ѯ�Ƿ�������
		 * ����children���������ݸ����ѯ����������id��Ϊ����idȥ��ѯʣ�µ�tList�е����ĸ���id��
		 * �����ͬ��˵����ѯ����tree�ǵ�ǰ�������������
		 * �������õ���һ���������������У�Ȼ���ٸ��ݲ�ѯ����������id��Ϊ����id��һ�ε���children�����ظ��ϳ����裬
		 * �����ѯ�������Բ�ѯ������˵�����������������Դ����ƣ�ֱ����ѯ�����������������ظ�father����
		 * ��ѯ���ṹ˼·
		 * 
		 * 
		 */
		return TreeUtil.getFatherNode(tList);
	}
	
	public List<Tree> selectRole() {
		// TODO Auto-generated method stub
		List<Role> rList = rigthDaoImpl.selectRole();	//��ѯ������ģ����Ϣ
		List<Tree> tList = new ArrayList<>();	//������ tree��id,text,state,children,iconCls,pid
		System.out.println("resource:"+rList.size());
		for(Role rs:rList){
			Tree tree = new Tree();
			tree.setId(rs.getRid().toString());	//��ȡresource�е�id
			if(rs.getParents()!=null){	//����resource�ָ�id��Ϊ�㣬������뵽tree��
				tree.setPid(rs.getParents());
			}else{	//��������idΪ�ս�tree�нڵ�״̬����Ϊ�ر�״̬
				tree.setState("closed");
			}
			tree.setIconCls(rs.getIconCls());//����tree�е�iconcls���ԣ�ͼ��
			tree.setText(rs.getName());//���ýڵ�����
			tList.add(tree);//����tree������
		}
		/**
		 * ��ǰ�õ������ļ���ֻ��һ�����ļ��ϣ�����Ҫ�����ļ��Ͻ��д����õ���һ�㣬�ڶ����Լ������������Ľṹ
		 * 1
		 * 		1.1		
		 * 				1.1.1
		 * ����TreeUtil����father����������tList���ϣ��жϸ���id�Ƿ�Ϊ�գ����Ϊ�գ�˵���ǵ�һ��������Ҫ��ѯ�Ƿ�������
		 * ����children���������ݸ����ѯ����������id��Ϊ����idȥ��ѯʣ�µ�tList�е����ĸ���id��
		 * �����ͬ��˵����ѯ����tree�ǵ�ǰ�������������
		 * �������õ���һ���������������У�Ȼ���ٸ��ݲ�ѯ����������id��Ϊ����id��һ�ε���children�����ظ��ϳ����裬
		 * �����ѯ�������Բ�ѯ������˵�����������������Դ����ƣ�ֱ����ѯ�����������������ظ�father����
		 * ��ѯ���ṹ˼·
		 * 
		 * 
		 */
		return TreeUtil.getFatherNode(tList);
	}
	
	public List<Resources> search(){
		return rigthDaoImpl.select();
	}
	
	public List<Role> searchRole(){
		return rigthDaoImpl.selectRole();
	}

}
