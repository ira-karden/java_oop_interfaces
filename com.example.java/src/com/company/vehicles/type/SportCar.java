package com.company.vehicles.type;

import com.company.professions.Driver;
import com.company.vehicles.Car;

public class SportCar extends Car {
    private double topSpeed;
    public SportCar(String brand, String type, double weight, double topSpeed, Driver driver, double power, String producer) {
        super(brand, type, weight, driver, power, producer);
        this.topSpeed = topSpeed;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString(){
        return  "brand: "+this.getBrand()+", class: "+this.getType()+", weight: "+this.getWeight()+", top speed: "+topSpeed+", "+getEngine().toString()+", "+getDriver().toString();
    }
}
