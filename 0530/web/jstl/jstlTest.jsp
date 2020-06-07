<%@ page import="com.tg.domain.User" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>jstlTest</title>
</head>
<body>
    <%
        List<User> list = new ArrayList<>();
        list.add(new User("zhangsan", "qwe"));
        list.add(new User("lisi", "fd"));
        list.add(new User("wangwu", "a"));
        list.add(new User("zhaoliu", "fd"));
        list.add(new User("tianqi", "fd"));
        list.add(new User("bq", "fds"));

        request.setAttribute("list", list);
    %>

<table border="1" width="500" align="center">
    <tr>
        <td>编号</td>
        <td>username</td>
        <td>password</td>
    </tr>
    <c:forEach items="${list}" var="user" varStatus="s">
        <c:if test="${s.count % 2 == 1}">
            <tr style="background-color: pink">
                <td>${s.count}</td>
                <td>${user.username}</td>
                <td>${user.password}</td>
            </tr>
        </c:if>
        <c:if test="${s.count % 2 == 0}">
            <tr style="background-color: aquamarine">
                <td>${s.count}</td>
                <td>${user.username}</td>
                <td>${user.password}</td>
            </tr>
        </c:if>
    </c:forEach>
</table>
</body>
</html>
