package com.ssh.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.ssh.dao.RightDao;
import com.ssh.entity.Resources;
import com.ssh.entity.Role;
@Repository
public class RigthDaoImpl extends BaseDaoImpl<Resources> implements RightDao {

	@Override
	public List<Resources> select(){
		// TODO Auto-generated method stub
		System.out.println("----------");
		String sql = "from Resources";
		Query query = getSession().createQuery(sql);		
		return query.list();
	}
	
	public List<Role> selectRole(){
		// TODO Auto-generated method stub
		System.out.println("----------");
		String sql = "from Role";
		Query query = getSession().createQuery(sql);		
		return query.list();
	}
}
