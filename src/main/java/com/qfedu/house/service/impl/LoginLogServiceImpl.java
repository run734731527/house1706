package com.qfedu.house.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qfedu.house.domain.LoginLog;
import com.qfedu.house.domain.User;
import com.qfedu.house.persistence.LoginLogDao;
import com.qfedu.house.service.LoginLogService;
@Service
@Transactional
public class LoginLogServiceImpl implements LoginLogService{
   @Autowired
   private LoginLogDao loginLogDao;
	@Override
	public List<LoginLog> findByUser(User user) {
		return loginLogDao.findByUser(user);
		
	}

	@Override
	public List<LoginLog> findByIp(String ip) {
		return loginLogDao.findByName(ip);
	}

	@Override
	public LoginLog findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
