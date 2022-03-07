
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>ConsoleShop</h1>

<h2>AddOrder</h2>

<form method="post" action="/add">
    <input type="hidden" name="_method" value="add">
    <input type="text" name="add1">
    <input type="hidden" name="_method" value="add">
    <input type="text" name="add2">
    <p><input type="submit" value="AddOrder"></p>
</form>

<form method="get" action="/delete">
    <p><input type="submit" value="DeleteOrder"></p>
</form>
<form method="get" action="/buy">
    <p><input type="submit" value="BuyOrder"></p>
</form>
</body>
</html>
