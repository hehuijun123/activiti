package com.ssh.service;

import java.util.List;

import com.ssh.entity.Company;
import com.ssh.entity.HazardousChemicals;
import com.ssh.entity.Image;
import com.ssh.entity.Position;

public interface PositionService {
	public Position selectByNum(String str);//����ID��ѯ
	public List<Position> selectByWork(String str);//������ѯ����
	Image selectByImage(String str);

}
