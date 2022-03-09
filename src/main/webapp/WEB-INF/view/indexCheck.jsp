<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.Date" pageEncoding="utf-8" %>
<%@ page import="task.entity.DiscountsState" %>
<%@page import="singleton.BasketSingleton" %>
<%@ page import="task.entity.DiscountCard" %>
<%@ page import="java.util.stream.Collectors" %>

<%
    DiscountCard discountCard = new DiscountCard(true);
    BasketSingleton basketSingleton = BasketSingleton.getInstance(discountCard);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>SuperMarket</h2>
<h2><%= new Date()%>
    <p>
        <%
            System.out.println(basketSingleton
                    .getBasket()
                    .getItems()
                    .entrySet()
                    .stream()
                    .map(entry -> {
                        int cost = entry.getKey().getCost() * entry.getValue();
                        int totalCost = cost;
                        if (basketSingleton.getBasket().getCard().isId() && entry.getKey().getDiscounts().contains(DiscountsState.DISCOUNT_ALLOWED)) {
                            totalCost = cost - cost / 10;
                        }
                        return String.format("%-10s %-10s %-10s %-10s", entry.getValue(), entry.getKey().getName(), cost, totalCost);
                    })
                    .collect(Collectors.joining("\n")));
        %>
    </p>
</body>
</html>
