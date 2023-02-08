package com.web;

import com.service.Service;
import com.service.ServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * 用于判断用户登录
 */
//@Component
@WebServlet("/loginCheckServlet")
public class    LoginCheckServlet extends HttpServlet {

//    @Autowired
//    private ServiceApi service;
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String remember = request.getParameter("remember");
        HttpSession session = request.getSession();
        session.setAttribute("num_msg",username);
        session.setAttribute("k","");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Service service = (Service) context.getBean("service");
        String temp = service.getUserDAO().login(username, password);
        int login;
        if (temp!=null) login=Integer.parseInt(temp);
        else login=0;
        System.out.println(login);
        if (login==1||login==2){
            if ("1".equals(remember)){
                Cookie cookie01 = new Cookie("username",username);
                Cookie cookie02 = new Cookie("password",password);
                cookie01.setMaxAge(60*60*24*3);
                cookie02.setMaxAge(60*60*24*3);
                response.addCookie(cookie01);
                response.addCookie(cookie02);
            }
            if (login==1){
                request.getRequestDispatcher("s_index.jsp").forward(request,response);
            }else if (login==2){
                request.getRequestDispatcher("t_index.jsp").forward(request,response);
            }
        }else {
            response.getWriter().write("Your account or password is wrong, and you will return to the login page!");
            response.setHeader("refresh","5;URL=login.jsp");
        }
    }
}
