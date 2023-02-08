package com.dao;

import com.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDAO {
//    public List<User> selectAll();
    public int Register(User user);
    public String login(@Param("num") String num, @Param("pwd") String pwd);
    public List<User> AllStudentList();
    public List<User> AllUsers();
}
