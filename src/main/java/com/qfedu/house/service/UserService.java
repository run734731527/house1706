package com.qfedu.house.service;

import com.qfedu.house.domain.User;
import com.qfedu.house.dto.UserLoginDto;

public interface UserService {
/**
 * �û�ע��
 * @param user
 * @return
 */
boolean register(User  user);
/**
 * �û���¼
 * @param user
 * @return
 */
Boolean login(UserLoginDto user);
/**
 * ����û���Ψһ��
 * @param username
 * @return
 */
Boolean checkUnique(String username);
}
