package com.wantrip.service;


import com.wantrip.domain.User;

import java.util.List;

public interface UserService {

	void create(User user) throws Exception;

	public List<User> getUsers();


}
