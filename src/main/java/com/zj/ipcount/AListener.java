package com.zj.ipcount;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author 1216916137
 */
@WebListener("/AListener")
public class AListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        Map<String, Integer> map = new LinkedHashMap<>();
        ServletContext application=sce.getServletContext();
        application.setAttribute("map",map);
    }
}
