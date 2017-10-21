package com.qfedu.house.persistence;

import com.qfedu.house.domain.User;
/**
 * 用户的接口
 * @author Administrator
 *
 */
public interface UserDao extends BaseDao<User, Integer> {
	/**
	 * 根据用户名查找用户
	 * @return
	 */
	User findByUsername(String username);
}
