package com.zj.ipcount;

import javax.servlet.*;
import java.io.IOException;
import java.util.Map;

public class AFilter implements Filter {
    private FilterConfig config;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.config = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        ServletContext application=config.getServletContext();
        Map<String, Integer> map= (Map<String, Integer>) application.getAttribute("map");
        String ip=request.getRemoteAddr();
        System.out.println(ip);
        if(map.containsKey(ip)){
            int count = map.get(ip);
            map.put(ip, count+1);
        }else{
            map.put(ip, 1);
        }
        application.setAttribute("map",map);
        System.out.println("map:"+map);
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
