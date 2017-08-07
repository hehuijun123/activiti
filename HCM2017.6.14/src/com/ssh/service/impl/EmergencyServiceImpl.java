package com.ssh.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.dao.impl.EmergencyDaoImpl;
import com.ssh.entity.Emergency;
import com.ssh.entity.rulee;
import com.ssh.service.EmergencyService;
@Transactional
@Service
public class EmergencyServiceImpl implements EmergencyService {
	@Resource
	private EmergencyDaoImpl emergencyDaoImpl;
	@Override
	public List<Emergency> search(String page, String rows,String role,String work) {
		// TODO Auto-generated method stub
		return emergencyDaoImpl.selectEmergency(page,rows,role,work);
	}

	@Override
	public void save(Emergency emergency) {
		// TODO Auto-generated method stub
		emergencyDaoImpl.save(emergency);
		
	}
	

	@Override
	public void update(Emergency emergency) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteRule(Long id) {
		// TODO Auto-generated method stub
		emergencyDaoImpl.deleteRule(id);
		
	}
	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		emergencyDaoImpl.delete(id);
		
	}

	@Override
	public Emergency select(Long id) {
		// TODO Auto-generated method stub
		return emergencyDaoImpl.selectEmergency(id);
	}

	@Override
	public int selectall(Map map) {
		// TODO Auto-generated method stub
		return emergencyDaoImpl.selectall(map);
	}

	@Override
	public void saveRule(rulee waste) {
		// TODO Auto-generated method stub
		emergencyDaoImpl.saveRule(waste);
		
	}

	@Override
	public rulee selectRule(Long id) {
		// TODO Auto-generated method stub
		return emergencyDaoImpl.selectRule(id);
	}

	@Override
	public List<rulee> searchRule(String page, String rows) {
		// TODO Auto-generated method stub
		return emergencyDaoImpl.selectRule(page, rows);
	}

	@Override
	public int selectallRule() {
		// TODO Auto-generated method stub
		return emergencyDaoImpl.selectallRule();
	}
	@Override
	public List<Emergency> selectjt() {
		// TODO Auto-generated method stub
		return emergencyDaoImpl.selectjt();
	}
	@Override
	public List<String> selectzs() {
		// TODO Auto-generated method stub
		return emergencyDaoImpl.selectzs();
	}
	@Override
	public List<String> selectsc(String id) {
		// TODO Auto-generated method stub
		return emergencyDaoImpl.selectsc(id);
	}


	@Override
	public List<Emergency> selectyj(String id) {
		// TODO Auto-generated method stub
		return emergencyDaoImpl.selectyj(id);
	}
}
