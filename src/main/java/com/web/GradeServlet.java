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

@WebServlet("/gradeServlet")
public class GradeServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Service service = (Service) context.getBean("service");
        HttpSession session = request.getSession();
        String  num = (String) session.getAttribute("num_msg");

        List<Grade> grades = service.getGradeDAO().GradeByNum(num);

        request.setAttribute("grades",grades);
        request.getRequestDispatcher("student1.jsp").forward(request,response);
    }
}
