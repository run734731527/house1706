package com.qfedu.house.persistence;

import com.qfedu.house.domain.User;
/**
 * �û��Ľӿ�
 * @author Administrator
 *
 */
public interface UserDao extends BaseDao<User, Integer> {
	/**
	 * �����û��������û�
	 * @return
	 */
	User findByUsername(String username);
}
