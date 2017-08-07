package com.ssh.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.ssh.ecxel.model.HazardousChemicalsExcel;
@Repository
public class ExcelModelDaoImpl extends BaseDaoImpl<HazardousChemicalsExcel> {
	
	//查询危化物类型
	public List<String> selectType(){
		String sql = " select Htype from HazardousChemicalsExcel group by Htype";
		Query query = getSession().createSQLQuery(sql);
		return query.list();
	}
	
	//查询所有危化物
	public List<HazardousChemicalsExcel> select(){
		String sql = "from HazardousChemicalsExcel";
		Query query = getSession().createQuery(sql);
		return query.list();
	}
	//查询出所有危化物，分类，遍历危化物，
	public List<HazardousChemicalsExcel> selectByName(String name){
		String sql = "from HazardousChemicalsExcel where name =:name";
		Query query = getSession().createQuery(sql).setParameter("name", name);
		return query.list();
	}
	//根据类型查询危化物
	public List<HazardousChemicalsExcel> selectByType(String type){
		String sql = "from HazardousChemicalsExcel where Htype =:type";
		Query query = getSession().createQuery(sql).setParameter("type",type);
		return query.list();
	}
}
