package com.ssh.dao;

import java.util.List;

public interface BaseDao<T> {
	/*
	 * 保存实体
	 */
	  public  void save(T entity);
	  /*
	   * 删除实体
	   * @param id
	   */
	  public  void delete(Long id);
	  /*
	   * 更新实体
	   */
	  public void update(T entity);
	  /*
	   * 保存或�?�更�?
	   */
	  public  void saveOrUpdate(T entity);
	  /*
	   * 按Id查询
	   */
	  public T getById(Long id);
	  /*
	   * 按照Ids查询
	   */
	  public  List<T> getByIds(Long[] ids);
	  /*
	   * 查询�?�?
	   */
	  public  List<T> findAll();
	  
	  /*
	   * 分页相关的方�?
	   */
       public int showAllCount();

	
	
}
