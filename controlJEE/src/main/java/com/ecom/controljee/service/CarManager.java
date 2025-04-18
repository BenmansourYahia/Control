package com.ecom.controljee.service;

import java.util.List;

public class CarManager implements CarService {
    @Override
    public void addCar() {
    }

    @Override
    public void deleteCar() {
        System.out.println("Car deleted");
    }

    @Override
    public void updateCar() {
        System.out.println("Car updated");
    }

    @Override
    public void getCar() {
        System.out.println("Car retrieved");
    }

    @Override
    public void getAllCars() {
        System.out.println("All cars retrieved");
    }

    @Override
    public List<String> getAllColors() {
        return List.of();
    }

    @Override
    public List<String> getAllModels() {
        return List.of();
    }

    @Override
    public List<String> getAllMatricules() {
        return List.of();
    }

    @Override
    public List<String> getAllPrices() {
        return List.of();
    }

    @Override
    public List<String> getAllTypes() {
        return List.of();
    }

    @Override
    public List<String> getAllBrands() {
        return List.of();
    }
}
