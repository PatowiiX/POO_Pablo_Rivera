package edu.pablo.rivera.actividades.Actividad1.ui;

import java.util.Scanner;

public class CLI {
    private Scanner scanner;

    public CLI() {
        scanner = new Scanner(System.in);
    }

    public void showMenu() {
        System.out.println("Hi, bienvenido a Actividad 1!");
        System.out.println("1. Subir Carro");
        System.out.println("2. Mostrar Catalogo");
        System.out.println("3. Salir");
    }

    public String getUserInput() {
        return scanner.nextLine();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public void closeScanner() {
        scanner.close();
    }
}