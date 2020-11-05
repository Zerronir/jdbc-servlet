package com.liceu.cars.controllers;
import com.liceu.cars.daos.CarDAO;
import com.liceu.cars.daos.CarServiceAccess;
import com.liceu.cars.Car;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(value="/listcars")
public class ListCorsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CarDAO cd = new CarServiceAccess();
        List<Car> list = cd.getAll();
        req.setAttribute("cars", list);
        RequestDispatcher dispatcher = req.getRequestDispatcher("./WEB-INF/jsp/listcars.jsp");
        dispatcher.forward(req, resp);
    }
}
