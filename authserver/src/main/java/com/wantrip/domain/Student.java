package com.wantrip.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by junfeng on 17-8-12.
 */
@Document(collection = "student")
public class Student {
    @Id
    private String username;

    private String password;


    public String getPassword() {
        return password;
    }


    public String getUsername() {
        return username;
    }



    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
