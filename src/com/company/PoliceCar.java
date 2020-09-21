package com.company;

public class PoliceCar extends FastVehicle{

    @Override
    public void driveSlow() {
        System.out.println("I can drive slow");
    }

    @Override
    public void driveFast() {
        System.out.println("I can drive fast");
    }
}
