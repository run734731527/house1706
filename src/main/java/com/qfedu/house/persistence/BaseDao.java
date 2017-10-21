package com.qfedu.house.persistence;

import java.io.Serializable;
import java.util.List;
/**
 * ������ɾ�Ĳ�ӿ�
 * @author Administrator
 *
 * @param <E>
 * @param <K>
 */
public interface BaseDao<E, K extends Serializable> {

	/**
	 *  ����
	 * @param entity
	 * @return
	 */
	K save(E entity);

	boolean deleteById(K id);

	void update(E entity);

	E findById(K id);

	List<E> findAll();
	
	void delete(E entity);
	 //���Լ���ӵķ���
	List<E> findByName(String name);
}
