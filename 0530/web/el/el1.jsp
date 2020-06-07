<%@ page import="com.tg.domain.User" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el</title>
</head>
<body>
    ${ 3 > 4}
    \${ 3 < 4}

<%
    request.setAttribute("name", "zhangsan");
    User user = new User();
    user.setId(1);
    user.setUsername("lisi");
    user.setPassword("hahahh");
    session.setAttribute("user", user);

    List<String> list = new ArrayList<>();
    list.add("aaa");
    list.add("bbb");
    pageContext.setAttribute("list", list);

    Map map = new HashMap();
    map.put("sname", "wangwu");
    map.put("gender", "男");
    application.setAttribute("map", map);
%>

${requestScope.name}
<br />
${sessionScope.user.id}
${sessionScope.user.username}
${sessionScope.user.password}
<br />
${pageScope.list}
${pageScope.list[0]}
${pageScope.list[1]}
${pageScope.list[10]}
    <br />
${applicationScope.map.sname}
${applicationScope.map.gender}
</body>
</html>
