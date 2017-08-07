package com.ssh.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.ssh.dao.CompanyDao;
import com.ssh.dao.PositionDao;
import com.ssh.entity.Company;
import com.ssh.entity.HazardousChemicals;
import com.ssh.entity.Image;
import com.ssh.entity.Position;
@Repository
public class PositionDaoImpl extends BaseDaoImpl<Position> implements PositionDao {
	
	public List<Position> select(String page, String rows){
		System.out.println("-----------");
		int beginIndex = Integer.parseInt(page);
		int max = Integer.parseInt(rows);
		String sql = "from Position";
		Query query = getSession().createQuery(sql);
		query.setFirstResult((beginIndex-1)*max);
		query.setMaxResults(max);
		return query.list();		
	}
	public int selectall(){
		String sql = "select count(*) from Position";
		Query query = getSession().createSQLQuery(sql);
		int result = (int) query.uniqueResult();
		return result;	
	}
	
	public Position selectByNum(String str){
		
		String sql = "from Position where Pnum=:num";
		Query query = getSession().createQuery(sql).setParameter("num", str);
		return (Position) query.uniqueResult();
		
	}
	public List<Position> selectByWork(String str){
		
		String sql = "from Position where Pwork=:work";
		Query query = getSession().createQuery(sql).setParameter("work", str);
		return query.list();	
	}
	public Image selectByImage(String str){
		
		String sql = "from Image where Iwork=:num";
		Query query = getSession().createQuery(sql).setParameter("num", str);
		return (Image) query.uniqueResult();
		
	}
	

}
