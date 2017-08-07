package com.ssh.service;

import java.util.List;
import java.util.Map;

import com.ssh.entity.ExcelFile;
import com.ssh.entity.Purchase;

public interface ExcelFileService {

	List<ExcelFile> select(String page, String rows, String edate, Map map);

	int selectall(String edate, Map map);
	public void save(ExcelFile excelFile);//Ìí¼Ó

	List<ExcelFile> search(String page, String rows, Map chooseWorkAndKey);

	int searchAll( Map map);

	List<ExcelFile> searchByName(String name);

	
}
