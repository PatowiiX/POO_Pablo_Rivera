package edu.pablo.rivera.actividades.actividad2;

import edu.pablo.rivera.actividades.actividad2.process.Names;
import edu.pablo.rivera.actividades.actividad2.process.Numberpairs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CLI {
    private final Names names;
    private final Numberpairs numberpairs;
    private final Scanner scanner;

    public CLI() {
        names = new Names();
        numberpairs = new Numberpairs();
        scanner = new Scanner(System.in);
    }

    public void showMenu() {
        while (true) {
            System.out.println("\nMenu Actividad 2");
            System.out.println("1. Validador de Nombres");
            System.out.println("2. Numerador de Pares");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                int option = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer

                switch (option) {
                    case 1:
                        runNames();
                        break;
                    case 2:
                        runNumberPairs();
                        break;
                    case 3:
                        System.out.println("Bye...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("NO, elige otra cosa.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.nextLine(); // Limpiar la entrada inválida
            }
        }
    }

    private void runNames() {
        System.out.println("Ingresa tu nombre:");
        String nombre = scanner.nextLine(); // Captura el nombre del usuario

        // Procesa el nombre ingresado
        switch (nombre.toLowerCase()) {
            case "maria":
                System.out.println("Jelouuuu Maria, que tal?.");
                break;
            case "paula":
                System.out.println("Holis Pau, bienvenida por aca");
                break;
            case "ximena":
                System.out.println("Ximeeee, jelou por aca.");
                break;
            case "pablo":
                System.out.println("Hola gran jefe, bienvenido");
                break;
            case "arturo":
                System.out.println("Hola Arturo, que pasa?");
                break;
            default:
                System.out.println("Lo siento, no estái registrado, pero gusto en conocerte :)");
                break;
        }
    }

    private void runNumberPairs() {
        System.out.println("\nNúmeros pares:");
        for (Integer number : numberpairs.getNumberpairs()) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        CLI cli = new CLI();
        cli.showMenu();
    }
}
