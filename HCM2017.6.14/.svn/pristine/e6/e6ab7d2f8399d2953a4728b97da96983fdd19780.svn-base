package com.ssh.service;

import java.util.List;
import java.util.Map;

import com.ssh.entity.Emergency;
import com.ssh.entity.rulee;

public interface EmergencyService {
	public List<Emergency> search(String page, String rows,String role,String work);//条件查询所有
	public void save(Emergency waste);//添加
	public void saveRule(rulee waste);//添加
	public void update(Emergency waste);//更新
	public void delete(Long id);//删除
	public Emergency select(Long id);//根据ID查询
	public rulee selectRule(Long id);//根据ID查询
	public List<rulee> searchRule(String page, String rows);//条件查询所有
	public int selectallRule();
	public int selectall(Map map);
	void deleteRule(Long id);
	List<Emergency> selectjt();
	List<String> selectzs();
	List<String> selectsc(String id);
	List<Emergency> selectyj(String id);
}
