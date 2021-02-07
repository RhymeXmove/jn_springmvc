<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2021/1/29
  Time: 8:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/doAdd" method="post">
    <table>
        <tr>
            <td>书名</td>
            <td><input type="text" name="name"/></td>
        </tr>
        <tr>
            <td>作者姓名：</td>
            <td><input type="text" name="author.name"/></td>
        </tr>
        <tr>
            <td>作者年龄：</td>
            <td><input type="text" name="author.age"/></td>
        </tr>
        <tr>
            <td>兴趣爱好：</td>
            <td><input type="checkbox" name="author.favorite" value="足球"/>足球</td>
            <td><input type="checkbox" name="author.favorite" value="篮球"/>篮球</td>
            <td><input type="checkbox" name="author.favorite" value="羽毛球"/>羽毛球</td>
        </tr>
        <tr>
            <td>价格</td>
            <td><input type="text" name="price"/></td>
        </tr>
        <tr>
            <td>是否上架</td>
            <td>
                <input type="radio" value="true" name="ispublic">是
                <input type="radio" value="false" name="ispublic">否
            </td>
        </tr>
        <tr>
            <td>发行时间</td>
            <td><input type="date" name="bookdate"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="添加">
            </td>
        </tr>
    </table>
</form>

</body>
</html>
