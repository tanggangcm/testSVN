package com.tg.web.servlet;

import com.tg.util.DownLoadUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/downloadServlet")
public class DownloadServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String filename = request.getParameter("filename");
        ServletContext servletContext = this.getServletContext();
        String realPath = servletContext.getRealPath("/img/banner_1.jpg");
        FileInputStream fis = new FileInputStream(realPath);

        String mimeType = servletContext.getMimeType(filename);
        response.setContentType(mimeType);

        String agent = request.getHeader("user-agent");
        filename = DownLoadUtils.getFileName(agent, filename);

        response.setHeader("content-disposition", "attachment;filename=" + filename);

        ServletOutputStream outputStream = response.getOutputStream();
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = fis.read(bytes)) != -1) {
            outputStream.write(bytes, 0, len);
        }

        fis.close();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
