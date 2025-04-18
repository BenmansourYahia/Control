package com.ecom.controljee;

import com.ecom.controljee.dao.entities.Car;
import com.ecom.controljee.service.CarManager;
import com.ecom.controljee.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarApplication implements CommandLineRunner {
    private CarService CarService;
@Autowired
    public static void main(String[] args) {
        SpringApplication.run(CarApplication.class, args);
    CarService CarService;
    Car car = new Car(1,"Mercedes","Black","ABCUEUE",10000);
Car car1 = new Car(2,"BMW","White","ZEZEZZE",20000);
Car car2 = new Car(3,"Audi","Red","GHIDDJHDHJA",30000);
Car car3 = new Car(4,"Ferrari","Yellow","KSSKNSIJDO",40000);
car.addCar();
car.afficherCar();
car1.addCar();
car1.afficherCar();
car2.addCar();
car3.afficherCar();
car3.addCar();
car3.afficherCar();

    }
    @Override
    public void run(String... args) throws Exception {

    }
}
