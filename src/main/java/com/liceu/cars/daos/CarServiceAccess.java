package com.liceu.cars.daos;

import com.liceu.cars.daos.CarDAO;
import com.liceu.cars.Car;

import javax.sql.ConnectionEvent;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class CarServiceAccess implements CarDAO {

    static void initConnection() {
        Connection connection;
        try{
            String url = "jdbc:sqlite:/Users/raulmiralles/Documents/FPGSDAW/SEGUNDO/jdbcDEMO/database.db";

            if(connection == null){

            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public List<Car> getAll() {

        List<Car> cars = new ArrayList<>();

        return null;
    }

    @Override
    public void addCar(Car c) {

    }

    @Override
    public void deleteCar(Car c) {

    }

    @Override
    public void update(Car c) {

    }

    @Override
    public Car getFromId(int id) {
        return null;
    }

    @Override
    public List<Car> getColors(String color) {
        return null;
    }
}
