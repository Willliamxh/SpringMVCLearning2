<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>/WEB-INF/view/hello.jsp从request作用域获取数据</h3><br/>
    <%--//我访问的是/doRedirect.do 然后框架把我重定向到了
        //http://localhost:8080/ch08_forard_redirect/hello.jsp?myname=lisi&myage=22
        //这是两次请求 myname和myage在第一次请求的作用域中
        //第二次请求的作用域没法获取到第一次请求作用域里的age和name
        //所以需要用param对象去取参数，从request请求对象那边去取值。--%>
    <h3>myname数据：${param.myname}</h3><br/>
    <h3>myage数据：${param.myage}</h3>
    <h3>取参数数据：<%=request.getParameter("myname")%></h3>
</body>
</html>
