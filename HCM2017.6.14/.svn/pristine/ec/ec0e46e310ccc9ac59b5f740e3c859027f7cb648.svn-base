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
		List<Resources> rList = rigthDaoImpl.select();	//查询出所有模块信息
		List<Tree> tList = new ArrayList<>();	//树集合 tree：id,text,state,children,iconCls,pid
		System.out.println("resource:"+rList.size());
		for(Resources rs:rList){
			Tree tree = new Tree();
			tree.setId(rs.getRid().toString());	//获取resource中的id
			if(rs.getParents()!=null){	//若果resource种父id不为零，将其存入到tree中
				tree.setPid(rs.getParents());
			}else{	//若果父类id为空将tree中节点状态设置为关闭状态
				tree.setState("closed");
			}
			tree.setIconCls(rs.getIconCls());//设置tree中的iconcls属性，图标
			tree.setText(rs.getName());//设置节点名称
			tList.add(tree);//放入tree集合中
		}
		/**
		 * 当前得到的树的集合只是一层树的集合，还需要对树的集合进行处理，得到第一层，第二层以及后面更多层树的结构
		 * 1
		 * 		1.1		
		 * 				1.1.1
		 * 调用TreeUtil类中father方法，遍历tList集合，判断父类id是否为空，如果为空，说明是第一层树，需要查询是否有子树
		 * 调用children方法，根据父类查询出来的树的id作为父类id去查询剩下的tList中的树的父类id，
		 * 如果相同，说明查询到的tree是当前这个树的子树，
		 * 将其设置到第一层树的子树集合中，然后再根据查询到的子树的id作为父类id再一次调用children方法重复上出步骤，
		 * 如果查询继续可以查询出来，说明子树还有子树，以此类推，直到查询不到结果，将结果返回给father方法
		 * 查询树结构思路
		 * 
		 * 
		 */
		return TreeUtil.getFatherNode(tList);
	}
	
	public List<Tree> selectRole() {
		// TODO Auto-generated method stub
		List<Role> rList = rigthDaoImpl.selectRole();	//查询出所有模块信息
		List<Tree> tList = new ArrayList<>();	//树集合 tree：id,text,state,children,iconCls,pid
		System.out.println("resource:"+rList.size());
		for(Role rs:rList){
			Tree tree = new Tree();
			tree.setId(rs.getRid().toString());	//获取resource中的id
			if(rs.getParents()!=null){	//若果resource种父id不为零，将其存入到tree中
				tree.setPid(rs.getParents());
			}else{	//若果父类id为空将tree中节点状态设置为关闭状态
				tree.setState("closed");
			}
			tree.setIconCls(rs.getIconCls());//设置tree中的iconcls属性，图标
			tree.setText(rs.getName());//设置节点名称
			tList.add(tree);//放入tree集合中
		}
		/**
		 * 当前得到的树的集合只是一层树的集合，还需要对树的集合进行处理，得到第一层，第二层以及后面更多层树的结构
		 * 1
		 * 		1.1		
		 * 				1.1.1
		 * 调用TreeUtil类中father方法，遍历tList集合，判断父类id是否为空，如果为空，说明是第一层树，需要查询是否有子树
		 * 调用children方法，根据父类查询出来的树的id作为父类id去查询剩下的tList中的树的父类id，
		 * 如果相同，说明查询到的tree是当前这个树的子树，
		 * 将其设置到第一层树的子树集合中，然后再根据查询到的子树的id作为父类id再一次调用children方法重复上出步骤，
		 * 如果查询继续可以查询出来，说明子树还有子树，以此类推，直到查询不到结果，将结果返回给father方法
		 * 查询树结构思路
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
