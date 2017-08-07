package com.ssh.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.ssh.dao.CompanyDao;
import com.ssh.entity.Company;
import com.ssh.entity.HazardousChemicals;
import com.ssh.entity.ScCompany;
@Repository
public class CompanyDaoImpl extends BaseDaoImpl<Company> implements CompanyDao {
	
	public List<ScCompany> select(String page, String rows){
		System.out.println("-----------");
		int beginIndex = Integer.parseInt(page);
		int max = Integer.parseInt(rows);
		String sql = "from ScCompany";
		Query query = getSession().createQuery(sql);
		query.setFirstResult((beginIndex-1)*max);
		query.setMaxResults(max);
		return query.list();		
	}
	public int selectall(){
		String sql = "select count(*) from ScCompany";
		Query query = getSession().createSQLQuery(sql);
		
		int result = (int) query.uniqueResult();
		return result;	
	}
	
	public List<Company> selectHC(String str){
		
		String sql = "from Company where Cname like '" + str + "%'";
		Query query = getSession().createQuery(sql);
		return query.list();
		
	}
	public List<String> selectGs(){
		String sql = "select Pid from ScCompany where Pid!='null' group by Pid";
		Query query = getSession().createSQLQuery(sql);
		return query.list();
	}
	
	public List<ScCompany> searchGs(String Pid){
		String sql = "from ScCompany where Pid =:pid and Pid!=Cid";
		Query query = getSession().createQuery(sql).setParameter("pid", Pid);
		return query.list();
	}
	
	public List<ScCompany> searchGss(String id,String page,String rows){
		int beginIndex = Integer.parseInt(page);
		int max = Integer.parseInt(rows);
		String sql = "from ScCompany where Pid =:pid ";
		Query query = getSession().createQuery(sql).setParameter("pid", id);
		query.setFirstResult((beginIndex-1)*max);
		query.setMaxResults(max);
		return query.list();
	}
	public ScCompany searchGsId(String cid){
		long id = Long.valueOf(cid);
		String sql = "from ScCompany where Cid =:id ";
		Query query = getSession().createQuery(sql).setParameter("id", id);
		return (ScCompany) query.uniqueResult();
	}
	
	
	public ScCompany searchSc(String name){
		//long id = Long.valueOf(cid);
		String sql = "from ScCompany where Cname =:name ";
		Query query = getSession().createQuery(sql).setParameter("name", name);
		return (ScCompany) query.uniqueResult();
	}

}