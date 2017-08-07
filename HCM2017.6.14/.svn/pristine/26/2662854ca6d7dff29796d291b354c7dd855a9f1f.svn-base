package com.ssh.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.dao.impl.CompanyDaoImpl;
import com.ssh.entity.Company;
import com.ssh.entity.GsCompany;
import com.ssh.entity.ScCompany;
import com.ssh.service.CompanyService;
@Transactional
@Service
public class CompanyServiceImpl implements CompanyService {
	@Resource
	private CompanyDaoImpl companyDaoImpl;
	@Override
	public List<ScCompany> search(String page, String rows) {
		// TODO Auto-generated method stub
		System.out.println("------------------");	
		return companyDaoImpl.select(page, rows);
	}
	public int selectall(){
		return companyDaoImpl.selectall();
	}
	@Override
	public void save(Company company) {
		companyDaoImpl.save(company);
		// TODO Auto-generated method stub
	}

	@Override
	public void update(Company company) {
		companyDaoImpl.update(company);
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(Long id) {
		companyDaoImpl.delete(id);
		// TODO Auto-generated method stub
	}

	@Override
	public Company select(Long id) {
		// TODO Auto-generated method stub
		return companyDaoImpl.getById(id);
	}
	@Override
	public List<Company> searchHC(String str) {
		// TODO Auto-generated method stub
		return companyDaoImpl.selectHC(str);
	}
	@Override
	public List<String> selectGs() {
		// TODO Auto-generated method stub
		return companyDaoImpl.selectGs();
	}
	
	@Override
	public List<ScCompany> search() {
		// TODO Auto-generated method stub
		List<String> list = selectGs();
		System.out.println("list---"+list.size());
		List<ScCompany> listSc  = new ArrayList<ScCompany>();
		List<ScCompany> listZs = new ArrayList<ScCompany>();
		for(String s:list){
			ScCompany scCompany = companyDaoImpl.searchGsId(s);
			System.out.println("scCompany---"+scCompany.getCname());
			listSc = companyDaoImpl.searchGs(s);
			listZs.add(scCompany);
		}
		System.out.println("listZs---"+listZs.size());
		return listZs;
	}
	
	@Override
	public List<ScCompany> searchZs() {
		// TODO Auto-generated method stub
		List<String> list = selectGs();
		//List<ScCompany> listSc  = new ArrayList<ScCompany>();
		List<ScCompany> listZs = new ArrayList<ScCompany>();
		for(String s:list){
			ScCompany scCompany = companyDaoImpl.searchGsId(s);
			//listSc = companyDaoImpl.searchGs(s);
			
			listZs.add(scCompany);
		}
		return listZs;
	}
	
	
	@Override
	public List<ScCompany> searchSc(String name) {
		// TODO Auto-generated method stub
		//List<String> list = selectGs();
		//List<ScCompany> listSc  = new ArrayList<ScCompany>();
		List<ScCompany> listZs = new ArrayList<ScCompany>();	
		ScCompany scCompany = companyDaoImpl.searchSc(name);
			//listSc = companyDaoImpl.searchGs(s);
		listZs = companyDaoImpl.searchGs(String.valueOf(scCompany.getCid()));
		return listZs;
	}
	@Override
	public List<ScCompany> searchScDetail(String id) {
		// TODO Auto-generated method stub
		//List<String> list = selectGs();
		//List<ScCompany> listSc  = new ArrayList<ScCompany>();
		List<ScCompany> listZs = new ArrayList<ScCompany>();	
		//ScCompany scCompany = companyDaoImpl.searchSc(name);
			//listSc = companyDaoImpl.searchGs(s);
		listZs = companyDaoImpl.searchGs(String.valueOf(id));
		return listZs;
	}
	@Override
	public List<ScCompany> searchScSelf(String name) {
		// TODO Auto-generated method stub
		//List<String> list = selectGs();
		//List<ScCompany> listSc  = new ArrayList<ScCompany>();
		List<ScCompany> listZs = new ArrayList<ScCompany>();	
		ScCompany scCompany = companyDaoImpl.searchSc(name);
			//listSc = companyDaoImpl.searchGs(s);
		listZs.add(scCompany);
		return listZs;
	}
	

	@Override
	public List<ScCompany> searchId(String id,String page,String rows) {
		// TODO Auto-generated method stub
		
		List<ScCompany> listSc  = new ArrayList<ScCompany>();
		listSc = companyDaoImpl.searchGss(id,page,rows);
		return listSc;
	}

}
