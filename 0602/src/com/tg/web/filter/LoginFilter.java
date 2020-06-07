package com.tg.web.filter;

import org.springframework.util.ObjectUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Author tanggang
 * @Description //TODO 登录验证
 * @Date 2020/6/6
 */
@WebFilter("/*")
public class LoginFilter implements Filter {
    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        String requestURI = request.getRequestURI();
        if (requestURI.contains("/login.jsp") || requestURI.contains("loginServlet")
                || requestURI.contains("/css/") || requestURI.contains("/js/")
                || requestURI.contains("/fonts/") || requestURI.contains("/checkCodeServlet") ) {
            chain.doFilter(req, resp);
        } else {
            Object user = request.getSession().getAttribute("user");
            if(!ObjectUtils.isEmpty(user)) {
                chain.doFilter(req, resp);
            } else  {
                request.setAttribute("login_msg", "您尚未登录，请先登录");
                request.getRequestDispatcher("/login.jsp").forward(request, resp);
            }
        }
    }

    @Override
    public void init(FilterConfig config) throws ServletException {

    }

}
