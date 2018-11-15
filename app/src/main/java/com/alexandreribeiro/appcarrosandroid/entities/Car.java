package com.alexandreribeiro.appcarrosandroid.entities;

public class Car {
    private Integer id;
    private String model;
    private Integer horsePower;
    private Double price;

    public Car(Integer id, String model, Integer horsePower, Double price) {
        this.id = id;
        this.model = model;
        this.horsePower = horsePower;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
