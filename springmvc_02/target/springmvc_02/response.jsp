<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>响应</title>
    <script type="text/javascript" src="js/jquery-3.5.1.min.js"></script>
    <script>
        // 页面加载，绑定点击事件
        $(function () {
            $("#btn").click(function () {
                alert("hello btn");
                // 发送ajax请求
                $.ajax({
                    // 编写json格式，设置属性和值
                    url: "user/testAjax",
                    contentType: "application/json;charset=UTF-8",
                    data: '{"name":"瘦子", "password":"123", "age":"30"}',
                    dataType: "json",
                    type: "POST",
                    success: function (data) {
                        // data服务器端响应的json数据，进行解析

                    }
                });
            });
        });
    </script>
</head>
<body>

<a href="user/testString">testString</a><br>

<a href="user/testVoid">testVoid</a><br>

<a href="user/testModelAndView">testModelAndView</a><br>

<a href="user/testForwardOrRedirect">testForwardOrRedirect</a><br>

<button id="btn">发送ajax请求</button>

</body>
</html>
