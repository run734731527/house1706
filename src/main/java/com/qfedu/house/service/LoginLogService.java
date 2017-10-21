package com.qfedu.house.service;

import java.util.List;

import com.qfedu.house.domain.LoginLog;
import com.qfedu.house.domain.User;



public interface LoginLogService{
	/**
	 * 通过用户查找日志
	 * @param username
	 * @return
	 */
   List<LoginLog> findByUser(User user);
   /**
    * 通过ip地址查找
    * @param ip
    * @return
    */
   List<LoginLog> findByIp(String ip);
   /**
    * 通过序列号查找
    * @param id
    * @return
    */
   LoginLog findById(Integer id);
}
