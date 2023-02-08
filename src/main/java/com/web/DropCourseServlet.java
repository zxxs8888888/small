package com.web;

import com.service.Service;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/dropCourseServlet")
public class DropCourseServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Service service = (Service) context.getBean("service");
        HttpSession session = request.getSession();
        String course = request.getParameter("id");
        String student = (String) session.getAttribute("num_msg");
        int delete = service.getGradeDAO().delete(student,course);
        if (delete>=1){
            request.getRequestDispatcher("courseListServlet2").forward(request,response);
        }
    }
}
