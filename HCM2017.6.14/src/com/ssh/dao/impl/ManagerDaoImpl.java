package com.ssh.dao.impl;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.ssh.dao.ManagerDao;
import com.ssh.entity.Manager;
@Repository
public class ManagerDaoImpl extends BaseDaoImpl<Manager> implements ManagerDao {

	@Override
	public Manager select(String str) {
		// TODO Auto-generated method stub
		String sql  = "from Manager where MfId =:id";
		Query query = getSession().createQuery(sql).setParameter("id", str);
		return (Manager) query.uniqueResult();
	}

}
