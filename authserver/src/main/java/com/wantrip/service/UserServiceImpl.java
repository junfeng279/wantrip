package com.wantrip.service;

import com.wantrip.domain.User;
import com.wantrip.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;


/**
 * 创建用户信息
 */

@Service
public class UserServiceImpl implements UserService{
    private final Logger log = LoggerFactory.getLogger(getClass());
    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @Autowired
    private UserRepository repository;

    @Override
    public void create(User user) {

        User existing = repository.findOne(user.getUsername());
        Assert.isNull(existing, "user already exists: " + user.getUsername());

        String hash = encoder.encode(user.getPassword());
        user.setPassword(hash);

        repository.save(user);

        log.info("new user has been created: {}", user.getUsername());
    }
}
