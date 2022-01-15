package com.zj.filter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(filterName = "UserFilter")
public class UserFilter implements Filter {
    @Override
    public void init(FilterConfig config) throws ServletException {
    }

    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {

        HttpServletRequest req = (HttpServletRequest) request;
        String username= (String) req.getSession().getAttribute("admin");
        System.out.println("UserFilter admin:"+username);
    if (username != null&&!username.isEmpty()) {
        chain.doFilter(request, response);
        return;
    }
        username = (String) req.getSession().getAttribute("username");
        System.out.println("UserFilter username:"+username);
    if (username != null&&!username.isEmpty()) {
        chain.doFilter(request, response);
    }else {
        request.setAttribute("msg","你是游客，不要瞎溜达");
        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }

    }
}
