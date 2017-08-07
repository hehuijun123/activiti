package com.ssh.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.ssh.dao.StorageDao;
import com.ssh.entity.Purchase;
import com.ssh.entity.Storehouse;
import com.ssh.entity.Temporary;
import com.ssh.util.DoSum;
import com.ssh.util.GetDate;

@Repository
public class StoragehouseDaoImpl extends BaseDaoImpl<Storehouse> implements StorageDao {
	//通过危化物编码查询
	public Storehouse searchBySnum(String Scoding){
		Query query = getSession().createQuery("from Storehouse where Scoding =:scoding").setParameter("scoding", Scoding);
		return (Storehouse) query.uniqueResult();
	}	
	public List<Storehouse> select(String page, String rows){
		int beginIndex = Integer.parseInt(page);
		int max = Integer.parseInt(rows);
		String sql = "from Storehouse";
		Query query = getSession().createQuery(sql);
		query.setFirstResult((beginIndex-1)*max);
		query.setMaxResults(max);
		return query.list();	
	}	
	public int selectall(){
		String sql = "select count(*) from Storehouse";
		Query query = getSession().createSQLQuery(sql);
		int result = (int) query.uniqueResult();
		return result;	
	}	
	public List<Storehouse> selectdetailJT(String name,String date,String work){
		String sql  = "from Storehouse where Sname =:name and jt =:work and Sdate =:date";
		Query query = null;
		query = getSession().createQuery(sql)
				.setParameter("name", name)
				.setParameter("work", work)
				.setParameter("date", date);
		return query.list();		
	}
	public List<Storehouse> selectdetailZS(String name,String date,String work){
		String sql  = "from Storehouse where Sname =:name and zs =:work and Sdate =:date";
		Query query = null;
		query = getSession().createQuery(sql)
				.setParameter("name", name)
				.setParameter("work", work)
				.setParameter("date", date);
		return query.list();		
	}
	public Storehouse selectSHByName(String name,String work,String date,String pother){
		System.out.println("-------SHB");
		Query query = null;
		try {
			String sql = "from Storehouse where Sname =:name and Swork =:work and Sdate =:date and Sother =:other";
			query = getSession().createQuery(sql)
					.setParameter("name", name)
					.setParameter("work", work)
					.setParameter("date", date)
					.setParameter("other", pother);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (Storehouse) query.uniqueResult();			
		}
	public List<Storehouse> selectSHByWork(String str){
		
		String sql = "from Storehouse where Swork =:work";
		Query query = getSession().createQuery(sql).setParameter("work", str);
		return query.list();
	}
	//条件查询
	public List<Storehouse> searchPc(String page, String rows,String psdate,String searchCp,String work){
		int	beginIndex = Integer.parseInt(page);					
		int	max = Integer.parseInt(rows);
	
		//定义sql语句
		String sql = "select * from Storehouse [where]";
		String sqlCondition = "";
		List listCondition = new ArrayList();
		/*System.out.println(status.getGroup_name());
		System.out.println(status.getJstatus());*/
		if(searchCp!=null
				&&!"".equals(searchCp)){
			sqlCondition += "and Sname = ? ";
			listCondition.add(searchCp);
		}
		if(psdate!=null
				&&!"".equals(psdate)){
			sqlCondition += "and Sdate = ? ";
			listCondition.add(psdate);
		}else{
			sqlCondition += "and Sdate = ? ";
			listCondition.add(GetDate.Getdate());
		}
		
		if(work!=null
				&&!"".equals(work)){
			sqlCondition += "and Swork = ? ";
			listCondition.add(work);
		}
		sqlCondition = sqlCondition.replaceFirst("and", "where");
		
		//通过sqlcondition去替换掉占位符
		sql = sql.replace("[where]", sqlCondition);
		System.out.println(sql);
		Query query = getSession().createSQLQuery(sql).addEntity(Storehouse.class);
		for (int i = 0; i < listCondition.size(); i++) {
			System.out.println(listCondition.get(i));
			query.setParameter(i, listCondition.get(i));
		}
		query.setFirstResult((beginIndex-1)*max);
		query.setMaxResults(max);
		return query.list();
		
	}
	public int selectallPc(String psdate,String searchCp,String work){
		String sql = "select count(*) from Storehouse [where]";
		String sqlCondition = "";
		List listCondition = new ArrayList();
			if(searchCp!=null
					&&!"".equals(searchCp)){
				sqlCondition += "and Sname = ? ";
				listCondition.add(searchCp);
			}
			if(psdate!=null
					&&!"".equals(psdate)){
				sqlCondition += "and Sdate = ? ";
				listCondition.add(psdate);
			}else{
				sqlCondition += "and Sdate = ? ";
				listCondition.add(GetDate.Getdate());
			}
			if(work!=null
					&&!"".equals(work)){
				sqlCondition += "and Swork = ? ";
				listCondition.add(work);
			}
			
			sqlCondition = sqlCondition.replaceFirst("and", "where");
		
		//通过sqlcondition去替换掉占位符
		sql = sql.replace("[where]", sqlCondition);
		Query query = getSession().createSQLQuery(sql);
		for (int i = 0; i < listCondition.size(); i++) {
			System.out.println(listCondition.get(i));
			query.setParameter(i, listCondition.get(i));
		}
		int result = (int) query.uniqueResult();
		return result;
	}
	
		
	//条件查询   时间，公司，危化品名称
	public List<Storehouse> searchAdminPc(String page, String rows,String psdate,Map map,String searchCp){
		int	beginIndex = Integer.parseInt(page);					
		int	max = Integer.parseInt(rows);
		String searchCps = (String) map.get("value");
		String key = (String) map.get("key");
		//定义sql语句
		String sql = "select * from Storehouse [where]";
		
		String sqlCondition = "";
		List listCondition = new ArrayList();
		/*System.out.println(status.getGroup_name());
		System.out.println(status.getJstatus());*/
		if(searchCp!=null
				&&!"".equals(searchCp)){
			sqlCondition += "and Sname = ? ";
			listCondition.add(searchCp);
		}
		if(psdate!=null
				&&!"".equals(psdate)){
			sqlCondition += "and Sdate = ? ";
			listCondition.add(psdate);
		}else{
			sqlCondition += "and Sdate = ? ";
			listCondition.add(GetDate.Getdate());
		}
		if(searchCps!=null
				&&!"".equals(searchCps)){
			sqlCondition += " and "+key + " = ? ";
			listCondition.add(searchCps);
		}
		sqlCondition = sqlCondition.replaceFirst("and", "where");
		
		//通过sqlcondition去替换掉占位符
		sql = sql.replace("[where]", sqlCondition);
		System.out.println(sql);
		Query query = getSession().createSQLQuery(sql).addEntity(Storehouse.class);
		
		for (int i = 0; i < listCondition.size(); i++) {
			System.out.println(listCondition.get(i));
			query.setParameter(i, listCondition.get(i));
		}		
		return query.list();			
	}
	public int selectallAdminPc(String psdate,Map map,String searchCp){
		String sql = "select count(*) from Storehouse [where]";
		String sqlCondition = "";
		String searchCps = (String) map.get("value");
		String key = (String) map.get("key");
		List listCondition = new ArrayList();
		if(searchCp!=null
				&&!"".equals(searchCp)){
			sqlCondition += "and Sname = ? ";
			listCondition.add(searchCp);
		}
		if(psdate!=null
				&&!"".equals(psdate)){
			sqlCondition += "and Sdate = ? ";
			listCondition.add(psdate);
		}else{
			sqlCondition += "and Sdate = ? ";
			listCondition.add(GetDate.Getdate());
		}
		if(searchCps!=null
				&&!"".equals(searchCps)){
			sqlCondition += " and "+key + " = ? ";
			listCondition.add(searchCps);
		}
			sqlCondition = sqlCondition.replaceFirst("and", "where");
		
		//通过sqlcondition去替换掉占位符
		sql = sql.replace("[where]", sqlCondition);
		Query query = getSession().createSQLQuery(sql);
		for (int i = 0; i < listCondition.size(); i++) {
			System.out.println(listCondition.get(i));
			query.setParameter(i, listCondition.get(i));
		}
		int result = (int) query.uniqueResult();
		return result;
	}
		
		
	public List<Storehouse> selectExcel(String str){
		
		String sql = "from Storehouse where sc =:work and Sdate =:date ";
		Query query = getSession().createQuery(sql)
				.setParameter("work", str)
				.setParameter("date", GetDate.Getdate());			
		return query.list();
		
	}
	
	
	public List<Storehouse> selectExcelByName(String str,String date){			
		String sql = "from Storehouse where Sname =:work and Sdate =:date ";
		Query query = getSession().createQuery(sql)
				.setParameter("work", str)
				.setParameter("date", date);		
		return query.list();			
	}
	public List<Storehouse> selectExcelByNameAndWork(String str){
		
		String sql = "from Storehouse where Sother =:work ";
		Query query = getSession().createQuery(sql)
				.setParameter("work", str)
				;		
		return query.list();			
	}
	
	
	public List selectSize(){					
		String sql = "select sc from Storehouse group by sc";
		Query query = getSession().createQuery(sql);
		return query.list();		
	}
	public List selectSizeZS(){					
		String sql = "select zs from Storehouse group by zs";
		Query query = getSession().createQuery(sql);
		return query.list();		
	}
	
	public List selectSizeByName(){
		
		String sql = "select Sname from Storehouse group by Sname";
		Query query = getSession().createQuery(sql);
		return query.list();		
	}
	
	
	//条件查询   时间，公司，危化品名称
	public List<Storehouse> searchExcel(String pedate,String work){		
		//定义sql语句
		String sql = "select * from Storehouse [where]";
		String sqlCondition = "";
		List listCondition = new ArrayList();
		/*System.out.println(status.getGroup_name());
		System.out.println(status.getJstatus());*/
		Query query = null;
		try {
			if(pedate!=null
					&&!"".equals(pedate)){
				sqlCondition += "and Sdate = ? ";
				listCondition.add(pedate);
			}
			if(work!=null
					&&!"".equals(work)){
				sqlCondition += "and sc = ? ";
				listCondition.add(work);
			}			
			sqlCondition = sqlCondition.replaceFirst("and", "where");			
			//通过sqlcondition去替换掉占位符
			sql = sql.replace("[where]", sqlCondition);
			System.out.println(sql);
			query = getSession().createSQLQuery(sql).addEntity(Storehouse.class);
			for (int i = 0; i < listCondition.size(); i++) {
				System.out.println(listCondition.get(i));
				query.setParameter(i, listCondition.get(i));
			}
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return query.list();		
	}
	//临时表
	public void saveTempory(Temporary sh){
		getSession().save(sh);
	}
	public void deleteTemporaty(){
		String sql1 = "delete from Temporary";
		Query query = getSession().createSQLQuery(sql1);
		query.executeUpdate();
	}
	
	//条件查询   时间，公司，危化品名称
	public List<Temporary> searchTempory(String page, String rows){
		int	beginIndex = Integer.parseInt(page);					
		int	max = Integer.parseInt(rows);
		
		//定义sql语句
		String sql = "select * from Temporary ";
		Query query = getSession().createSQLQuery(sql).addEntity(Temporary.class);
		query.setFirstResult((beginIndex-1)*max);
		query.setMaxResults(max);
		List<Temporary> list = query.list();
		return query.list();			
	}
	public int selectallTempory(String psdate,Map map,String searchCp){
		String sql = "select count(*) from Temporary";			
		//通过sqlcondition去替换掉占位符			
		Query query = getSession().createSQLQuery(sql);		
		int result = (int) query.uniqueResult();
		return result;
	}
	
	
	
	public List<Storehouse> searchOrder(){
		
		//定义sql语句
		String sql = " from Storehouse where Sdate=:date";
		Query query = getSession().createQuery(sql).setParameter("date", GetDate.Getdate());	
		List<Storehouse> list = query.list();
		return query.list();			
	}
}
