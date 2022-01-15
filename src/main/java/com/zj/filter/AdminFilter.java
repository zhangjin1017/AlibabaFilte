package com.zj.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author 1216916137
 */
@WebFilter(filterName = "AdminFilter")
public class AdminFilter implements Filter {
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
        System.out.println("AdminFilter username:"+username);
    if (username != null&&!username.isEmpty()) {
        chain.doFilter(request, response);
    }else {
        request.setAttribute("msg","你不是管理员，不要瞎溜达");
        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }

    }
}
