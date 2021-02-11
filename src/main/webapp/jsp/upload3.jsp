<%--
  Created by IntelliJ IDEA.
  User: shanxin
  Date: 2021/2/11
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/upload3" method="post" enctype="multipart/form-data">
    <input type="file" name="file1">
    <input type="file" name="file2">
    <input type="submit" value="上传">
</form>
</body>
</html>
