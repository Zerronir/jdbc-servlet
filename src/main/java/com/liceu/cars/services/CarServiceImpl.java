package com.liceu.cars.services;

import com.liceu.cars.daos.Car;
import com.liceu.cars.daos.CarDAO;
import com.liceu.cars.daos.CarServiceAccess;

import java.util.List;

public class CarServiceImpl implements CarSerivce {

    @Override
    public List<Car> getAll() {
        CarDAO cd = new CarServiceAccess();
        List<Car> cars = cd.getAll();
        return cars;
    }

    @Override
    public boolean addCar(String marca, String modelo, String color, String km, String power) {

        try {

            Car c = new Car(0, marca, modelo, color, Integer.parseInt(km), Integer.parseInt(power));
            CarDAO cd = new CarServiceAccess();
            cd.addCar(c);


            return true;
        }catch (Exception e){
            return false;
        }
    }


}
