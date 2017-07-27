package com.wantrip.controller;

import com.wantrip.domain.User;
import com.wantrip.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/current", method = RequestMethod.GET)
	public Principal getUser(Principal principal) {
		return principal;
	}


	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public void createUser() {
		User user = new User();

		user.setUsername("test");

		user.setPassword("111111");
		userService.create(user);
	}
}
