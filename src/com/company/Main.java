package com.company;

public class Main {

    public static void main(String[] args) {
	PoliceCar policeCar = new PoliceCar();
	RaceCar raceCar = new RaceCar();
	DumpTruck dumpTruck = new DumpTruck();
	policeCar.driveFast();
    raceCar.driveSlow();
    dumpTruck.driveSlow();
    }
}
abstract class Vehicle{
    public abstract void driveSlow();
}
abstract class FastVehicle extends Vehicle{
    public abstract void driveFast();
}

