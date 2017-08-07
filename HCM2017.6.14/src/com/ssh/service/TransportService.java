package com.ssh.service;

import java.util.List;
import java.util.Map;

import com.ssh.entity.Purpose;
import com.ssh.entity.Transport;

public interface TransportService {
	public List<Transport> search(String page, String rows,String work);//������ѯ����
	public void save(Transport waste);//���
	public void update(Transport waste);//����
	public void delete(Long id);//ɾ��
	public Transport select(Long id);//����ID��ѯ
	public int selectall(String work);
	public List<Transport> searchPc(String page, String rows, String psdate, String pedate,String searchNum,Map map);
	public int selectallPc(String psdate, String pedate,String searchNum,Map map);
}
