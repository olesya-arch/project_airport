package com.company.entity;

public class Airplane {
    private int id;
    private String brand;
    private String model;
    private int passengerCapacity;
    private String tailNumber;

    public Airplane (int id, String brand, String model, int passengerCapacity, String tailNumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.passengerCapacity = passengerCapacity;
        this.tailNumber = tailNumber;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getBrand() { return brand; }

    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }

    public void setModel(String model) { this.model = model; }

    public int getPassengerCapacity() { return passengerCapacity; }

    public void setPassengerCapacity(int passengerCapacity) { this.passengerCapacity = passengerCapacity; }

    public String getTailNumber() { return tailNumber; }

    public void setTailNumber(String tailNumber) { this.tailNumber = tailNumber; }

    @Override
    public String toString() {
        return  "ID: " + id + ", Марка: " + brand + ", Модель: " + model + ", Вместимость пассажиров:  " + passengerCapacity +
                ", Бортовой номер: " + tailNumber;
    }
}
