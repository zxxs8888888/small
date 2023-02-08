package com.web;

import com.pojo.Grade;
import com.service.Service;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/courseListServlet2")
public class CourseListServlet2 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Service service = (Service) context.getBean("service");
        HttpSession session = request.getSession();
        List<Grade> courses = service.getGradeDAO().GradeByCid((String) session.getAttribute("num_msg"));
        System.out.println((String) session.getAttribute("num_msg"));
        session.setAttribute("a", courses);
        request.getRequestDispatcher("student3.jsp").forward(request, response);

    }
}
