package com.ssh.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.ssh.dao.CompanyDao;
import com.ssh.entity.Company;
import com.ssh.entity.HazardousChemicals;
import com.ssh.entity.Logg;
import com.ssh.entity.Purchase;
import com.ssh.util.ChooseRole;
@Repository
public class LogDaoImpl extends BaseDaoImpl<Logg> implements CompanyDao {
	
	public List<Logg> select(String page, String rows){
		System.out.println("-----------");
		int beginIndex = Integer.parseInt(page);
		int max = Integer.parseInt(rows);
		String sql = "from Logg";
		Query query = getSession().createQuery(sql);
		query.setFirstResult((beginIndex-1)*max);
		query.setMaxResults(max);
		return query.list();
		
	}
	public int selectall(){
		String sql = "select count(*) from Logg";
		Query query = getSession().createSQLQuery(sql);
		int result = (int) query.uniqueResult();
		return result;	
	}
	
	//条件查询
	public List<Logg> searchPc(String page, String rows,String psdate,String pedate,String work){
		int	beginIndex = Integer.parseInt(page);					
		int	max = Integer.parseInt(rows);
		Map map = ChooseRole.chooseWorkAndKey(work);
		String searchCp = (String) map.get("value");
		String key = (String) map.get("key");
		//定义sql语句
		String sql = "select * from Logg [where] order by Ldate DESC";
		String sqlCondition = "";
		List listCondition = new ArrayList();
		/*System.out.println(status.getGroup_name());
		System.out.println(status.getJstatus());*/
		if(searchCp!=null
				&&!"".equals(searchCp)){
			sqlCondition += " and "+key + " = ? ";
			listCondition.add(searchCp);
		}
		if(psdate!=null
				&&!"".equals(psdate)){
			sqlCondition += "and Ldate > ? ";
			listCondition.add(psdate);
		}
		if(pedate!=null
				&&!"".equals(pedate)){
			sqlCondition += "and Ldate < ? ";
			listCondition.add(pedate);
		}
		sqlCondition = sqlCondition.replaceFirst("and", "where");
		
		//通过sqlcondition去替换掉占位符
		sql = sql.replace("[where]", sqlCondition);
		System.out.println(sql);
		Query query = getSession().createSQLQuery(sql).addEntity(Logg.class);
		for (int i = 0; i < listCondition.size(); i++) {
			System.out.println(listCondition.get(i));
			query.setParameter(i, listCondition.get(i));
		}
		query.setFirstResult((beginIndex-1)*max);
		query.setMaxResults(max);
		return query.list();
		
	}
	public int selectallPc(String psdate,String pedate,String work){
		String sql = "select count(*) from Logg [where]";
		String sqlCondition = "";
		List listCondition = new ArrayList();
		Map map = ChooseRole.chooseWorkAndKey(work);
		String searchCp = (String) map.get("value");
		String key = (String) map.get("key");
		if(searchCp!=null
				&&!"".equals(searchCp)){
			sqlCondition += " and "+key + " = ? ";
			listCondition.add(searchCp);
		}
			if(psdate!=null
					&&!"".equals(psdate)){
				sqlCondition += "and Ldate > ? ";
				listCondition.add(psdate);
			}
			if(pedate!=null
					&&!"".equals(pedate)){
				sqlCondition += "and Ldate < ? ";
				listCondition.add(pedate);
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
	
	
	public List<Logg> selectLog(){
		
		String sql = "from Logg";
		Query query = getSession().createQuery(sql);
		
		return query.list();
		
	}

}
