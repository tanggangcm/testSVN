package com.tg.web.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cookieDemo1")
public class CookieDemo1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = new Cookie("msg", "helloCookie");

        // 设置cookie的存活时间
        // 将cookie持久化到硬盘上，30秒后会自动删除cookie文件
        // cookie.setMaxAge(30);
        cookie.setMaxAge(-1);
        // cookie.setMaxAge(0);
        // 正数：将cookie数据写到硬盘文件中， 持久化存储，cookie存活时间
        // 负数： 默认值 ，关闭浏览器删除cookie
        // 零： 删除cookie信息



        response.addCookie(cookie);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
