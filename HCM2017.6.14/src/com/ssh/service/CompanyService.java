package com.ssh.service;

import java.util.List;

import com.ssh.entity.Company;
import com.ssh.entity.GsCompany;
import com.ssh.entity.HazardousChemicals;
import com.ssh.entity.ScCompany;

public interface CompanyService {
	public List<ScCompany> search(String page, String rows);//������ѯ����
	public void save(Company waste);//���
	public void update(Company waste);//����
	public void delete(Long id);//ɾ��
	public Company select(Long id);//����ID��ѯ
	public int selectall();
	public List<Company> searchHC(String str);//������ѯ����
	public List<String> selectGs();//��ѯ��˾�б�
	public List<ScCompany> search();
	List<ScCompany> searchId(String id,String page,String rows);
	List<ScCompany> searchZs();
	List<ScCompany> searchSc(String name);
	List<ScCompany> searchScSelf(String name);
	List<ScCompany> searchScDetail(String id);

}
