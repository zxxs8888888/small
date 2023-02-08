package com.web;

import com.service.Service;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/gradeUpdateServlet")
public class GradeUpdateServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Service service = (Service) context.getBean("service");
        String student = request.getParameter("student");
        String course = request.getParameter("course");
        String grade = request.getParameter("fen");
        service.getGradeDAO().updateGrade(student,course,grade);
        response.sendRedirect("gradeListServlet");
    }
}
