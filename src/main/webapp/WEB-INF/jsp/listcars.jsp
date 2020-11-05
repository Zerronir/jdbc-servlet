<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: raulmiralles
  Date: 04/11/2020
  Time: 19:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <p>Cotxes</p>

    <table>
        <tr>
            <th>id</th>
            <th>Model</th>
            <th>Marca</th>
            <th>Color</th>
            <th>km</th>
            <th>Potencia</th>
        </tr>

        <c:forEach var="c" items="${list}">
            <tr>
                <td>${c.id}</td>
                <td>${c.model}</td>
                <td>${c.marca}</td>
                <td>${c.color}</td>
                <td>${c.km}</td>
                <td>${c.power}</td>
            </tr>
        </c:forEach>

    </table>
    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

    <!-- Popper JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
