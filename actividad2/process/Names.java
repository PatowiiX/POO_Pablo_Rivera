package edu.pablo.rivera.actividades.actividad2.process;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Names {
    private List<String> names;

    public Names() {
        names = new ArrayList<>();
        names.add("Maria");
        names.add("Paula");
        names.add("Ximena");
        names.add("Pablo");
        names.add("Arturo");
    }
    public List<String> getNames() {
        return names;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu nombre:");
        String nombre = scanner.nextLine();

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

        scanner.close();
    }
}