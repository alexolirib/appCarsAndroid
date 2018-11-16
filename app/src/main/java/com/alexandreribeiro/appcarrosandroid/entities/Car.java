package com.alexandreribeiro.appcarrosandroid.entities;

import android.graphics.drawable.Drawable;

public class Car {
    private Integer id;
    private String model;
    private String manufacture;
    private Integer horsePower;
    private Double price;
    private Drawable picture;

    public Car(Integer id, String model, String manufacture, Integer horsePower, Double price, Drawable picture) {
        this.id = id;
        this.model = model;
        this.manufacture = manufacture;
        this.horsePower = horsePower;
        this.price = price;
        this.picture = picture;
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

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
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

    public Drawable getPicture() {
        return picture;
    }

    public void setPicture(Drawable picture) {
        this.picture = picture;
    }
}