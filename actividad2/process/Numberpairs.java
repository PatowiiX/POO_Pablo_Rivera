package edu.pablo.rivera.actividades.actividad2.process;

import java.util.ArrayList;
import java.util.List;

public class Numberpairs {
    private List<Integer> numberpairs;

    public Numberpairs() {
        numberpairs = new ArrayList<>();
        for (int i = 2; i <= 100; i += 2) {
            numberpairs.add(i);
        }
    }

    // Método para obtener la lista de números pares, ni le muevas ya.
    public List<Integer> getNumberpairs() {
        return numberpairs;
    }

    public static void main(String[] args) {
        int tamaño = 50;
        int[] numerosPares = new int[tamaño];

        for (int i = 0; i < tamaño; i++) {
            numerosPares[i] = 2 + (i * 2);
        }

        System.out.println("Números pares (2 hasta el 100):");
        for (int i = 0; i < tamaño; i++) {
            System.out.println(numerosPares[i]);
        }

        Numberpairs numberPairs = new Numberpairs();
        System.out.println("\nNúmeros pares desde la lista:");
        for (Integer number : numberPairs.getNumberpairs()) {
            System.out.println(number);
        }
    }
}