package edu.pablo.rivera.actividades.Actividad1.models;

public class Car {
    private final String brand;
    private String model;
    private String bodyType;
    private int year;
    private String color;

    public Car(String brand, String model, String bodyType, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.bodyType = bodyType;
        this.year = year; 
        this.color = color; 
    }

    
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }   

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public void setYear(int year) {
        if (year > 1953) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("El año debe de ser mayor a 1953");
        }
    }

    public void setColor(String color) {
        this.color = color;
    }
}