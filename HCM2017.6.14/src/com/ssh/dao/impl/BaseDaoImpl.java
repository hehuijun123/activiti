package com.ssh.dao.impl;


import java.lang.reflect.ParameterizedType;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ssh.dao.BaseDao;

@SuppressWarnings("unchecked")
public class BaseDaoImpl<T>  implements BaseDao<T>{
	
	@Resource  //自动装配spring.xml中的sessionFactory   相当于spring的Autowired
	private SessionFactory sessionFactory = null;

	protected Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	private Class<T> clazz;
	public BaseDaoImpl(){
		//得到T的真实类型
		ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
		this.clazz = (Class<T>) pt.getActualTypeArguments()[0];
	}
	

	@Override
	public void save(T entity) {
		System.out.println("---------");
		getSession().save(entity);
		
	}

	@Override
	public void delete(Long id) {
		Object obj = getById(id);
	
		if(obj !=null){
			getSession().delete(obj);
		}
		
	}

	@Override
	public void update(T entity) {
		getSession().update(entity);
		
	}

	@Override
	public void saveOrUpdate(T entity) {
		getSession().saveOrUpdate(entity);
	
	}

	@Override
	public T getById(Long id) {
		if (id == null) {
			return null;
		} else {
			return (T) getSession().get(clazz, id);
		}
	}

	@Override
	public List<T> getByIds(Long[] ids) {
		if (ids == null || ids.length == 0) {
			return Collections.EMPTY_LIST;
		} else {
			return getSession().createQuery(//
					"FROM " + clazz.getSimpleName() + " WHERE id IN (:ids)")//
					.setParameterList("ids", ids)//
					.list();
		}
	}

	@Override
	public List<T> findAll() {
		return getSession().createQuery(//
				"FROM " + clazz.getSimpleName())//
				.list();
	}


	@Override
	public int showAllCount() {
		String HQL = "select count(*) from "+clazz.getSimpleName();
		Query query = getSession().createQuery(HQL);
		return Integer.parseInt(String.valueOf(query.list().get(0))) ;
	}

}
