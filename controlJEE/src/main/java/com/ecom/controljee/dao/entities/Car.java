package com.ecom.controljee.dao.entities;

public class Car {

    private Integer id_Car;
    private String model;
    private String color;
    private String matricule;
    private Integer price;

    public Car(Integer id_Car, String model, String color, String matricule, Integer price) {
        this.id_Car = id_Car;
        this.model = model;
        this.color = color;
        this.matricule = matricule;
        this.price = price;
    }

    public Integer getId_Car() {
        return id_Car;
    }
    public void setId_Car(Integer id_Car) {
        this.id_Car = id_Car;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getMatricule() {
        return matricule;
    }
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public void addCar(){
        System.out.println("Car added");
        System.out.println(this);
        System.out.println("Car added");
    }
    public void deleteCar(){
        System.out.println("Car deleted");
        System.out.println(this);
        System.out.println("Car deleted");
    }
    public void updateCar(){
        System.out.println("Car updated");
    }
    public int getCar(){
        System.out.println("Car retrieved");
        return 0;
    }
    public void getAllCars(){
        System.out.println("All cars retrieved");
    }
    public void afficher(){
        System.out.println("Affichage de la liste des cars");
    }
    public void afficherCar(){
        System.out.println(getCar());
    }

    @Override
    public String toString() {
        return "Car{" + "id_Car=" + id_Car + ", model=" + model + ", color=" + color + ", matricule=" + matricule + ", price=" + price + '}';
    }

}
