
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>ConsoleShop</h1>

<h2>DeleteOrder</h2>

<form method="get" action="/add">
    <p><input type="submit" value="AddOrder"></p>
</form>
<form method="post" action="/delete">
    <input type="hidden" name="_method" value="delete">
    <input type="text" name="delete">
    <p><input type="submit" value="DeleteOrder"></p>
</form>
<form method="get" action="/buy">
    <p><input type="submit" value="BuyOrder"></p>
</form>
</body>
</html>
