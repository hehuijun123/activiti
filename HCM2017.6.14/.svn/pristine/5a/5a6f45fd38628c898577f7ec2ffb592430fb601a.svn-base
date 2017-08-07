package com.ssh.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.ssh.dao.HazardousChemicalsDao;
import com.ssh.entity.Emergency;
import com.ssh.entity.HazardousChemicals;
@Repository
public class HazardousChemicalsDaoImpl extends BaseDaoImpl<HazardousChemicals> implements HazardousChemicalsDao {
	public List<HazardousChemicals> select(String page, String rows){
		System.out.println("-----------");
		int beginIndex = Integer.parseInt(page);
		int max = Integer.parseInt(rows);
		String sql = "from HazardousChemicals";
		Query query = getSession().createQuery(sql);
		query.setFirstResult((beginIndex-1)*max);
		query.setMaxResults(max);
		return query.list();
		
	}
	public List<HazardousChemicals> selectHC(String str){
		
		String sql = "from HazardousChemicals where name like '" + str + "%'";
		Query query = getSession().createQuery(sql);
		return query.list();
		
	}
	
	public List<HazardousChemicals> selectOrder(){
		
		String sql = "from HazardousChemicals";
		Query query = getSession().createQuery(sql);
		return query.list();
		
	}
	public HazardousChemicals selectHCByName(String str){
		
		String sql = "from HazardousChemicals where name =:name";
		Query query = getSession().createQuery(sql).setParameter("name", str);
		return (HazardousChemicals) query.uniqueResult();
		
	}
	public int selectall(){
		String sql = "select count(*) from HazardousChemicals";
		Query query = getSession().createSQLQuery(sql);
		int result = (int) query.uniqueResult();
		return result;	
	}
	public List<HazardousChemicals> selectWork(String work){
		String sql = "from HazardousChemicals where Hwork"+work+" is not null";
		Query query = getSession().createQuery(sql);
		return query.list();
	}
	
public HazardousChemicals selectHCByNum(String str){
		
		String sql = "from HazardousChemicals where Hnum =:hnum";
		Query query = getSession().createQuery(sql).setParameter("hnum", str);
		return (HazardousChemicals) query.uniqueResult();
	}
	public List<HazardousChemicals> selects(){	
	String sql = "from HazardousChemicals";
	Query query = getSession().createQuery(sql);
	return query.list();
	
}
}
