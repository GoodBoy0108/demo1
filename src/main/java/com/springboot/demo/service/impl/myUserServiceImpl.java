package com.springboot.demo.service.impl;

import com.springboot.demo.dao.userDao;
import com.springboot.demo.pojo.user;
import com.springboot.demo.service.api.myUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class myUserServiceImpl implements myUserService {
    @Autowired
    private userDao userDao;
    @Override
    public List<user> selectAllUser() {
        return userDao.selectAllUser();
    }

    @Override
    public void deleteUserById(int id) {
        userDao.deleteUserById(id);
    }

    @Override
    public user findUserById(int id) {
        return userDao.findUserById(id);
    }

    @Override
    public void updateUserByUser(String mobile, String address,int id) {
        userDao.updateUserByUser(mobile,address,id);
    }

    @Override
    public void addUser(String mobile, String address) {
        userDao.addUser(mobile,address);
    }

}
