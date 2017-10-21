package com.qfedu.house;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qfedu.house.domain.User;
import com.qfedu.house.dto.UserLoginDto;
import com.qfedu.house.service.UserService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:app.xml")
public class MyTest {
	@Autowired
	private UserService userService;

	@Test
	public void testSaveUser() {
		User user = new User("Tom", "123456", "TomLin", "0998098", false);
		userService.register(user);
	}

	@Test
	public void testlogin() {
		UserLoginDto user = new UserLoginDto();
		Assert.assertEquals(true, userService.login(user));
	}
}
