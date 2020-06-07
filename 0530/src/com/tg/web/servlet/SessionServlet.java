package com.tg.web.servlet;

import com.tg.dao.UserDao;
import com.tg.domain.User;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.util.ObjectUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/sessionServlet")
public class SessionServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        Map<String, String[]> parameterMap = request.getParameterMap();
        User loginUser = new User();
        try {
            BeanUtils.populate(loginUser, parameterMap);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        HttpSession session1 = request.getSession();
        String checkCode = request.getParameter("checkCode");
        String session = (String) session1.getAttribute("checkCode");
        session1.removeAttribute("checkCode");
        UserDao userDao = new UserDao();
        if(session != null && checkCode.equalsIgnoreCase(session)) {
            User user = userDao.login(loginUser);

            if(ObjectUtils.isEmpty(user)) { //登录失败
                session1.setAttribute("err", "用户名或密码错误");
                request.getRequestDispatcher("/login.jsp").forward(request, response);
            } else { //登录成功
                session1.setAttribute("success", user.getUsername());
                response.sendRedirect(request.getContextPath() + "/success.jsp");
            }
        } else {
            session1.setAttribute("err", "验证码错误");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
