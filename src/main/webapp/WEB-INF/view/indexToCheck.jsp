<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.Date" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <title>ConsoleShop</title></head>
<body>
<div class="mx-auto" style="width: 400px;">
<h2>SuperMarket</h2>
<h2><%= new Date()%></h2>
    <div class="container">
        <div class="row">
            <div class="col-sm">
                id
            </div>
            <div class="col-sm">
                name
            </div>
            <div class="col-sm">
                cost
            </div>
            <div class="col-sm">
                value
            </div>
        </div>
        <c:forEach items="${check.map}" var="entry">
            <tr>
                <div class="row">
                    <div class="col-sm">${entry.key.id}</div>
                    <div class="col-sm">${entry.key.name}</div>
                    <div class="col-sm">${entry.key.cost}</div>
                    <div class="col-sm">${entry.value}</div>
                </div>
            </tr>
        </c:forEach>
    </div>
</div>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
</body>
</html>
