
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<H1>ConsoleShop</H1>

<h2>Buy</h2>

<form method="get" action="/add">
    <p><input type="submit" value="AddOrder"></p>
</form>
<form method="get" action="/delete">
    <p><input type="submit" value="DeleteOrder"></p>
</form>
<form method="post" action="/buy">
    <p><input type="submit" value="BuyOrder"></p>
</form>

<p>${check}</p>

</body>
</html>
