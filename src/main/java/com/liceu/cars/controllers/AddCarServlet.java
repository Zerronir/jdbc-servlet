package com.liceu.cars.controllers;

import com.liceu.cars.services.CarSerivce;
import com.liceu.cars.services.CarServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value="/addCar")
public class AddCarServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/jsp/addCar.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        CarSerivce cs = new CarServiceImpl();
        String marca = req.getParameter("marca");
        String modelo = req.getParameter("modelo");
        String color = req.getParameter("color");
        String km = req.getParameter("km");
        String power = req.getParameter("power");

        boolean noErr = cs.addCar(marca, modelo, color, km, power);

        req.setAttribute("noerror", noErr);

        resp.sendRedirect(req.getContextPath() + "/listcar");

        RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/jsp/listcars.jsp");
        dispatcher.forward(req, resp);
    }
}
