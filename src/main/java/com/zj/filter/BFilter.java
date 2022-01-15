package com.zj.filter;

import javax.servlet.*;
import java.io.IOException;

public class BFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("BFilter#start");
        chain.doFilter(request, response);//放行
        System.out.println("BFilter#end");
    }

    @Override
    public void destroy() {

    }
}
