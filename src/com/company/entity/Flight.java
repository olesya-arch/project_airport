package com.company.entity;

public class Flight {
    private int id;
    private int airplane;
    private int pilot;
    private String flightDate;
    private String flightTime;
    private int numberFlight;

    public Flight (int id, int airplane, int pilot, String flightDate, String flightTime, int numberFlight) {
        this.id = id;
        this.airplane = airplane;
        this.pilot = pilot;
        this.flightDate = flightDate;
        this.flightTime = flightTime;
        this.numberFlight = numberFlight;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public int getAirplane() { return airplane; }

    public void setAirplane(int airplane) { this.airplane = airplane; }

    public int getPilot() { return pilot; }

    public void setPilot(int pilot) { this.pilot = pilot; }

    public String getFlightDate() { return flightDate; }

    public void setFlightDate(String flightDate) { this.flightDate = flightDate; }

    public String getFlightTime() { return flightTime; }

    public void setFlightTime(String flightTime) { this.flightTime = flightTime; }

    public int getNumberFlight() { return numberFlight; }

    public void setNumberFlight(int numberFlight) { this.numberFlight = numberFlight; }

    @Override
    public String toString() {
        return "ID: " + id + ", ID самолёта: " + airplane + ", ID пилота: " + pilot + ", Дата: " + flightDate +
                ", Время: " + flightTime + ", Номер рейса: " + numberFlight;
    }
}
