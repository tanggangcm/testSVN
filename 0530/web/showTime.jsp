<%@ page import="java.net.URLDecoder" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.net.URLEncoder" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>showTime</title>
</head>
<body>
    <%
        Cookie[] cookies = request.getCookies();
        String msg = "第一次访问";
        if(cookies != null && cookies.length > 0) {
            for (Cookie cookie : cookies) {
                String name = cookie.getName();
                if("lastTime".equals(name)) {
                    String decode = URLDecoder.decode(cookie.getValue(), "UTF-8");
                    msg = "上一次访问时间为：" + decode;
                }
            }
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(new Date());
        String encode = URLEncoder.encode(format, "UTF-8");
        Cookie lastTime = new Cookie("lastTime", encode);
        lastTime.setMaxAge(60 * 60 * 24 * 30);
        response.addCookie(lastTime);
    %>
    <h1><%=msg%></h1>
</body>
</html>
