package com.liceu.cars.controllers;
import com.liceu.cars.daos.CarDAO;
import com.liceu.cars.daos.CarServiceAccess;
import com.liceu.cars.daos.Car;
import com.liceu.cars.services.CarSerivce;
import com.liceu.cars.services.CarServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(value="/cars")
public class ListCorsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CarSerivce cs = new CarServiceImpl();
        req.setAttribute("cars", cs.getAll());
        RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/jsp/listcars.jsp");
        dispatcher.forward(req, resp);
    }
}
