package com.company;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.move(40);
        Car sedan = new Car(4);
        sedan.move(50);
        Coupe coupe = new Coupe(130, 300);
        System.out.println(coupe.getDoors());
        coupe.move(100);
        coupe.getToTopSpeed();
        System.out.println(coupe.getSpeed());
        coupe.setSpeed(75);
        System.out.println(coupe.getSpeed());
        coupe.move(200);
        System.out.println(coupe.getSpeed());
    }
}
