package com.springboot.demo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.demo.pojo.user;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class userController {
    @Autowired
    com.springboot.demo.service.api.myUserService myUserService;

    @ResponseBody
    @RequestMapping("/hello")
    public String Hello(){
        return "hello world!!";
    }

    @RequestMapping("/list")
    public String listUser(Model m, @RequestParam(value = "start", defaultValue = "0") int start, @RequestParam(value = "size", defaultValue = "5") int size) throws Exception {
        PageHelper.startPage(start,size,"id desc");
        List<user> cs=myUserService.selectAllUser();
       // System.out.println(cs);
        PageInfo<user> page = new PageInfo<>(cs);
        m.addAttribute("page", page);
        return "index";
    }
    @RequestMapping("/deleteUser")
    public String deleteUser(@Param(value="id") int id){
        myUserService.deleteUserById(id);
        return "redirect:list";
    }
    @RequestMapping("/editUser")
    public String findUserById(int id,String mobile,String address,Model m){

        m.addAttribute("id",id);
        m.addAttribute("mobile",mobile);
        m.addAttribute("address",address);

        return "editUser";
    }
    @RequestMapping("/updateUser")
    public String updateUserByUser(String mobile,String address,int id){
        myUserService.updateUserByUser(mobile,address,id);
        return "redirect:list";
    }
    @RequestMapping("/addUser")
    public String addUser(String mobile,String address){
        myUserService.addUser(mobile,address);
        return "redirect:list";
    }
}
