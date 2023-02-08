package com.web;
/*
查询所有课程
 */
import com.pojo.Course;
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

@WebServlet("/courseListServlet")
public class CourseListServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Service service = (Service) context.getBean("service");
        List<Course> courses = service.getCourseDAO().selectAll();
        HttpSession session = request.getSession();
        session.setAttribute("courses", courses);
        request.getRequestDispatcher("student2.jsp").forward(request, response);

    }
}
