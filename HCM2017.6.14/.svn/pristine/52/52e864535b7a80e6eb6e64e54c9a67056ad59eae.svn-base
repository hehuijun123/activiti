package com.ssh.service;

import java.util.List;
import java.util.Map;

import com.ssh.entity.Purchase;
import com.ssh.entity.Storehouse;
import com.ssh.entity.Temporary;
import com.ssh.entity.ZS;

public interface storagehouseService {

	List<Storehouse> search(String page, String rows);

	void save(Storehouse purchase);

	void update(Storehouse purchase);

	void delete(Long id);

	Storehouse select(Long id);

	int selectall();

	List<Storehouse> searchPc(String page, String rows, String psdate, String searchCp, String work);

	int selectallPc(String psdate, String searchCp, String work);

	List<Temporary> searchAllPc(String page, String rows, String psdate,Map map, String searchCp);

	int selectAllPc(String psdate, Map map, String searchCp);

	List selectSize();

	List<Storehouse> searchExcel(String str);


	List selectExcel(String date, String work);

	List selectSizeByName();

	List<Storehouse> searchExcelByJt(String str,String date);
	List<Storehouse> searchExcelByJtAndWork(String str);
	List<Storehouse> selectDetail(String name,String date,String work,String flax);

	List<ZS> searchAllZS(String page, String rows, String psdate, Map map, String searchCp);

	List<Storehouse> searchOrder();
	
}
