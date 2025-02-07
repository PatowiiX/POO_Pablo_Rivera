
import controlador.BibliotecaC;
import modelo.Language;
import vista.BibliotecaV;

public class Starter {

    public static void main(String[] args) {

        Language.seleccionarIdioma();

        BibliotecaC controller = new BibliotecaC();
        BibliotecaV view = new BibliotecaV(controller);
        System.out.println(Language.getMenuMessage());

        view.mostrarMenu();
    }
}