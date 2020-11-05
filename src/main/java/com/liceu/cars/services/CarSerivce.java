package com.liceu.cars.services;

import com.liceu.cars.daos.Car;
import java.util.List;

public interface CarSerivce {
    List<Car> getAll();

    boolean addCar(String marca, String modelo, String color, String km, String power);
}
