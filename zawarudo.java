package edu.pablo.rivera.actividades.actividad2.retosemanal;

import java.util.Scanner; 

public class zawarudo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Ingresa algo aca: ");
        String original = scanner.nextLine(); 
        
      
        System.out.println( original);
        
        String reversed = reverseString(original);
        
    
        System.out.println(reversed);
        
        scanner.close(); 
    }
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str); 
        return reversed.reverse().toString(); 
    }
}