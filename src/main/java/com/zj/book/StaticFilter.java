package com.zj.book;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

@WebFilter(filterName = "StaticFilter", servletNames = "BookServlet")
public class StaticFilter implements Filter {
    private  FilterConfig config;
    @Override
    public void init(FilterConfig config) throws ServletException {
        this.config = config;
    }

    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        String category = request.getParameter("category");
        String htmlPage = category + ".html";
        String htmlPath = config.getServletContext().getRealPath("/htmls");
        File destFile = new File(htmlPath, htmlPage);
        //如果不存在 那么就调包
        if (!destFile.exists()) {
            StaticResponse staticResponse = new StaticResponse(httpServletResponse,destFile.getAbsolutePath());
            //调包之后 放行
            chain.doFilter(request, staticResponse);
        }
        //存在了
        httpServletResponse.sendRedirect(httpServletRequest.getContextPath()+"/htmls/"+htmlPage);
    }
}
