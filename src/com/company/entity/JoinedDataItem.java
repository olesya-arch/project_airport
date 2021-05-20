package com.company.entity;

public class JoinedDataItem {

    private int numberFlight;
    private String flightDate;
    private String flightTime;
    private String tailNumber;
    private String brand;
    private String model;
    private int passengerCapacity;
    private String lastName;
    private String firstName;
    private String pilotID;
    private String rank;

    public JoinedDataItem (int numberFlight, String flightDate, String flightTime, String tailNumber, String brand,String model,
                           int passengerCapacity, String lastName, String firstName, String pilotID, String rank) {
        this.numberFlight = numberFlight;
        this.flightDate = flightDate;
        this.flightTime = flightTime;
        this.tailNumber = tailNumber;
        this.brand = brand;
        this.model = model;
        this.passengerCapacity = passengerCapacity;
        this.lastName = lastName;
        this.firstName = firstName;
        this.pilotID = pilotID;
        this.rank = rank;
    }

    public int getNumberFlight() { return numberFlight;}

    public void setNumberFlight(int numberFlight) { this.numberFlight = numberFlight; }

    public String getFlightDate() { return flightDate;}

    public void setFlightDate(String flightDate) { this.flightDate = flightDate; }

    public String getFlightTime() { return flightTime; }

    public void setFlightTime(String flightTime) { this.flightTime = flightTime; }

    public String getTailNumber() { return tailNumber; }

    public void setTailNumber(String tailNumber) { this.tailNumber = tailNumber; }

    public String getBrand() { return brand; }

    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }

    public void setModel(String model) { this.model = model; }

    public int getPassengerCapacity() { return passengerCapacity; }

    public void setPassengerCapacity(int passengerCapacity) { this.passengerCapacity = passengerCapacity; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getPilotID() { return pilotID; }

    public void setPilotID(String pilotID) { this.pilotID = pilotID; }

    public String  getRank() { return rank; }

    public void setRank(String rank) { this.rank = rank; }

    @Override
    public String toString() {
        return "Номер рейса: " + numberFlight + "; Дата рейса: " + flightDate + "; Время рейса: " + flightTime +
                "; Бортовой номер самолёта: " + tailNumber +"; Марка и модель самолёта: " + brand + " " + model +
                "; Вместимость пассажиров: " + passengerCapacity + "; Фамилия и имя пилота: " + lastName +
                " " + firstName.charAt(0) + "." +"; Уникальный код и ранг пилота: " + pilotID + " "+ "("+ rank +")"+" \n ";
    }
}
