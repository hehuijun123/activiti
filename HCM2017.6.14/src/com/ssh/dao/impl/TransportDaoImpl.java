package com.ssh.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.ssh.dao.TransportDao;
import com.ssh.entity.Emergency;
import com.ssh.entity.Purpose;
import com.ssh.entity.Transport;
@Repository
public class TransportDaoImpl extends BaseDaoImpl<Transport> implements TransportDao {
	public List<Transport> select(String page, String rows,String work){
		System.out.println("-----------");
		int beginIndex = Integer.parseInt(page);
		int max = Integer.parseInt(rows);
		String sql = "from Transport  where Twork =:work";
		Query query = getSession().createQuery(sql).setParameter("work", work);
		query.setFirstResult((beginIndex-1)*max);
		query.setMaxResults(max);
		return query.list();
		
	}
	public int selectall(String work){
		String sql = "select count(*) from Transport  where Twork =:work";
		Query query = getSession().createSQLQuery(sql).setParameter("work", work);
		int result = (int) query.uniqueResult();
		return result;	
	}
	
	//条件查询
			public List<Transport> searchPc(String page, String rows,String psdate,String pedate,String searchNum,Map map){
				int	beginIndex = Integer.parseInt(page);					
				int	max = Integer.parseInt(rows);
				String searchCp = (String) map.get("value");
				String key = (String) map.get("key");
				//定义sql语句
				String sql = "select * from Transport [where]";
				String sqlCondition = "";
				List listCondition = new ArrayList();
				/*System.out.println(status.getGroup_name());
				System.out.println(status.getJstatus());*/
				if(searchNum!=null
						&&!"".equals(searchNum)){
					sqlCondition += "and Tnum = ? ";
					listCondition.add(searchNum);
				}
				if(psdate!=null
						&&!"".equals(psdate)){
					sqlCondition += "and Tdate > ? ";
					listCondition.add(psdate);
				}
				if(pedate!=null
						&&!"".equals(pedate)){
					sqlCondition += "and Tdate < ? ";
					listCondition.add(pedate);
				}
				if(searchCp!=null
						&&!"".equals(searchCp)){
					sqlCondition += " and "+key + " = ? ";
					listCondition.add(searchCp);
				}
				sqlCondition = sqlCondition.replaceFirst("and", "where");
				
				//通过sqlcondition去替换掉占位符
				sql = sql.replace("[where]", sqlCondition);
				System.out.println(sql);
				Query query = getSession().createSQLQuery(sql).addEntity(Transport.class);
				for (int i = 0; i < listCondition.size(); i++) {
					System.out.println(listCondition.get(i));
					query.setParameter(i, listCondition.get(i));
				}
				query.setFirstResult((beginIndex-1)*max);
				query.setMaxResults(max);
				return query.list();
				
			}
			public int selectallPc(String psdate,String pedate,String searchNum,Map map){
				String sql = "select count(*) from Transport [where]";
				String sqlCondition = "";
				String searchCp = (String) map.get("value");
				String key = (String) map.get("key");
				List listCondition = new ArrayList();
				if(searchNum!=null
						&&!"".equals(searchNum)){
					sqlCondition += "and Tnum > ? ";
					listCondition.add(searchNum);
				}
					if(psdate!=null
							&&!"".equals(psdate)){
						sqlCondition += "and Tdate > ? ";
						listCondition.add(psdate);
					}
					if(pedate!=null
							&&!"".equals(pedate)){
						sqlCondition += "and Tdate < ? ";
						listCondition.add(pedate);
					}
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
}
