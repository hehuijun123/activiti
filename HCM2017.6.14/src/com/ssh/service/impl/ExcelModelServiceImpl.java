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
	//��ѯΣ��������
		public List<String> selectType(){
			return excelModelDaoImpl.selectType();
		}
		
		//��ѯ����Σ����
		public List<HazardousChemicalsExcel> select(){
			return excelModelDaoImpl.select();
		}
		//��ѯ������Σ������࣬����Σ���
		public List<HazardousChemicalsExcel> selectByName(String name){
			return excelModelDaoImpl.selectByName(name);
		}
		//�������Ͳ�ѯΣ����
		public List<HazardousChemicalsExcel> selectByType(String type){
			
			return excelModelDaoImpl.selectByType(type);
		}

}
