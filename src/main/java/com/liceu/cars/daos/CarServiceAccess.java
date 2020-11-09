package com.liceu.cars.daos;

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
            PreparedStatement ps = c.prepareStatement("Select * from car");

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                int id = rs.getInt(1);
                String model = rs.getString(2);
                String marca = rs.getString(3);
                String color = rs.getString(4);
                int km = rs.getInt(5);
                int power = rs.getInt(6);

                Car car = new Car(id, model, marca, color, km, power);
                carList.add(car);
            }


        }catch (Exception e) {
            e.printStackTrace();
        }

        return carList;
    }

    @Override
    public boolean addCar(Car c) {
        try{
            Connection con = Database.getConnection();

            PreparedStatement ps = con.prepareStatement("INSERT INTO car (model, marca, color, km, power) VALUES (?, ?, ?, ?, ?)");
            ps.setString(1, c.getModel());
            ps.setString(2, c.getMarca());
            ps.setString(3, c.getColor());
            ps.setInt(4, c.getKm());
            ps.setInt(5, c.getPower());

            ps.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

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
