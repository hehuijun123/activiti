package com.ssh.service;

import java.util.List;

import com.ssh.entity.Storage;

public interface StorageService {
	public List<Storage> search(String page, String rows);//������ѯ����
	public void save(Storage waste);//���
	public void update(Storage waste);//����
	public void delete(Long id);//ɾ��
	public Storage select(Long id);//����ID��ѯ
	public int selectall();

}
