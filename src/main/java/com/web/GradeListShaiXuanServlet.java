package com.web;

import com.pojo.Grade;
import com.service.Service;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/gradeListShaiXuanServlet")
public class GradeListShaiXuanServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Service service = (Service) context.getBean("service");
        String text = request.getParameter("courseCode");
        if (text != null) {
            List<Grade> grades = service.getGradeDAO().allGradeListByCourse(text);
            request.setAttribute("grades", grades);
            request.getRequestDispatcher("teacher3.jsp").forward(request, response);
        }
    }
}
