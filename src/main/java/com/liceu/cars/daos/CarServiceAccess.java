package com.liceu.cars.daos;

import com.liceu.cars.daos.CarDAO;
import com.liceu.cars.Car;
import com.liceu.cars.daos.Database;

import javax.sql.ConnectionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CarServiceAccess implements CarDAO {

    static Connection connection;

    @Override
    public List<Car> getAll() {
        List<Car> carList = new ArrayList<>();
        try{

            Connection c = Database.getConnection();
            PreparedStatement ps = c.prepareStatement("Select * from cars");

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                int id = rs.getInt(0);
                String model = rs.getString(1);
                String marca = rs.getString(2);
                String color = rs.getString(3);
                int km = rs.getInt(4);
                int power = rs.getInt(5);

                Car car = new Car(id, model, marca, color, km, power);
                carList.add(car);
            }


        }catch (Exception e) {
            e.printStackTrace();
        }

        return carList;
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
