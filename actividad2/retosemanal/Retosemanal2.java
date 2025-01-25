package edu.pablo.rivera.actividades.actividad2.retosemanal;
import java.util.HashSet;
import java.util.Scanner;

public class Retosemanal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa algo escrito por aca: ");
        String input = scanner.nextLine();
        
        String[] cadenas = input.split(" ");

        String duplicado = encontrarPrimerDuplicado(cadenas);
        
        if (duplicado != null) {
            System.out.println("Tu primer duplicado es: " + duplicado);
        } else {
            System.out.println("No hay duplicados,yay.");
        }
        
        scanner.close(); // Cerrar el scanner, que no se te olvide Pablo del futuro, otra vez.
    }
    public static String encontrarPrimerDuplicado(String[] cadenas) {
        HashSet<String> conjunto = new HashSet<>(); 
        
        for (String cadena : cadenas) {

            if (conjunto.contains(cadena)) {
                return cadena; 
            }

            conjunto.add(cadena);
        }
        
        return null; 
    }
}



