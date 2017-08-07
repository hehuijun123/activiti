package com.ssh.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.dao.impl.CompanyDaoImpl;
import com.ssh.dao.impl.PositionDaoImpl;
import com.ssh.entity.Company;
import com.ssh.entity.Image;
import com.ssh.entity.Position;
import com.ssh.service.CompanyService;
import com.ssh.service.PositionService;
@Transactional
@Service
public class PositionServiceImpl implements PositionService {
	@Resource
	private PositionDaoImpl positionDaoImpl;

	@Override
	public Position selectByNum(String str) {
		// TODO Auto-generated method stub
		return positionDaoImpl.selectByNum(str);
	}

	@Override
	public List<Position> selectByWork(String str) {
		// TODO Auto-generated method stub
		return positionDaoImpl.selectByWork(str);
	}
	@Override
	public Image selectByImage(String str) {
		// TODO Auto-generated method stub
		return positionDaoImpl.selectByImage(str);
	}

	

}
