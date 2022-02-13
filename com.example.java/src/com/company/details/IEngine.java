package com.company.details;

public interface IEngine {

    public void setProducer(String producer);
    public String getProducer();
    public void setPower(double power);
    public double getPower();
    public String toString();
    public void start();
    public void stop();
}
