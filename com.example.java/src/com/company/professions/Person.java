package com.company.professions;

public abstract class Person {
    private String fio;
    private String nationality;
    private int idCardCode;

    public Person(String fio, String nationality, int idCardCode) {
        this.fio = fio;
        this.nationality = nationality;
        this.idCardCode = idCardCode;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setIdCardCode(int idCardCode) {
        this.idCardCode = idCardCode;
    }

    public String getFio() {
        return fio;
    }

    public String getNationality() {
        return nationality;
    }

    public int getIdCardCode() {
        return idCardCode;
    }
}
