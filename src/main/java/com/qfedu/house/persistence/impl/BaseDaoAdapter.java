package com.qfedu.house.persistence.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.qfedu.house.persistence.BaseDao;

public abstract class BaseDaoAdapter<E, K extends Serializable> implements BaseDao<E, K> {
	private Class<E> entityType;
	private String entityName;
	@Autowired
	protected SessionFactory sessionFactory;

	protected BaseDaoAdapter() {
		ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
		entityType = (Class<E>) pt.getActualTypeArguments()[0];
		entityName = entityType.getSimpleName();
	}

	@Override
	public K save(E entity) {
		// TODO Auto-generated method stub
		return (K) sessionFactory.getCurrentSession().save(entity);
	}

	@Override
	public boolean deleteById(K id) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("delete from " + entityName + " as o where o.id=:id")
				.setParameter("id", id).executeUpdate() == 1;
	}

	@Override
	public void update(E entity) {
		sessionFactory.getCurrentSession().merge(entity);

	}

	@Override
	public E findById(K id) {
		return sessionFactory.getCurrentSession().get(entityType, id);
	}

	@Override
	public List<E> findAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from " + entityName).getResultList();
	}

	@Override
	public void delete(E entity) {
		sessionFactory.getCurrentSession().delete(entity);

	}
    //我自己添加的方法
	@Override
	public List<E> findByName(String name) {
		return  sessionFactory.getCurrentSession()
				.createQuery("from "+entityName+" as e where e.name=:name",entityType)
				.setParameter("name",name)
				.getResultList();
	}
	

}
