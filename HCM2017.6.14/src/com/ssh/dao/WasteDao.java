package com.ssh.dao;

import java.util.List;

import com.ssh.entity.Waste;

/**
 * ������
 * @author Administrator
 *
 */

public interface WasteDao {
	List<Waste> selectAlljt(); 
	List<Waste> selectByZsAndWname(String Wname); 
}
