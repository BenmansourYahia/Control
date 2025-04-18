package com.ecom.controljee.dao.repositories;

import com.ecom.controljee.dao.entities.Car;

public class CarRepository {
    public CarRepository() {
        super();
    }

    public void addCar() {
        System.out.println("Car added");
    }

    public void deleteCar() {
        System.out.println("Car deleted");
    }

    public void updateCar() {
        System.out.println("Car updated");
    }

    public void getCar() {
        System.out.println("Car retrieved");
    }

    public void getAllCars() {
        System.out.println("All cars retrieved");
    }

    public void afficher() {
        System.out.println("Affichage de la liste des cars");
    }

    public void afficherCar(Car car) {
        System.out.println(car);
    }

}
