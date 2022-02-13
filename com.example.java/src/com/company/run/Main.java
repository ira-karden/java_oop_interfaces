package com.company.run;

import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.type.Lorry;
import com.company.vehicles.type.SportCar;

public class Main {
    public static void main(String[] args) {
        Driver driver1 = new Driver("Ira Karden", "ukrainian", 1111, "7");
        Car car1 = new Car("Audi", "Sport", 486, driver1, 605, "Germany");
        car1.stop();
        car1.start();
        car1.turnLeft();
        car1.turnRight();
        System.out.println(car1);

        System.out.println("------------------------------LORRY-------------------------------------------------");
        Driver driver3 = new Driver("Max Verstappen", "belgian", 5445, "18");
        Lorry lorry1 = new Lorry("Mercedes", "Lorry", 2140.42, 3000, driver3, 480.5, "Germany");
        lorry1.start();
        lorry1.turnLeft();
        lorry1.turnRight();
        lorry1.stop();
        System.out.println(lorry1);

        System.out.println("-------------------------------Sport Car---------------------------------------------");
        Driver driver2 = new Driver("Michael Schumacher", "german", 2112, "40");
        Car sportCar1 = new SportCar("Ferrari", "Sport", 3200, 350, driver2, 800, "Italy");
        sportCar1.start();
        sportCar1.turnLeft();
        sportCar1.turnRight();
        sportCar1.stop();
        System.out.println(sportCar1);
    }
}
