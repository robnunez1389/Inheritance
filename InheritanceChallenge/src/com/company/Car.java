package com.company;

public class Car extends Vehicle{

    private int doors;
    private boolean handSteering = true;

    public int getDoors() {
        return doors;
    }

    public Car(int doors) {
        this.doors = doors;
    }

    @Override
    public void move(int speed) {
        super.move(speed);
        System.out.println("Car is moving.");
    }
}
