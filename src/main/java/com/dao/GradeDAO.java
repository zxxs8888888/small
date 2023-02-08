package com.dao;

import com.pojo.Grade;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface GradeDAO {

    //student
    public int delete(@Param("num") String num,@Param("cid") String cid);
    public int insert(Grade grade);
    public List<String> CidByNum(String num);
    public List<Grade> GradeByNum(String num);
    public List<Grade> GradeByCid(String cid);
    //teacher
    public List<Grade> allGradeList();
    public List<Grade> allGradeListByCourse(String course);
    public void updateGrade(@Param("num") String num,@Param("cid") String cid,@Param("grade") String grade);
}
