package com.ssh.service;

import java.util.List;

import com.ssh.entity.HazardousChemicals;

public interface HazardousChemicalsService {
	public List<HazardousChemicals> search(String page, String rows);//������ѯ����
	public List<HazardousChemicals> searchHC(String str);//������ѯ����
	public void save(HazardousChemicals waste);//���
	public void update(HazardousChemicals waste);//����
	public void delete(Long id);//ɾ��
	public HazardousChemicals select(Long id);//����ID��ѯ
	public HazardousChemicals selectByNum(String num);//����ID��ѯ
	public int selectall();
	List<HazardousChemicals> searchAll();
	List<HazardousChemicals> searchs();
}
