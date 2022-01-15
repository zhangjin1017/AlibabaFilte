package com.zj.encoding;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(filterName = "EncodingFilter",urlPatterns = "/*")
public class EncodingFilter implements Filter {
    @Override
    public void init(FilterConfig config) throws ServletException {
    }

    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        //处理post请求乱码
        request.setCharacterEncoding("utf-8");
        //处理get请求   这里我本身并没有发生get乱码  或者说在EncodingRequest类中拿到的数据 并不是iso-8859-1
//        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
//        if ("GET".equals(httpServletRequest.getMethod())) {
//            EncodingRequest encodingRequest = new EncodingRequest(httpServletRequest);
//            chain.doFilter(encodingRequest, response);
//        }else if ("POST".equals(httpServletRequest.getMethod())) {
            chain.doFilter(request, response);
//        }

    }
}
