package com.company.vehicles.type;

import com.company.professions.Driver;
import com.company.vehicles.Car;

public class Lorry extends Car {
    private double loadCapacity;
    public Lorry(String brand, String type, double weight, double loadCapacity, Driver driver, double power, String producer) {
        super(brand, type, weight, driver, power, producer);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString(){
        return  "brand: "+this.getBrand()+", class: "+this.getType()+", weight: "+this.getWeight()+", load capacity: "+loadCapacity+", "+getEngine().toString()+", "+getDriver().toString();
    }
}
