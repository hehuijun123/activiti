package com.ssh.service;

import java.util.List;
import java.util.Map;

import com.ssh.entity.Emergency;
import com.ssh.entity.rulee;

public interface EmergencyService {
	public List<Emergency> search(String page, String rows,String role,String work);//������ѯ����
	public void save(Emergency waste);//���
	public void saveRule(rulee waste);//���
	public void update(Emergency waste);//����
	public void delete(Long id);//ɾ��
	public Emergency select(Long id);//����ID��ѯ
	public rulee selectRule(Long id);//����ID��ѯ
	public List<rulee> searchRule(String page, String rows);//������ѯ����
	public int selectallRule();
	public int selectall(Map map);
	void deleteRule(Long id);
	List<Emergency> selectjt();
	List<String> selectzs();
	List<String> selectsc(String id);
	List<Emergency> selectyj(String id);
}
