package com.ssh.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.ssh.dao.UserDao;
import com.ssh.entity.Company;
import com.ssh.entity.Consumer;
import com.ssh.entity.Emergency;
import com.ssh.entity.Tm;
@Repository
public class UserDaoImpl extends BaseDaoImpl<Consumer> implements UserDao {
	public List<Consumer> select(String page, String rows){
		int beginIndex = Integer.parseInt(page);
		int max = Integer.parseInt(rows);
		String sql = "from Consumer";
		Query query = getSession().createQuery(sql);
		query.setFirstResult((beginIndex-1)*max);
		query.setMaxResults(max);
		return query.list();
	}
	public int selectall(){
		String sql = "select count(*) from Consumer";
		Query query = getSession().createSQLQuery(sql);
		int result = (int) query.uniqueResult();
		return result;	
	}
	public List<Consumer> selectHC(String str){
			
			String sql = "from Consumer where Cname like '" + str + "%'";
			Query query = getSession().createQuery(sql);
			return query.list();	
	}
	
	public Consumer login(String str){
		String sql = "from Consumer where Cname=:name";
		Query query = getSession().createQuery(sql).setParameter("name", str);
		return (Consumer) query.uniqueResult();	
	}
	public Tm time(){
		String sql = "from Tm";
		Query query = getSession().createQuery(sql);
		return (Tm) query.uniqueResult();	
	}
}
