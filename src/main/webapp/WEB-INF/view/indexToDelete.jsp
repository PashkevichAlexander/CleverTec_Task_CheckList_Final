<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 28.02.2022
  Time: 19:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<p>Hello3</p>
<form method="post" action="/delete">
    <input type="hidden" name="_method" value="delete">
    <input type="text" name="field">
    <p><input type="submit" value="DeleteOrder"></p>
</form>
</body>
</html>
