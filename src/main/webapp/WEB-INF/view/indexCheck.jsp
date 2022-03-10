<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.Date" pageEncoding="utf-8" %>
<%@page import="java.util.Map" pageEncoding="UTF-8" %>
<%@ page import="java.util.Set" %>
<%@ page import="java.util.Collection" %>
<%@ page import="task.entity.Item" %>
<%@ page import="task.entity.Check" %>

<%
    Check check;
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>SuperMarket</h2>
<h2><%= new Date()%>
</h2>
<p>
<table>
    <thead></thead>
    <tbody>
    <c:forEach var="entry" items="${map}">
        <th>
        <td>${entry.key}</td>
        <td>${entry.value}</td>
        </th>
    </c:forEach>
    </tbody>
</table>
</p>
</body>
</html>
