package com.web;
/*
查询所有课程
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

@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Service service = (Service) context.getBean("service");
        String num = request.getParameter("num");
        String word = request.getParameter("word");
        String name = request.getParameter("name");
        String type = request.getParameter("type");
        User user = new User(num,word,name,Integer.parseInt(type));
        List<User> users = service.getUserDAO().AllUsers();
        int flag=0;
        for (int i =0;i<users.size();i++){
            if (users.get(i).getNum().equals(num)){
                flag=1;
                response.getWriter().write("The account has been registered. Please change it again!");
                response.setHeader("refresh","2;URL=register.jsp");
            }
        }
        if (flag==0){
            int register = service.getUserDAO().Register(user);
            if (register==1){
                response.sendRedirect("login.jsp");
            }
        }
    }
}
