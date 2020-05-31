package com.tg.web.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description: ResponseDemo1
 * @Author: tanggang
 * @Date: 2020/5/31
 * @Version: 1.0
 */
@WebServlet("/responseDemo2")
public class ResponseDemo2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // resp.setCharacterEncoding("UTF-8");
        // resp.setHeader("content-type", "text/html;charset=UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write("你好，，，");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
