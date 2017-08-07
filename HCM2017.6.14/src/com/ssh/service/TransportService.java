package com.ssh.service;

import java.util.List;
import java.util.Map;

import com.ssh.entity.Purpose;
import com.ssh.entity.Transport;

public interface TransportService {
	public List<Transport> search(String page, String rows,String work);//条件查询所有
	public void save(Transport waste);//添加
	public void update(Transport waste);//更新
	public void delete(Long id);//删除
	public Transport select(Long id);//根据ID查询
	public int selectall(String work);
	public List<Transport> searchPc(String page, String rows, String psdate, String pedate,String searchNum,Map map);
	public int selectallPc(String psdate, String pedate,String searchNum,Map map);
}
