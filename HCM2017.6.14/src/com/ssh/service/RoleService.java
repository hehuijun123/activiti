package com.ssh.service;

import java.util.List;

import com.ssh.entity.Role;

public interface RoleService {
	
	List<Role> select();
	Role selectById(Long id);
	Role selectByName(String name);

}
