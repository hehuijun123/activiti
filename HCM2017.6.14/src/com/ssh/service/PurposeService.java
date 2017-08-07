package com.ssh.service;

import java.util.List;
import java.util.Map;

import com.ssh.entity.Purpose;

public interface PurposeService {
	public List<Purpose> search(String page, String rows,String work);//条件查询所有
	public void save(Purpose waste,String work);//添加
	public void update(Purpose waste);//更新
	public void delete(Long id);//删除
	public Purpose select(Long id);//根据ID查询
	public int selectall(String work);
	public List<Purpose> searchPc(String page, String rows,String psdate,String pedate,Map map);//条件查询
	public int selectallPc(String psdate,String pedate,Map map);
	List<Purpose> selectOrder();
}
