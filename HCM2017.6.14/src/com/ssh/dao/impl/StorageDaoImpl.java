package com.ssh.dao.impl;

import java.util.List;

import org.apache.catalina.Store;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.ssh.dao.StoragehouseDao;
import com.ssh.entity.Storage;


@Repository
public class StorageDaoImpl extends BaseDaoImpl<Storage> implements StoragehouseDao {
	//通过危化物编码查询
	public Storage searchBySnum(String Scoding){
		Query query = getSession().createQuery("from Storage where Scoding =:scoding").setParameter("scoding", Scoding);
		return (Storage) query.uniqueResult();
	}
	public List<Storage> select(String page, String rows){
		System.out.println("-----------");
		int beginIndex = Integer.parseInt(page);
		int max = Integer.parseInt(rows);
		String sql = "from Storage";
		Query query = getSession().createQuery(sql);
		query.setFirstResult((beginIndex-1)*max);
		query.setMaxResults(max);
		return query.list();
		
	}
	public int selectall(){
		String sql = "select count(*) from Storage";
		Query query = getSession().createSQLQuery(sql);
		int result = (int) query.uniqueResult();
		return result;	
	}

}
