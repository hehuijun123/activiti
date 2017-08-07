package com.ssh.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.dao.RoleDao;
import com.ssh.entity.Role;
import com.ssh.service.RoleService;
@Transactional
@Service
public class RoleServiceImpl implements RoleService {
	@Resource
	private RoleDao roleDao;
	@Override
	public List<Role> select() {
		// TODO Auto-generated method stub
		return roleDao.select();
	}

	@Override
	public Role selectById(Long id) {
		// TODO Auto-generated method stub
		return roleDao.selectById(id);
	}
	
	@Override
	public Role selectByName(String name) {
		// TODO Auto-generated method stub
		return roleDao.selectByName(name);
	}

}
