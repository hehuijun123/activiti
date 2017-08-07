package com.ssh.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.ssh.dao.ExcelFileDao;

import com.ssh.entity.ExcelFile;
import com.ssh.entity.Purchase;

@Repository
public class ExcelFileDaoImpl extends BaseDaoImpl<ExcelFile> implements ExcelFileDao {
	//条件查询
		public List<ExcelFile> searchPc(String page, String rows,String edate,Map map){//月份，工厂
			int	beginIndex = Integer.parseInt(page);					
			int	max = Integer.parseInt(rows);
			String searchCp = (String) map.get("value");
			String key = (String) map.get("key");
			//定义sql语句
			String sql = "select distinct * from ExcelFile [where]";
			String sqlCondition = "";
			List listCondition = new ArrayList();
			/*System.out.println(status.getGroup_name());
			System.out.println(status.getJstatus());*/
			if(searchCp!=null
					&&!"".equals(searchCp)){
				sqlCondition += " and "+key + " = ? ";
				listCondition.add(searchCp);
			}
			if(edate!=null
					&&!"".equals(edate)){
				sqlCondition += "and Edate > ? ";
				listCondition.add(edate);
			}
			
			sqlCondition = sqlCondition.replaceFirst("and", "where");
			
			//通过sqlcondition去替换掉占位符
			sql = sql.replace("[where]", sqlCondition);
			System.out.println(sql);
			Query query = getSession().createSQLQuery(sql).addEntity(ExcelFile.class);
			for (int i = 0; i < listCondition.size(); i++) {
				System.out.println(listCondition.get(i));
				query.setParameter(i, listCondition.get(i));
			}
			query.setFirstResult((beginIndex-1)*max);
			query.setMaxResults(max);
			return query.list();
			
		}
		
		
		public int selectallPc(String edate,Map map){
			String sql = "select count(*) from ExcelFile [where]";
			String sqlCondition = "";
			List listCondition = new ArrayList();
			String searchCp = (String) map.get("value");
			String key = (String) map.get("key");
			if(searchCp!=null
					&&!"".equals(searchCp)){
				sqlCondition += " and "+key + " = ? ";
				listCondition.add(searchCp);
			}
			if(edate!=null
					&&!"".equals(edate)){
				sqlCondition += "and Edate > ? ";
				listCondition.add(edate);
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


		public List<ExcelFile> search(String page, String rows, Map<String, String> map) {
			// TODO Auto-generated method stub
			int	beginIndex = Integer.parseInt(page);					
			int	max = Integer.parseInt(rows);
			String searchCp = (String) map.get("value");
			String key = (String) map.get("key");
			//定义sql语句
			String sql = "select distinct * from ExcelFile [where]";
			String sqlCondition = "";
			List listCondition = new ArrayList();
			/*System.out.println(status.getGroup_name());
			System.out.println(status.getJstatus());*/
			if(searchCp!=null
					&&!"".equals(searchCp)){
				sqlCondition += " and "+key + " = ? ";
				listCondition.add(searchCp);
			}
			
			sqlCondition = sqlCondition.replaceFirst("and", "where");
			
			//通过sqlcondition去替换掉占位符
			sql = sql.replace("[where]", sqlCondition);
			System.out.println(sql);
			Query query = getSession().createSQLQuery(sql).addEntity(ExcelFile.class);
			for (int i = 0; i < listCondition.size(); i++) {
				System.out.println(listCondition.get(i));
				query.setParameter(i, listCondition.get(i));
			}
			query.setFirstResult((beginIndex-1)*max);
			query.setMaxResults(max);
			return query.list();
		}
		
		public int searchallPc(Map map){
			String sql = "select count(*) from ExcelFile [where]";
			String sqlCondition = "";
			List listCondition = new ArrayList();
			String searchCp = (String) map.get("value");
			String key = (String) map.get("key");
			if(searchCp!=null
					&&!"".equals(searchCp)){
				sqlCondition += " and "+key + " = ? ";
				listCondition.add(searchCp);
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
		
		public List<ExcelFile> searchByName(String name){
			String sql = "from ExcelFile where Ename=:name";
			Query query = getSession().createQuery(sql).setParameter("name", name);
			return query.list();
		}
}
