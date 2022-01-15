package com.zj.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");

        String username=request.getParameter("username");
        System.out.println("LoginServlet username:"+username);
        if (username.contains("zj")) {
            request.getSession().setAttribute("admin",username);
        }else{
            request.getSession().setAttribute("username",username);
        }
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
