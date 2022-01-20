package com.solvd.model;

public class Auditory {
    private int id;
    private int number;
    private int numberOfSeats;

    public int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Auditory{" +
                "id=" + id +
                ", number=" + number +
                ", numberOfSeats=" + numberOfSeats +
                '}';
    }
}
