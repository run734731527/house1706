package com.qfedu.house.persistence.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qfedu.house.domain.LoginLog;
import com.qfedu.house.domain.User;
import com.qfedu.house.persistence.LoginLogDao;
import com.qfedu.house.persistence.UserDao;
@Repository
public class LoginLogDaoImpl extends BaseDaoAdapter<LoginLog, Integer> implements LoginLogDao {
  @Autowired
  private UserDao userDao;
	@Override
	public List<LoginLog> findByUser(User user) {
		User temp=userDao.findByUsername(user.getUsername());
		return sessionFactory.getCurrentSession()
				.createQuery("from LoginLog as l where l.user=:user",LoginLog.class)
				.setParameter("user", temp)
				.getResultList();
	}
}
