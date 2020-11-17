package com.springboot.demo.service.api;

import com.springboot.demo.pojo.user;
import org.springframework.stereotype.Service;

import java.util.List;


public interface myUserService {
    public List<user> selectAllUser();

    void deleteUserById(int id);

    user findUserById(int id);


    void updateUserByUser(String mobile, String address,int id);

    void addUser(String mobile, String address);
}
