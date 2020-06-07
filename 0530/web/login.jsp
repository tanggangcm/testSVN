<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
    <script>
        window.onload = function () {
            var img = document.getElementById("img");
            img.onclick = function () {
                img.src = "/checkCodeServlet?time=" + new Date().getTime();
            }
        }
    </script>
</head>
<body>
    <form method="post" action="/sessionServlet">
        <span style="color: red"><%=request.getSession().getAttribute("err")==null?"":request.getSession().getAttribute("err")%></span>
        <span style="color: red">${requestScope.err}</span>

        <table>
            <tr>
                <td>用户名</td>
                <td><input type="text" name="username" /></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="password" name="password" /></td>
            </tr>
            <tr>
                <td>验证码</td>
                <td><input type="text" name="checkCode" /></td>
            </tr>
            <tr>
                <td colspan="2"><img id="img" src="/checkCodeServlet" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="login" /></td>
            </tr>
        </table>
    </form>
</body>
</html>
