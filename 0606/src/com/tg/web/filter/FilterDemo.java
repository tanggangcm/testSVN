package com.tg.web.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Description: FilterDemo
 * @Author: tanggang
 * @Date: 2020/6/6
 * @Version: 1.0
 */
// @WebFilter("/*")
public class FilterDemo implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filter...");
        //放行
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
