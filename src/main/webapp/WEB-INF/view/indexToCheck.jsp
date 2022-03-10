<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.Date" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>SuperMarket</h2>
<%--send date from server--%>
<h2><%= new Date()%></h2>
<table>
    <thead>
    <tr>
        <td>id</td>
        <td>name</td>
        <td>cost</td>
        <td>value</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${check.map}" var="entry" >
        <tr>
        <td>${entry.key.id}</td>
        <td>${entry.key.name}</td>
        <td>${entry.key.cost}</td>
        <td>${entry.value}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>


<p>Total =${check.total}</p>
<p>TotalSum =${check.totalSum}</p>
<p>discount =${check.discount}</p>

</body>
</html>
