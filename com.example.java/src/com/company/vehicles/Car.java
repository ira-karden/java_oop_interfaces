package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car implements ICar{
    private String brand;
    private String type;
    private double weight;
    private Engine engine;
    private Driver driver;

    public Car(String brand, String type, double weight, Driver driver, double power, String producer) {
        this.engine = new Engine(power, producer);
        this.brand = brand;
        this.type = type;
        this.weight = weight;
        this.driver = driver;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Engine getEngine() {
        return engine;
    }


    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void turnRight(){
        System.out.println("Поворот направо");
    }
    public  void turnLeft(){
        System.out.println("Поворот налево");
    }
    @Override
    public String toString(){
        return "brand: "+brand+", class: "+type+", weight: "+weight+", "+engine.toString()+", "+driver.toString();

    }
}
