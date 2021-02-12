<%--
  Created by IntelliJ IDEA.
  User: shanxin
  Date: 2021/2/12
  Time: 12:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/addstudent" method="post">
    <table>
        <tr>
            <td>学生编号：</td>
            <td><input type="text" name="id" value="${s.id}"></td>
        </tr>
        <tr>
            <td>学生姓名：</td>
            <td><input type="text" name="name" value="${s.name}"></td>
        </tr>
        <tr>
            <td>学生邮箱：</td>
            <td><input type="text" name="email" value="${s.email}"></td>
        </tr>
        <tr>
            <td>学生年龄：</td>
            <td><input type="text" name="age" value="${s.age}"></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="提交">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
