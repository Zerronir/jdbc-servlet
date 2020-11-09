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

    <c:if test="${not empty error}">
        <h3>Error, no se ha podido añadir el coche</h3>
    </c:if>

    <form action="/addCar" method="post">
        <div class="form-group">
            <label for="marca">Marca:</label>
            <input type="text" class="form-control" placeholder="Enter email" name="marca" id="marca">
        </div>
        <div class="form-group">
            <label for="modelo">Modelo:</label>
            <input type="text" class="form-control" placeholder="Enter email" name="modelo" id="modelo">
        </div>
        <div class="form-group">
            <label for="color">Color:</label>
            <input type="text" class="form-control" placeholder="Enter email" name="color" id="color">
        </div>
        <div class="form-group">
            <label for="km">Kilometros:</label>
            <input type="text" class="form-control" placeholder="Enter email" name="km" id="km">
        </div>
        <div class="form-group">
            <label for="pot">Potencia:</label>
            <input type="text" class="form-control" placeholder="Cavallos" name="pot" id="pot">
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>



    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

    <!-- Popper JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
