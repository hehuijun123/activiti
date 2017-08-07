package com.ssh.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.ssh.dao.PurchaseDao;
import com.ssh.entity.Emergency;
import com.ssh.entity.Purchase;
@Repository
public class PurchaseDaoImpl extends BaseDaoImpl<Purchase> implements PurchaseDao {
	public List<Purchase> select(String page, String rows,String work){
		System.out.println("-----------");
		int beginIndex = Integer.parseInt(page);
		int max = Integer.parseInt(rows);
		String sql = "from Purchase where Pcompany =:work";
		Query query = getSession().createQuery(sql).setParameter("work", work);
		query.setFirstResult((beginIndex-1)*max);
		query.setMaxResults(max);
		return query.list();
		
	}
	public int selectall(String work){
		String sql = "select count(*) from Purchase where Pcompany =:work";
		Query query = getSession().createSQLQuery(sql).setParameter("work", work);
		int result = (int) query.uniqueResult();
		return result;	
	}
	
	//条件查询
	public List<Purchase> searchPc(String page, String rows,String psdate,String pedate,Map map){
		int	beginIndex = Integer.parseInt(page);					
		int	max = Integer.parseInt(rows);
		String searchCp = (String) map.get("value");
		String key = (String) map.get("key");
		//定义sql语句
		String sql = "select * from Purchase [where]";
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
			sqlCondition += "and Pdate > ? ";
			listCondition.add(psdate);
		}
		if(pedate!=null
				&&!"".equals(pedate)){
			sqlCondition += "and Pdate < ? ";
			listCondition.add(pedate);
		}
		sqlCondition = sqlCondition.replaceFirst("and", "where");
		
		//通过sqlcondition去替换掉占位符
		sql = sql.replace("[where]", sqlCondition);
		System.out.println(sql);
		Query query = getSession().createSQLQuery(sql).addEntity(Purchase.class);
		for (int i = 0; i < listCondition.size(); i++) {
			System.out.println(listCondition.get(i));
			query.setParameter(i, listCondition.get(i));
		}
		query.setFirstResult((beginIndex-1)*max);
		query.setMaxResults(max);
		return query.list();
		
	}
	public int selectallPc(String psdate,String pedate,Map map){
		String sql = "select count(*) from Purchase [where]";
		String sqlCondition = "";
		List listCondition = new ArrayList();
		String searchCp = (String) map.get("value");
		String key = (String) map.get("key");
		if(searchCp!=null
				&&!"".equals(searchCp)){
			sqlCondition += " and "+key + " = ? ";
			listCondition.add(searchCp);
		}
		if(psdate!=null
				&&!"".equals(psdate)){
			sqlCondition += "and Pdate > ? ";
			listCondition.add(psdate);
		}
		if(pedate!=null
				&&!"".equals(pedate)){
			sqlCondition += "and Pdate < ? ";
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
	public List<Purchase> selectOrder(){
		String sql = " from Purchase";
		Query query = getSession().createQuery(sql);
		return query.list();
	}
	
}
