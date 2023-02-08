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

@WebServlet("/selectCourseServlet")
public class SelectCourseServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Service service = (Service) context.getBean("service");
        HttpSession session = request.getSession();
        String course = request.getParameter("cid");
        String student = (String) session.getAttribute("num_msg");
        String k = (String) session.getAttribute("k");

        List<String> strings = service.getGradeDAO().CidByNum(student);
        if (strings==null||!strings.contains(course)){
            int insert = service.getGradeDAO().insert(new Grade(student, course, "老师未打分"));
            if (insert>=1){
                session.setAttribute("k",k+course+",");
                request.getRequestDispatcher("courseListServlet").forward(request,response);
            }
        } else if (strings.contains(course)){
            response.sendRedirect("student2.jsp");
        }

    }
}
