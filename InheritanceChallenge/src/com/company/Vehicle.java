package com.company;

public class Vehicle {
    private int speed;
    private boolean changeGears = false;

    public void move(int speed){
        this.speed = speed;
        System.out.println("The vehicle is moving at " + speed + "MPH.");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
