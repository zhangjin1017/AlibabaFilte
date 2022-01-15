package com.zj.book;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class StaticResponse extends HttpServletResponseWrapper {
    private HttpServletResponse httpServletResponse;
    private PrintWriter printWriter;
    /**
     * Constructs a response adaptor wrapping the given response.
     *
     * @param response the {@link HttpServletResponse} to be wrapped.
     * @throws IllegalArgumentException if the response is null
     */
    public StaticResponse(HttpServletResponse response,String path) throws FileNotFoundException, UnsupportedEncodingException {
        super(response);
        this.httpServletResponse = response;
        printWriter=new PrintWriter(path,"utf-8");
    }
    @Override
    public PrintWriter getWriter(){
        return printWriter;
    }

}
