package com.ecom.controljee.service;

import java.util.List;

public interface CarService {
    public void addCar();
    public void deleteCar();
    public void updateCar();
    public void getCar();
    public void getAllCars();
    CarService carService = new CarManager();

    List<String> getAllColors();

    List<String> getAllModels();

    List<String> getAllMatricules();

    List<String> getAllPrices();

    List<String> getAllTypes();

    List<String> getAllBrands();
}
