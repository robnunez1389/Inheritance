package com.company;

public class Coupe extends Car{

    private int topSpeed;
    private int horsepower;

    public Coupe(int topSpeed, int horsepower) {
        super(2);
        this.topSpeed = topSpeed;
        this.horsepower = horsepower;
    }

    @Override
    public void move(int speed) {
        if(speed > this.topSpeed){
            super.move(topSpeed);
            super.setSpeed(topSpeed);
        }else{
            super.move(speed);
            super.setSpeed(speed);
        }
        System.out.println("Coupe is moving");
    }

    public void getToTopSpeed(){
        System.out.println("Moving Coupe at top speed at " + topSpeed + "MPH");
        super.setSpeed(topSpeed);
    }
}
