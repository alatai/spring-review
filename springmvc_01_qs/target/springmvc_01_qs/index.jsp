<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
<h3>快速入门</h3>

<%--<a href="hello">入门程序</a>--%>
<%--<a href="user/testRequestMapping">RequestMapping</a>--%>
<%--<br>--%>
<%--<a href="param/testParam?username=tom">RequestMapping</a>--%>
<%--<br>--%>

<%-- 数据封装到Account对象 --%>
<%--<form action="param/save" method="POST">--%>
<%--    <div><label for="username">姓名：<input id="username" name="username" type="text"></label></div>--%>
<%--    <div><label for="password">密码：<input id="password" name="password" type="text"></label></div>--%>
<%--    <div><label for="money">金额：<input id="money" name="money" type="text"></label></div>--%>
<%--    <div><label for="name">用户姓名：<input id="name" name="user.name" type="text"></label></div>--%>
<%--    <div><label for="age">用户年龄：<input id="age" name="user.age" type="text"></label></div>--%>
<%--    <div><input type="submit" value="提交"></div>--%>
<%--</form>--%>

<%-- 数据封装到Account对象，类中包含集合对象（list、map） --%>
<%--<form action="param/save" method="POST">--%>
<%--    <div><label for="username">姓名：<input id="username" name="username" type="text"></label></div>--%>
<%--    <div><label for="password">密码：<input id="password" name="password" type="text"></label></div>--%>
<%--    <div><label for="money">金额：<input id="money" name="money" type="text"></label></div>--%>
<%--    &lt;%&ndash; 封装到list &ndash;%&gt;--%>
<%--    <div><label for="name1">用户姓名：<input id="name1" name="list[0].name" type="text"></label></div>--%>
<%--    <div><label for="age1">用户年龄：<input id="age1" name="list[0].age" type="text"></label></div>--%>
<%--    &lt;%&ndash; 封装到map &ndash;%&gt;--%>
<%--    <div><label for="name2">用户姓名：<input id="name2" name="map['first'].name" type="text"></label></div>--%>
<%--    <div><label for="age2">用户年龄：<input id="age2" name="map['first'].age" type="text"></label></div>--%>
<%--    <div><input type="submit" value="提交"></div>--%>
<%--</form>--%>

<%-- 自定义类型转换问题 --%>
<%--<form action="param/user/save" method="POST">--%>
<%--    &lt;%&ndash; 封装到list &ndash;%&gt;--%>
<%--    <div><label for="name">用户姓名：<input id="name" name="name" type="text"></label></div>--%>
<%--    <div><label for="age">用户年龄：<input id="age" name="age" type="text"></label></div>--%>
<%--    <div><label for="date">申请日期：<input id="date" name="date" type="text"></label></div>--%>
<%--    <div><input type="submit" value="提交"></div>--%>
<%--</form>--%>

<a href="param/servlet">servlet原生API</a>

</body>
</html>
