<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>jstlDemo</title>
</head>
<body>
<%
    List list = new ArrayList();
    list.add("ada");
    list.add("fdas");
    list.add("re");
    list.add("发大水范德萨");
    list.add("啊");
    list.add("费多");
    request.setAttribute("list", list);
    request.setAttribute("number", 2);

    request.setAttribute("week", 13);
%>
    <c:if test="true">哈哈哈哈</c:if>
    <c:if test="false">hahahaha</c:if>

    <c:if test="${not empty list}">${list}</c:if>

    <c:if test="${number % 2 == 0}">${number}</c:if>

    <br />

    <c:choose>
        <c:when test="${week ==1}">${week}</c:when>
        <c:when test="${week ==2}">${week}</c:when>
        <c:when test="${week ==3}">${week}</c:when>
        <c:when test="${week ==4}">${week}</c:when>
        <c:when test="${week ==5}">${week}</c:when>
        <c:when test="${week ==6}">${week}</c:when>
        <c:when test="${week ==7}">${week}</c:when>
        <c:otherwise>输入有误</c:otherwise>
    </c:choose>

<br />
    <c:forEach begin="1" end="10" var="i" step="1">
        ${week}${i}
    </c:forEach>

<br />
    <c:forEach items="${list}" var="str" varStatus="s">
        ${s.index} ${s.count} ${str}<br />
    </c:forEach>
</body>
</html>
