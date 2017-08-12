package com.wantrip.service;

import com.wantrip.domain.User;
import com.wantrip.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;


/**
 * 创建用户信息
 */

@Service
public class UserServiceImpl implements UserService{
    private final Logger log = LoggerFactory.getLogger(getClass());
    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @Autowired
    private UserRepository userRepository;

    /**
     * 创建用户
     * @param user
     * @throws Exception
     */
    @Override
    public void create(User user) throws Exception {

        User existing = userRepository.findOne(user.getUsername());
        if(existing!=null){
            throw new Exception("user already exists: " + user.getUsername());
        }
     //   Assert.isNull(existing, "user already exists: " + user.getUsername());

        String hash = encoder.encode(user.getPassword());

        user.setPassword(hash);

        userRepository.save(user);

        log.info("new user has been created: {}", user.getUsername());
    }

    /**
     * 查询所有用户
     * @return
     */
    @Override
    public List<User> getUsers() {
        List<User> users = null;

        users = (List<User>) userRepository.findAll();
        log.info("查询到所有用户信息, counts="+users.size());

        return users;
    }
}
