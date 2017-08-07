package com.ssh.service;

import java.util.List;

import com.ssh.entity.Company;
import com.ssh.entity.GsCompany;
import com.ssh.entity.HazardousChemicals;
import com.ssh.entity.ScCompany;

public interface CompanyService {
	public List<ScCompany> search(String page, String rows);//条件查询所有
	public void save(Company waste);//添加
	public void update(Company waste);//更新
	public void delete(Long id);//删除
	public Company select(Long id);//根据ID查询
	public int selectall();
	public List<Company> searchHC(String str);//条件查询所有
	public List<String> selectGs();//查询公司列表
	public List<ScCompany> search();
	List<ScCompany> searchId(String id,String page,String rows);
	List<ScCompany> searchZs();
	List<ScCompany> searchSc(String name);
	List<ScCompany> searchScSelf(String name);
	List<ScCompany> searchScDetail(String id);

}
