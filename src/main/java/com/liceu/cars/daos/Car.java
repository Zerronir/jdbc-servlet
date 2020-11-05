package com.liceu.cars.daos;

public class Car {
    int id;
    String marca = "";
    String color = "";
    String model;
    int km;
    int power;

    public Car(int id, String marca, String model, String color, int km, int power) {
        this.marca = marca;
        this.color = color;
        this.km = km;
        this.power = power;
        this.model = model;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
