package com.ssh.service;

import java.util.List;
import java.util.Map;

import com.ssh.entity.Logg;
import com.ssh.entity.Logs;

public interface LogService {
	public List<Logg> search(String page, String rows);//��ѯ����
	public void save(Logg waste);//���
	public void update(Logg waste);//����
	public void delete(Long id);//ɾ��
	public Logg select(Long id);//����ID��ѯ
	public int selectall();
	public List<Logg> searchPc(String page, String rows,String psdate,String pedate,String str);//������ѯ
	public int selectallPc(String psdate,String pedate,String str);
	List<Logs> selectOrder();
}
