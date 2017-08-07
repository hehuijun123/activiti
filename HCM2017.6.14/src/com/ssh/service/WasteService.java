package com.ssh.service;

import java.util.List;
import java.util.Map;

import com.ssh.entity.Purpose;
import com.ssh.entity.Waste;
import com.ssh.entity.WasteJt;

public interface WasteService {
	public List<Waste> search(String page, String rows,String work);//条件查询所有
	public void save(Waste waste);//添加
	public void update(Waste waste);//更新
	public void delete(Long id);//删除
	public Waste select(Long id);//根据ID查询
	public int selectall(String work);
	public List<Waste> searchPc(String page, String rows, String psdate, String pedate,Map map);
	public int selectallPc(String psdate, String pedate,Map map) ;
	public List<Waste> searchAllWastejt();
	public List<Waste> selectByZsAndWname(String Wname);
	public List<Waste> selectByScAndWname(String Wname,String Pid);
	public String selectPidByCname(String Cname);
	public List<Object> selectZongLiangJt(String page, String rows, String psdate, String pedate,Map map);
	public List<Object[]> findAllNumJt();
	public List<Object[]> findAllNumZs(String wname);
	public List<Object[]> findDetailSC(String wname,String cname);
}
