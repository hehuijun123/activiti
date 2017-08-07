package com.ssh.service;

import java.util.List;
import java.util.Map;

import com.ssh.entity.Logg;
import com.ssh.entity.Logs;

public interface LogService {
	public List<Logg> search(String page, String rows);//查询所有
	public void save(Logg waste);//添加
	public void update(Logg waste);//更新
	public void delete(Long id);//删除
	public Logg select(Long id);//根据ID查询
	public int selectall();
	public List<Logg> searchPc(String page, String rows,String psdate,String pedate,String str);//条件查询
	public int selectallPc(String psdate,String pedate,String str);
	List<Logs> selectOrder();
}
