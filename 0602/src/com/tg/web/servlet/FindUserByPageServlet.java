package com.tg.web.servlet;

import com.tg.domain.PageBean;
import com.tg.domain.User;
import com.tg.service.UserService;
import com.tg.service.impl.UserServiceImpl;
import org.springframework.util.ObjectUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/findUserByPageServlet")
public class FindUserByPageServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String currentPage = request.getParameter("currentPage");
        String rows = request.getParameter("rows");
        if (ObjectUtils.isEmpty(currentPage)) {
            currentPage = "1";
        }
        if (ObjectUtils.isEmpty(rows)) {
            rows = "5";
        }

        Map<String, String[]> condition = request.getParameterMap();

        UserService userService = new UserServiceImpl();
        PageBean<User> pageBean = userService.findUserByPage(currentPage,rows, condition);
        request.setAttribute("pageBean", pageBean);
        request.setAttribute("condition", condition);
        request.getRequestDispatcher("/list.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
