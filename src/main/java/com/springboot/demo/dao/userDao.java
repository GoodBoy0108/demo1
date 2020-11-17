package com.springboot.demo.dao;

import com.springboot.demo.pojo.user;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface userDao {
    @Select("select * from user")
    public List<user> selectAllUser();

    @Delete("delete from user where id = #{id}")
    void deleteUserById(int id);

    @Select("select * from user by id = #{id}")
    user findUserById(int id);

    @Update("update user set mobile = #{mobile},address = #{address} where id = #{id}")
    void updateUserByUser(String mobile, String address,int id);

    @Insert("insert into user(mobile,address) values(#{mobile},#{address})")
    void addUser(String mobile, String address);
}
