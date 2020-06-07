package com.tg.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(value = "/*", dispatcherTypes = {DispatcherType.REQUEST, DispatcherType.FORWARD})
public class FilterDemo2 implements Filter {
    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("filterDemo2 run...");
        chain.doFilter(req, resp);
        // System.out.println("filterDemo2 back...");
    }

    @Override
    public void init(FilterConfig config) throws ServletException {

    }

}
