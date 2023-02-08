package com.dao;

import com.pojo.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CourseDAO {
    public List<Course> selectAll();
    public List<Course> selectByCid(String cid);
}
