package com.ssh.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.dao.impl.HazardousChemicalsDaoImpl;
import com.ssh.entity.HazardousChemicals;
import com.ssh.service.HazardousChemicalsService;
@Transactional
@Service
public class HazardousChemicalsServiceImpl implements HazardousChemicalsService {
	@Resource
	private HazardousChemicalsDaoImpl hazardousChemicalsDaoImpl;
	@Override
	public List<HazardousChemicals> search(String page, String rows) {
		// TODO Auto-generated method stub
		return hazardousChemicalsDaoImpl.select(page, rows);
	}
	
	@Override
	public List<HazardousChemicals> searchAll() {
		// TODO Auto-generated method stub
		return hazardousChemicalsDaoImpl.selectOrder();
	}
	

	@Override
	public void save(HazardousChemicals waste) {
		// TODO Auto-generated method stub
		hazardousChemicalsDaoImpl.save(waste);

	}

	@Override
	public void update(HazardousChemicals waste) {
		// TODO Auto-generated method stub
		hazardousChemicalsDaoImpl.update(waste);

	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		hazardousChemicalsDaoImpl.delete(id);

	}

	@Override
	public HazardousChemicals select(Long id) {
		// TODO Auto-generated method stub
		return hazardousChemicalsDaoImpl.getById(id);
	}

	@Override
	public int selectall() {
		// TODO Auto-generated method stub
		return hazardousChemicalsDaoImpl.selectall();
	}


	@Override
	public List<HazardousChemicals> searchHC(String str) {
		// TODO Auto-generated method stub
		return hazardousChemicalsDaoImpl.selectHC(str);
	}


	@Override
	public HazardousChemicals selectByNum(String num) {
		// TODO Auto-generated method stub
		return hazardousChemicalsDaoImpl.selectHCByNum(num);
	}

	@Override
	public List<HazardousChemicals> searchs() {
		// TODO Auto-generated method stub
		return hazardousChemicalsDaoImpl.selects();
	}

}
