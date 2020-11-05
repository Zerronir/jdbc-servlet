package com.liceu.cars.daos;

import java.util.List;

public interface CarDAO {

    List<Car> getAll();
    void addCar(Car c);
    void deleteCar(Car c);
    void update(Car c);

    Car getFromId(int id);
    List<Car> getColors(String color);

}
