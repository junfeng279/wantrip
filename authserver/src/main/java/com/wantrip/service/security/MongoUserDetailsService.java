package com.wantrip.service.security;

import com.wantrip.domain.User;
import com.wantrip.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by junfeng on 17-7-26.
 */
@Service
public class MongoUserDetailsService implements UserDetailsService{

    @Autowired
    private UserRepository repository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repository.findOne(username);
        if(user==null){
            throw new UsernameNotFoundException(username);
        }
        return user;
    }
}
