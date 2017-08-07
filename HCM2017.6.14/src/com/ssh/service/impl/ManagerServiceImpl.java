package com.ssh.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.dao.ManagerDao;
import com.ssh.entity.Manager;
import com.ssh.service.ManagerService;
@Transactional
@Service
public class ManagerServiceImpl implements ManagerService {
	@Resource
	private ManagerDao managerDaoImpl;
	@Override
	public Manager select(String str) {
		// TODO Auto-generated method stub
		return managerDaoImpl.select(str);
	}

}
