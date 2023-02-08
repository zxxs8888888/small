package com.service;

import com.dao.CourseDAO;
import com.dao.GradeDAO;
import com.dao.UserDAO;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.annotation.Resource;
@org.springframework.stereotype.Service
@Data
@AllArgsConstructor
public class Service implements ServiceApi{
    @Resource
    private UserDAO userDAO;
    @Resource
    private CourseDAO courseDAO;
    @Resource
    private GradeDAO gradeDAO;


}
