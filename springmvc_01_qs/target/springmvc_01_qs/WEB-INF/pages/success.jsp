<%-- isELIgnored：是否忽略EL表达式 --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Success</title>
</head>
<body>
<h3>入门成功</h3>

<%--${requestScope}--%>
${msg}
${sessionScope}
</body>
</html>
