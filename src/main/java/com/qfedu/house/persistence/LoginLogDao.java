package com.qfedu.house.persistence;

import java.util.List;

import com.qfedu.house.domain.LoginLog;
import com.qfedu.house.domain.User;

public interface LoginLogDao 
   extends BaseDao<LoginLog,Integer>{
	/**
	 * ͨ���û����������־����
	 * @param user
	 * @return
	 */
	List<LoginLog> findByUser(User user);
}
