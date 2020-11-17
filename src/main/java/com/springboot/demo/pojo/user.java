package com.springboot.demo.pojo;

import java.util.Date;

public class user {
    int id;
    private String mobile;
    private String passworld;
    private String sex;
    private String address;
    private String email;
    private String state;
    private Date brithday;
    private Date creat_time;
    private Date update_time;

    public user() {
    }

    public user(int id, String mobile, String passworld, String sex, String address, String email, String state, Date brithday, Date creat_time, Date update_time) {
        this.id = id;
        this.mobile = mobile;
        this.passworld = passworld;
        this.sex = sex;
        this.address = address;
        this.email = email;
        this.state = state;
        this.brithday = brithday;
        this.creat_time = creat_time;
        this.update_time = update_time;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", mobile='" + mobile + '\'' +
                ", passworld='" + passworld + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", state='" + state + '\'' +
                ", brithday=" + brithday +
                ", creat_time=" + creat_time +
                ", update_time=" + update_time +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setPassworld(String passworld) {
        this.passworld = passworld;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

    public void setCreat_time(Date creat_time) {
        this.creat_time = creat_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public int getId() {
        return id;
    }

    public String getMobile() {
        return mobile;
    }

    public String getPassworld() {
        return passworld;
    }

    public String getSex() {
        return sex;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getState() {
        return state;
    }

    public Date getBrithday() {
        return brithday;
    }

    public Date getCreat_time() {
        return creat_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }
}
