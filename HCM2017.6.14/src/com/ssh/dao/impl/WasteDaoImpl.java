package com.ssh.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.ssh.dao.WasteDao;
import com.ssh.entity.Emergency;
import com.ssh.entity.Purpose;
import com.ssh.entity.Waste;
import com.ssh.entity.WasteJt;
@Repository
public class WasteDaoImpl extends BaseDaoImpl<Waste> implements WasteDao {
	public List<Waste> select(String page, String rows,String work){
		System.out.println("-----------");
		int beginIndex = Integer.parseInt(page);
		int max = Integer.parseInt(rows);
		String sql = "from Waste where Wwork =:work";
		Query query = getSession().createQuery(sql).setParameter("work", work);
		query.setFirstResult((beginIndex-1)*max);
		query.setMaxResults(max);
		return query.list();
	}
	public int selectall(String work){
		String sql = "select count(*) from Waste where Wwork =:work";
		Query query = getSession().createSQLQuery(sql).setParameter("work", work);
		int result = (int) query.uniqueResult();
		return result;	
	}
	
	//条件查询
	public List<Waste> searchPc(String page, String rows,String psdate,String pedate,Map map){
		int	beginIndex = Integer.parseInt(page);					
		int	max = Integer.parseInt(rows);
	
		//定义sql语句
		String sql = "select * from Waste [where]";
		String sqlCondition = "";
		List listCondition = new ArrayList();
		String searchCp = (String) map.get("value");
		String key = (String) map.get("key");
		/*System.out.println(status.getGroup_name());
		System.out.println(status.getJstatus());*/
		
			if(psdate!=null
					&&!"".equals(psdate)){
				sqlCondition += "and Wdate > ? ";
				listCondition.add(psdate);
			}
			if(pedate!=null
					&&!"".equals(pedate)){
				sqlCondition += "and Wdate < ? ";
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
		Query query = getSession().createSQLQuery(sql).addEntity(Waste.class);
		for (int i = 0; i < listCondition.size(); i++) {
			System.out.println(listCondition.get(i));
			query.setParameter(i, listCondition.get(i));
		}
		query.setFirstResult((beginIndex-1)*max);
		query.setMaxResults(max);
		return query.list();
		
	}
	public int selectallPc(String psdate,String pedate,Map map){
		String sql = "select count(*) from Waste [where]";
		String sqlCondition = "";
		String searchCp = (String) map.get("value");
		String key = (String) map.get("key");
		List listCondition = new ArrayList();		
			if(psdate!=null
					&&!"".equals(psdate)){
				sqlCondition += "and Wdate > ? ";
				listCondition.add(psdate);
			}
			if(pedate!=null
					&&!"".equals(pedate)){
				sqlCondition += "and Wdate < ? ";
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
	@Override
	public List<Waste> selectAlljt() {
		String sql = "select * from Waste";
		Query query = getSession().createSQLQuery(sql);
		return query.list();	
	}
	@Override
	public List<Waste> selectByZsAndWname(String Wname) {
		String sql = "select Wname,Wnum,Cname from ScCompany a,Waste b where b.zs=a.Cid and Wname=:Wname";

		Query query = getSession().createSQLQuery(sql).setParameter("Wname", Wname);
		return query.list();
	}
	
	public List<Waste> selectByScAndWname(String Wname,String Pid ) {
		String sql = "select Wname,Wnum,Wdate,Wcompany,Wperson,Wr,Cname from ScCompany a,Waste b where b.sc=a.Cid and Wname=:Wname and Pid=:Pid";
		Query query = getSession().createSQLQuery(sql).setParameter("Wname", Wname).setParameter("Pid", Pid);
		return query.list();	
	}
	public String selectPidByCname(String Cname ) {
		String sql = "select Pid from Sccompany where Cname=:Cname";
		Query query = getSession().createSQLQuery(sql).setParameter("Cname", Cname);
		String result = (String) query.uniqueResult();
		return result;	
	}
	public List<Object> selectZongLiangJt(String page, String rows,String psdate,String pedate,Map map ) {

		return null;
	}
	public List<Object[]> findAllNumJt() {
		String sql = "select Wname,sum(Wnum) as Wallnum from Waste group by Wname;";
		Query query = getSession().createSQLQuery(sql);
		return query.list();	
	}
	public List<Object[]> findAllNumzs(String wname) {
		String sql = "select name,sum(Wnum) from Waste ,Role where  Waste.zs=Role.Rid and Wname=:Wname group by name;";
		Query query = getSession().createSQLQuery(sql).setParameter("Wname", wname);
		return query.list();	
	}
	public List<Object[]> findDetailSC(String wname,String cname) {
		String sql = "select Waste.* ,name from Waste,Role where Wname=:Wname and Role.name=:Cname and Waste.zs=Role.Rid;";
		Query query = getSession().createSQLQuery(sql).setParameter("Wname", wname).setParameter("Cname", cname);
		return query.list();	
	}
	
}
