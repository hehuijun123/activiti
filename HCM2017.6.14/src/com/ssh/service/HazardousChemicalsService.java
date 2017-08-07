package com.ssh.service;

import java.util.List;

import com.ssh.entity.HazardousChemicals;

public interface HazardousChemicalsService {
	public List<HazardousChemicals> search(String page, String rows);//条件查询所有
	public List<HazardousChemicals> searchHC(String str);//条件查询所有
	public void save(HazardousChemicals waste);//添加
	public void update(HazardousChemicals waste);//更新
	public void delete(Long id);//删除
	public HazardousChemicals select(Long id);//根据ID查询
	public HazardousChemicals selectByNum(String num);//根据ID查询
	public int selectall();
	List<HazardousChemicals> searchAll();
	List<HazardousChemicals> searchs();
}
