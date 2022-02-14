package com.company.details;

public class Engine implements IEngine{
    private double power;
    private String producer;

    public Engine(double power, String producer) {
        this.power = power;
        this.producer = producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getPower() {
        return power;
    }
    @Override
    public String toString(){
        return "engine's producer: "+producer+", engine's power: "+power;
    }

    public void start(){
        System.out.println("Поехали");
    }
    public void stop(){
        System.out.println("Останавливаемся");
    }
}
