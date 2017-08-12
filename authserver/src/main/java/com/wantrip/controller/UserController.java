package com.wantrip.controller;

import com.wantrip.domain.ResultData;
import com.wantrip.domain.User;
import com.wantrip.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	private final Logger log = LoggerFactory.getLogger(getClass());

	@RequestMapping(value = "/current", method = RequestMethod.GET)
	public Principal getUser(Principal principal) {
		return principal;
	}


	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public void createUser() {
		User user = new User();
		user.setUsername("test");
		user.setPassword("111111");
		try{
			userService.create(user);
		}catch (Exception e){
			log.info("创建用户失败, 错误消息="+e.getMessage());
		}
	}

	/**
	 * 查询所有用户信息
	 * @return
	 */
	@RequestMapping(value = "/getUsers", method = RequestMethod.GET)
	public ResultData getUsers(){
		ResultData result = new ResultData();
		result.setCode(1);
		List<User> users = userService.getUsers();
		result.setData(users);
		return result;
	}
}
