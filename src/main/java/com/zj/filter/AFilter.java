package com.zj.filter;

import javax.servlet.*;
import java.io.IOException;

public class AFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器出生了");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("AFilter#start");
        chain.doFilter(request, response);//放行
        System.out.println("AFilter#end");
    }

    @Override
    public void destroy() {
        System.out.println("过滤器注销了");
    }
}
