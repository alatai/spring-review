<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>RequestParam注解</title>
</head>
<body>

<h3>一些常用注解</h3>

<%-- 解决参数传参与实体属性命名不一致问题 --%>
<%--<a href="anno/param?name=散散">RequestParam注解</a>--%>

<%-- 获取请求体 --%>
<%--<form action="anno/body" method="post">--%>
<%--    <div><label for="name">用户姓名：<input id="name" name="name" type="text"></label></div>--%>
<%--    <div><label for="age">用户年龄：<input id="age" name="age" type="text"></label></div>--%>
<%--    <div><label for="date">申请日期：<input id="date" name="date" type="text"></label></div>--%>
<%--    <div><input type="submit" value="提交"></div>--%>
<%--</form>--%>

<%-- restful风格 --%>
<%--<a href="anno/path/10">PathVariable注解</a>--%>

<%-- 获取请求头 --%>
<%--<a href="anno/header">RequestHeader注解</a>--%>

<%-- 获取cookie值 --%>
<%--<a href="anno/cookie">CookieValue注解</a>--%>

<%-- ModelAttribute注解 --%>
<%--<form action="anno/model" method="post">--%>
<%--    <div><label for="name">用户姓名：<input id="name" name="name" type="text"></label></div>--%>
<%--    <div><label for="age">用户年龄：<input id="age" name="age" type="text"></label></div>--%>
<%--    <div><label for="date">申请日期：<input id="date" name="date" type="text"></label></div>--%>
<%--    <div><input type="submit" value="提交"></div>--%>
<%--</form>--%>

<%-- SessionAttributes注解 --%>
<a href="anno/session">SessionAttributes</a><br>
<a href="anno/getAttr">GetSessionAttributes</a><br>
<a href="/anno/delAttr">DelSessionAttributes</a>

</body>
</html>
