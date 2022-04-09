<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p>提交参数给Controller</p>

    <p>处理器方法返回String表示视图名称</p>
    <form action="returnString-view.do" method="post">
        姓名：<input type="text" name="name"> <br/>
        年龄：<input type="text" name="age"> <br/>
        <input type="submit" value="提交参数">
    </form>
    <br/>
    <p>处理器方法返回String表示视图完整路径</p>
    <form action="returnString-view2.do" method="post">
        姓名：<input type="text" name="name"> <br/>
        年龄：<input type="text" name="age"> <br/>
        <input type="submit" value="提交参数">
    </form>
    <br/>
    <br/>
    <button id="btn">发起ajax请求</button>

</body>
</html>
