package com.ssh.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.dao.impl.ExcelModelDaoImpl;
import com.ssh.ecxel.model.HazardousChemicalsExcel;
import com.ssh.service.ExcelModelService;
@Transactional
@Service
public class ExcelModelServiceImpl implements ExcelModelService {
	@Resource
	private ExcelModelDaoImpl excelModelDaoImpl;
	//查询危化物类型
		public List<String> selectType(){
			return excelModelDaoImpl.selectType();
		}
		
		//查询所有危化物
		public List<HazardousChemicalsExcel> select(){
			return excelModelDaoImpl.select();
		}
		//查询出所有危化物，分类，遍历危化物，
		public List<HazardousChemicalsExcel> selectByName(String name){
			return excelModelDaoImpl.selectByName(name);
		}
		//根据类型查询危化物
		public List<HazardousChemicalsExcel> selectByType(String type){
			
			return excelModelDaoImpl.selectByType(type);
		}

}
