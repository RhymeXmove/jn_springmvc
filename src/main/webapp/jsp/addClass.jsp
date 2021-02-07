<%--
  Created by IntelliJ IDEA.
  User: shanxin
  Date: 2021/2/7
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/doAddClass" method="post">
    <table>
        <tr>
            <td>班级编号：</td>
            <td><input type="text" name="id"></td>
        </tr>
        <tr>
            <td>学生编号：</td>
            <td><input type="text" name="student[0].id"></td>
        </tr>
        <tr>
            <td>学生姓名：</td>
            <td><input type="text" name="student[0].name"></td>
        </tr>
        <tr>
            <td>学生编号：</td>
            <td><input type="text" name="student[1].id"></td>
        </tr>
        <tr>
            <td>学生姓名：</td>
            <td><input type="text" name="student[1].name"></td>
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
