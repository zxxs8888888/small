package com.web;
/*
查询所有学生信息
 */
import com.pojo.User;
import com.service.Service;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet("/allStudentServlet")
public class AllStudentServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Service service = (Service) context.getBean("service");
        List<User> allStudentList = service.getUserDAO().AllStudentList();
        request.setAttribute("allStudentList",allStudentList);
        request.getRequestDispatcher("teacher1.jsp").forward(request,response);
    }
}
