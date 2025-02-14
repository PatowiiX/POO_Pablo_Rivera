import vista.Vista;
import vista.Idioma;
import vista.IdiomaEspañol;
import vista.IdiomaIngles;

import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el idioma (español/ingles): ");
        String idiomaSeleccionado = scanner.nextLine();

        Idioma idioma;
        if (idiomaSeleccionado.equalsIgnoreCase("español")) {
            idioma = new IdiomaEspañol();
        } else if (idiomaSeleccionado.equalsIgnoreCase("ingles")) {
            idioma = new IdiomaIngles();
        } else {
            System.out.println("Idioma no válido. Se usará español por defecto.");
            idioma = new IdiomaEspañol();
        }

        Vista vista = new Vista(idioma); 
        vista.mostrarMenu();
    }
}