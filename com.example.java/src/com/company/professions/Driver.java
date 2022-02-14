package com.company.professions;

public class Driver extends Person {
    private String experienceOfDrive;

    public Driver(String fio, String nationality, int idCardCode, String experienceOfDrive) {
        super(fio, nationality, idCardCode);
        this.experienceOfDrive = experienceOfDrive;
    }

    public void setExperienceOfDrive(String experienceOfDrive) {
        this.experienceOfDrive = experienceOfDrive;
    }

    public String getExperienceOfDrive() {
        return experienceOfDrive;
    }
    @Override
    public String toString (){
        return "driver's fio: "+this.getFio()+", experience in years: "+this.getExperienceOfDrive();
    }
}
