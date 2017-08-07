package com.ssh.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.dao.impl.WasteDaoImpl;
import com.ssh.entity.Purpose;
import com.ssh.entity.Waste;
import com.ssh.entity.WasteJt;
import com.ssh.service.WasteService;
@Transactional
@Service
public class WasteServiceImpl implements WasteService {
	@Resource
	private WasteDaoImpl wasteDaoImpl;
	@Override
	public List<Waste> search(String page, String rows,String work) {
		// TODO Auto-generated method stub
		return wasteDaoImpl.select(page, rows,work);
	}

	@Override
	public void save(Waste waste) {
		// TODO Auto-generated method stub
		wasteDaoImpl.save(waste);

	}

	@Override
	public void update(Waste waste) {
		// TODO Auto-generated method stub
		wasteDaoImpl.update(waste);

	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		wasteDaoImpl.delete(id);

	}

	@Override
	public Waste select(Long id) {
		// TODO Auto-generated method stub
		return wasteDaoImpl.getById(id);
	}

	@Override
	public int selectall(String work) {
		// TODO Auto-generated method stub
		return wasteDaoImpl.selectall(work);
	}
	@Override
	public List<Waste> searchPc(String page, String rows, String psdate, String pedate,Map map) {
		// TODO Auto-generated method stub
		return wasteDaoImpl.searchPc(page, rows, psdate, pedate,map);
	}

	@Override
	public int selectallPc(String psdate, String pedate,Map map) {
		// TODO Auto-generated method stub
		return wasteDaoImpl.selectallPc(psdate, pedate,map);
	}

	@Override
	public List<Waste> searchAllWastejt() {
		return wasteDaoImpl.selectAlljt();
	}

	@Override
	public List<Waste> selectByZsAndWname(String Wname) {
		// TODO Auto-generated method stub
		return wasteDaoImpl.selectByZsAndWname(Wname);
	}

	@Override
	public List<Waste> selectByScAndWname(String Wname,String Pid) {
		// TODO Auto-generated method stub
		return wasteDaoImpl.selectByScAndWname(Wname, Pid);
	}

	@Override
	public String selectPidByCname(String Cname) {
		// TODO Auto-generated method stub
		return wasteDaoImpl.selectPidByCname(Cname);
	}

	@Override
	public List<Object> selectZongLiangJt(String page, String rows, String psdate, String pedate, Map map) {
		// TODO Auto-generated method stub
		return wasteDaoImpl.selectZongLiangJt(page, rows, psdate, pedate, map);
	}

	@Override
	public List<Object[]> findAllNumJt() {
		// TODO Auto-generated method stub
		return wasteDaoImpl.findAllNumJt();
	}

	@Override
	public List<Object[]> findAllNumZs(String wname) {
		// TODO Auto-generated method stub
		return wasteDaoImpl.findAllNumzs(wname);
	}

	@Override
	public List<Object[]> findDetailSC(String wname, String cname) {
		// TODO Auto-generated method stub
		return wasteDaoImpl.findDetailSC(wname, cname);
	}

}
