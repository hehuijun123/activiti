package com.ssh.dao;

import java.util.List;

import com.ssh.entity.Resources;
import com.ssh.entity.Role;

public interface RoleDao {
	List<Role>	select();//��ѯģ����Ϣ
	Role selectById(Long id);//��ѯ��ɫͨ��id
	Role selectByName(String name);
	//Role selectByParent(String );//��ѯ���ڵ�
	

}
