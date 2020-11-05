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
</head>
<body>
    <p>Cotxes</p>

    <table>
        <th>
            <td>id</td>
            <td>Model</td>
            <td>Marca</td>
            <td>Color</td>
            <td>km</td>
            <td>Potencia</td>
        </th>

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

</body>
</html>
