package com.ssh.service;

import java.util.List;

import com.ssh.entity.Storage;

public interface StorageService {
	public List<Storage> search(String page, String rows);//条件查询所有
	public void save(Storage waste);//添加
	public void update(Storage waste);//更新
	public void delete(Long id);//删除
	public Storage select(Long id);//根据ID查询
	public int selectall();

}
