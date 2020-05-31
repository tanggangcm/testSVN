package com.tg.web.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Description: Demo1
 * @Author: tanggang
 * @Date: 2020/5/29
 * @Version: 1.0
 */
public class Demo1 implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init......");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Hello Servlet");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
