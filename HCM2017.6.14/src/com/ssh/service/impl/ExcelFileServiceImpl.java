package com.ssh.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.ssh.dao.impl.ExcelFileDaoImpl;
import com.ssh.entity.ExcelFile;
import com.ssh.service.ExcelFileService;

@Transactional
@Service
public class ExcelFileServiceImpl implements ExcelFileService {

	@Resource
	private ExcelFileDaoImpl excelFileDaoImpl;
	@Override
	public List<ExcelFile> select(String page, String rows,String edate,Map map) {
		// TODO Auto-generated method stub
		return excelFileDaoImpl.searchPc(page,rows,edate,map);
	}

	@Override
	public int selectall(String edate,Map map) {
		// TODO Auto-generated method stub
		return excelFileDaoImpl.selectallPc(edate,map);
	}

	@Override
	public void save(ExcelFile excelFile) {
		// TODO Auto-generated method stub
		excelFileDaoImpl.save(excelFile);
		
	}

	@Override
	public List<ExcelFile> search(String page, String rows, Map map) {
		// TODO Auto-generated method stub
		
		return excelFileDaoImpl.search(page,rows,map);
	}
	
	@Override
	public List<ExcelFile> searchByName(String name) {
		// TODO Auto-generated method stub
		
		return excelFileDaoImpl.searchByName(name);
	}
	@Override
	public int searchAll(Map map) {
		// TODO Auto-generated method stub
		return excelFileDaoImpl.searchallPc(map);
	}
	
	
}
