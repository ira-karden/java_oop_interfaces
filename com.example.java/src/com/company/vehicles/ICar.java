package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public interface ICar {
    public String getBrand();
    public void setBrand(String brand);
    public String getType();
    public void setType(String type);
    public double getWeight();
    public void setWeight(double weight);
    public Engine getEngine();
    public Driver getDriver();
    public void setDriver(Driver driver);
    public void start();
    public void stop();
    public void turnRight();
    public  void turnLeft();
    public String toString();
}
