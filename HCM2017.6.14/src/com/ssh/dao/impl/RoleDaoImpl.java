package com.ssh.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.ssh.dao.RoleDao;
import com.ssh.entity.Role;
@Repository
public class RoleDaoImpl extends BaseDaoImpl<Role> implements RoleDao {

	@Override
	public List<Role> select() {
		// TODO Auto-generated method stub
		String sql = "from Role";
		Query query = getSession().createQuery(sql);
		return query.list();
	}

	@Override
	public Role selectById(Long id) {
		// TODO Auto-generated method stub
		String sql = "from Role where id =:id";
		Query query = getSession().createQuery(sql).setParameter("id", id);
		return (Role) query.uniqueResult();
	}
	
	
	public Role selectByName(String name) {
		// TODO Auto-generated method stub
		String sql = "from Role where name =:name";
		Query query = getSession().createQuery(sql).setParameter("name", name);
		return (Role) query.uniqueResult();
	}

/*	@Override
	public Role selectByParent() {
		// TODO Auto-generated method stub
		return null;
	}*/

}
