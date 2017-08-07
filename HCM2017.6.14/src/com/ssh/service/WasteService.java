package com.ssh.service;

import java.util.List;
import java.util.Map;

import com.ssh.entity.Purpose;
import com.ssh.entity.Waste;
import com.ssh.entity.WasteJt;

public interface WasteService {
	public List<Waste> search(String page, String rows,String work);//������ѯ����
	public void save(Waste waste);//���
	public void update(Waste waste);//����
	public void delete(Long id);//ɾ��
	public Waste select(Long id);//����ID��ѯ
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
