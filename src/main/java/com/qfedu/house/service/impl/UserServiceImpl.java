package com.qfedu.house.service.impl;

import java.util.Date;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qfedu.house.domain.LoginLog;
import com.qfedu.house.domain.User;
import com.qfedu.house.dto.UserLoginDto;
import com.qfedu.house.persistence.LoginLogDao;
import com.qfedu.house.persistence.UserDao;
import com.qfedu.house.service.UserService;
@Service
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
	private UserDao userDao;
    @Autowired
    private LoginLogDao loginLogDao;
    
	@Override
	public boolean register(User user) {
		User user2=userDao.findByUsername(user.getUsername());
		if(user2==null) {
			String md5=DigestUtils.md5Hex(user.getPassword());
			user.setPassword(md5);
			return userDao.save(user)!=null;
		}
		return false;
	}

	@Override
	public Boolean login(UserLoginDto user) {
		
		User temp=userDao.findByUsername(user.getUsername());
		if (temp!=null) {
			String md5=DigestUtils.md5Hex(user.getPassword());
			if (temp.getPassword().equals(md5)) {
				LoginLog loginLog=new LoginLog("ÕâÊÇ"+user.getUsername()+"µÄip",new Date());
				loginLog.setUser(temp);
				loginLogDao.save(loginLog);
				user.setId(temp.getId());
				user.setRealname(temp.getRealname());
				return true;
			}
		}
		return false;
	}

	@Override
	public Boolean checkUnique(String username) {
		return userDao.findByUsername(username)==null;
	}

}
