package com.ssh.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.dao.impl.CompanyDaoImpl;
import com.ssh.dao.impl.UserDaoImpl;
import com.ssh.entity.Company;
import com.ssh.entity.Consumer;
import com.ssh.entity.Tm;
import com.ssh.service.UserService;
@Transactional
@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserDaoImpl userDaoImpl;
	@Override
	public List<Consumer> search(String page, String rows) {
		// TODO Auto-generated method stub
		return userDaoImpl.select(page, rows);
	}
	public int selectall(){
		return userDaoImpl.selectall();
	}
	@Override
	public void save(Consumer company) {
		userDaoImpl.save(company);
		// TODO Auto-generated method stub
	}

	@Override
	public void update(Consumer company) {
		userDaoImpl.update(company);
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(Long id) {
		userDaoImpl.delete(id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Consumer select(Long id) {
		// TODO Auto-generated method stub
		return userDaoImpl.getById(id);
	}
	@Override
	public List<Consumer> searchHC(String str) {
		// TODO Auto-generated method stub
		return userDaoImpl.selectHC(str);
	}
	@Override
	public Consumer Login(String str) {
		// TODO Auto-generated method stub
		return userDaoImpl.login(str);
	}
	
	@Override
	public Tm Time() {
		// TODO Auto-generated method stub
		return userDaoImpl.time();
	}
	

}
