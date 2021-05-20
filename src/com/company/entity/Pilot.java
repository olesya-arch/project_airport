package com.company.entity;

public class Pilot {
    private int id;
    private String firstName;
    private String lastName;
    private Rank rank;
    private String pilotID;

    public Pilot (int id, String firstName, String lastName, Rank rank, String pilotID) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.rank = rank;
        this.pilotID = pilotID;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public Rank getRank() { return rank; }

    public void setRank(Rank rank) { this.rank = rank; }

    public String getPilotID() { return pilotID; }

    public void setPilotID(String pilotID) { this.pilotID = pilotID; }

    @Override
    public String toString() {
        return "ID: " + id + ", Имя: " + firstName + ", Фамилия: " + lastName + ", Ранг: " + rank + ", Код пилота: " + pilotID;
    }
}
