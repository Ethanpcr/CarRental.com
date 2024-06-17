package com.carrental.models;

public class Car {
    private int id;
    private String model;
    private String registrationNumber;
    private boolean available;

    public Car(int id, String model, String registrationNumber, boolean available) {
        this.id = id;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.available = available;
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

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
