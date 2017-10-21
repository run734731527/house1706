package com.qfedu.house.service;

import com.qfedu.house.domain.User;
import com.qfedu.house.dto.UserLoginDto;

public interface UserService {
/**
 * 用户注册
 * @param user
 * @return
 */
boolean register(User  user);
/**
 * 用户登录
 * @param user
 * @return
 */
Boolean login(UserLoginDto user);
/**
 * 检查用户名唯一性
 * @param username
 * @return
 */
Boolean checkUnique(String username);
}
