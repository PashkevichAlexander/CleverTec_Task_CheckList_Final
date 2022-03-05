<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 16.02.2022
  Time: 18:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ConsoleShop</title>
</head>
<body>
<p>ConsoleShop</p>

<form method="post" action="/CleverTec_Task_CheckList_Final_war_exploded//FirstServlet">
    <p><input type="submit" value="AddOrder"></p>
</form>

<form method="post" action="/CleverTec_Task_CheckList_Final_war_exploded//FirstServlet">
    <p><input type="submit" name="doDelete" value="DeleteOrder"></p>
</form>

<form method="post" action="/CleverTec_Task_CheckList_Final_war_exploded//FirstServlet">
<p><input type="submit" value="BuyOrder"></p>

</form>
</body>

</html>
