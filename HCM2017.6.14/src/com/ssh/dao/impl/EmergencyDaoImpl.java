package com.ssh.dao.impl;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.ssh.dao.EmergencyDao;
import com.ssh.entity.Emergency;
import com.ssh.entity.rulee;
@Repository
public class EmergencyDaoImpl extends BaseDaoImpl<Emergency> implements EmergencyDao {
	public List<Emergency> select(String page, String rows,String str,Map map){
		System.out.println("-----------");
		int beginIndex = Integer.parseInt(page);
		int max = Integer.parseInt(rows);
		String searchCp = (String) map.get("value");
		String key = (String) map.get("key");
		String sql = "from Emergency where " + str + " is not null and "+key+"="+searchCp;
		Query query = getSession().createQuery(sql);
		query.setFirstResult((beginIndex-1)*max);
		query.setMaxResults(max);
		return query.list();
		
	}
	
	public List<Emergency> selectEmergency(String page, String rows,String role,String work){
		int beginIndex = Integer.parseInt(page);
		int max = Integer.parseInt(rows);
		String sql = "from Emergency where "+role+"="+work;
		Query query = getSession().createQuery(sql);
		query.setFirstResult((beginIndex-1)*max);
		query.setMaxResults(max);
		return query.list();
		
	}
	public int selectall( Map map){
		String searchCp = (String) map.get("value");
		String key = (String) map.get("key");
		String sql = "select count(*) from Emergency where "+key+"="+searchCp;
		Query query = getSession().createSQLQuery(sql);
		int result = (int) query.uniqueResult();
		return result;	
	}
	public Emergency selectEmergency(Long id){
		String sql = " from Emergency where id =:id";
		Query query = getSession().createQuery(sql).setParameter("id", id);
		return (Emergency) query.uniqueResult();	
	}
	
	public List<rulee> selectRule(String page, String rows){
		
		int beginIndex = Integer.parseInt(page);
		int max = Integer.parseInt(rows);
		
		String sql = "from rulee";
		Query query = getSession().createQuery(sql);
		query.setFirstResult((beginIndex-1)*max);
		query.setMaxResults(max);
		return query.list();
		
	}
	public int selectallRule( ){
		
		String sql = "select count(*) from rulee";
		Query query = getSession().createSQLQuery(sql);
		int result = (int) query.uniqueResult();
		return result;	
	}
	public rulee selectRule(Long id){
		String sql = " from rulee where rid =:id";
		Query query = getSession().createQuery(sql).setParameter("id", id);
		return (rulee) query.uniqueResult();	
	}
	public void saveRule(rulee waste) {
		getSession().save(waste);
		// TODO Auto-generated method stub
		
	}
	public void deleteRule(Long id){
		System.out.println(id);
		rulee rl = selectRule(id);
		getSession().delete(rl);
	}
	
	
	public List<Emergency> selectjt(){
		String sql = "from Emergency where  Ework=:id";
		Query query = getSession().createQuery(sql).setParameter("id", "0");
		return query.list();
		
	}
	public List<String> selectzs(){
		String sql = " select zs from Emergency where zs is not null group by zs";
		Query query = getSession().createQuery(sql);
		return query.list();
		
	}
	
	public List<String> selectsc(String id){
		String sql = " select sc from Emergency where sc is not null and zs="+id+" group by sc";
		Query query = getSession().createQuery(sql);
		return query.list();
		
	}
	
	public List<Emergency> selectyj(String id){
		String sql = "from Emergency where  Ework=:id";
		Query query = getSession().createQuery(sql).setParameter("id", id);
		return query.list();
		
	}
	
}
