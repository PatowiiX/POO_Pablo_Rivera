package edu.pablo.rivera.actividades.Actividad1.process;

import java.util.ArrayList;

import edu.pablo.rivera.actividades.Actividad1.models.Car;

public class StockManager {
    private ArrayList<Car> stock;

    public StockManager() {
        this.stock = new ArrayList<>();
    }

    public void addCar(String brand, String model, String bodyType, int year, String color) {
        if (year <= 1953) {
            throw new IllegalArgumentException("El año debe ser mayor que 1953");
        }

        switch (bodyType.toLowerCase()) {
            case "sedan":
            case "suv":
            case "hatchback":
            case "coupe":
            case "convertible":
            case "pickup":
            case "wagon":
                Car car = new Car(brand, model, bodyType, year, color);
                stock.add(car);
                System.out.println("Carro agregado: " + brand + " " + model + " (" + bodyType + ")");
                break;
            default:
                throw new IllegalArgumentException("Tipo de carrocería no válido: " + bodyType);
        }
    }

    public void showStock() {
        if (stock.isEmpty()) {
            System.out.println("No hay carros en el inventario.");
        } else {
      
            System.out.printf("%-20s %-20s %-15s %-15s %-20s%n", "Marca", "Modelo", "Año", "Color", "Tipo de carrocería"); // Encabezados
            System.out.println("---------------------------------------------------------------------------------------------");
            for (Car car : stock) {
               
                System.out.printf("%-20s %-20s %-15d %-20s %-20s%n", 
                                  car.getBrand(), 
                                  car.getModel(), 
                                  car.getYear(), 
                                  car.getColor(),
                                  car.getBodyType()); 
            }
        }
    }
}
