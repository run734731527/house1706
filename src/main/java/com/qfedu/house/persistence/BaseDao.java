package com.qfedu.house.persistence;

import java.io.Serializable;
import java.util.List;
/**
 * 基本增删改查接口
 * @author Administrator
 *
 * @param <E>
 * @param <K>
 */
public interface BaseDao<E, K extends Serializable> {

	/**
	 *  保存
	 * @param entity
	 * @return
	 */
	K save(E entity);

	boolean deleteById(K id);

	void update(E entity);

	E findById(K id);

	List<E> findAll();
	
	void delete(E entity);
	 //我自己添加的方法
	List<E> findByName(String name);
}
