package com.qfedu.house.service;

import java.util.List;

import com.qfedu.house.domain.LoginLog;
import com.qfedu.house.domain.User;



public interface LoginLogService{
	/**
	 * ͨ���û�������־
	 * @param username
	 * @return
	 */
   List<LoginLog> findByUser(User user);
   /**
    * ͨ��ip��ַ����
    * @param ip
    * @return
    */
   List<LoginLog> findByIp(String ip);
   /**
    * ͨ�����кŲ���
    * @param id
    * @return
    */
   LoginLog findById(Integer id);
}
