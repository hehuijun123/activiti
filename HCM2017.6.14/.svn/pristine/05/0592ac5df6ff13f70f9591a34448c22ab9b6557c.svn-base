package com.ssh.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.dao.impl.TransportDaoImpl;
import com.ssh.entity.Purpose;
import com.ssh.entity.Transport;
import com.ssh.service.TransportService;
@Transactional
@Service
public class TransportServiceImpl implements TransportService {
	@Resource
	private TransportDaoImpl transportDaoImpl;
	@Override
	public List<Transport> search(String page, String rows,String work) {
		// TODO Auto-generated method stub
		return transportDaoImpl.select(page, rows,work);
	}

	@Override
	public void save(Transport transport) {
		// TODO Auto-generated method stub
		transportDaoImpl.save(transport);

	}

	@Override
	public void update(Transport transport) {
		// TODO Auto-generated method stub
		transportDaoImpl.update(transport);

	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		System.out.println("------------zcm");
		transportDaoImpl.delete(id);

	}

	@Override
	public Transport select(Long id) {
		// TODO Auto-generated method stub
		return transportDaoImpl.getById(id);
	}

	@Override
	public int selectall(String work) {
		// TODO Auto-generated method stub
		return transportDaoImpl.selectall(work);
	}
	@Override
	public List<Transport> searchPc(String page, String rows, String psdate, String pedate,String searchNum,Map map) {
		// TODO Auto-generated method stub
		return transportDaoImpl.searchPc(page, rows, psdate, pedate,searchNum,map);
	}

	@Override
	public int selectallPc(String psdate, String pedate,String searchNum,Map map) {
		// TODO Auto-generated method stub
		return transportDaoImpl.selectallPc(psdate, pedate,searchNum,map);
	}

}
