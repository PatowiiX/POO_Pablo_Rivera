package controlador; /**Paquete controlador que maneja la lógica de la aplicación**/

import modelo.Biblioteca; /**Importa la clase Biblioteca del paquete modelo**/
import vista.BibliotecaV; /** Importa la clase BibliotecaV del paquete vista**/
import modelo.Libro; /** Importa la clase Libro del paquete modelo**/
import modelo.Usuario; /** Importa la clase Usuario del paquete modelo**/

/** Clase publica controladora que gestiona la interacción entre la vista y el modelo**/
public class BibliotecaC {

    private BibliotecaV bibliotecaV; /** Instancia de la vista de la biblioteca**/
    private Biblioteca biblioteca; /** Instancia del modelo Biblioteca**/

    /**Constructor de la clase BibliotecaC**/
    public BibliotecaC() {
        biblioteca = new Biblioteca(); /** Inicializa la instancia de Biblioteca**/
    }

    /** Metodo para agregar un libro a la biblioteca**/
    public void agregarLibro(int id, String titulo, String autor) {
        Libro libro = new Libro(id, titulo, autor); /** Crea un nuevo objeto Libro**/
        biblioteca.agregarLibro(libro); /** Agrega el libro a la biblioteca**/
    }

    /**Metodo para agregar un usuario a la biblioteca**/
    public void agregarUsuario(int id, String nombre, String email) {
        Usuario usuario = new Usuario(id, nombre, email); /** Crea un nuevo objeto Usuario**/
        biblioteca.agregarUsuario(usuario); /** Agrega el usuario a la biblioteca**/
    }

    /**Metodo para realizar un préstamo de un libro a un usuario**/
    public boolean realizarPrestamo(int idLibro, int idUsuario) {
        return biblioteca.realizarPrestamo(idLibro, idUsuario); /**Llama al metodo de préstamo en la biblioteca**/
    }

    /**Metodo para obtener el total de libros en la biblioteca**/
    public int getTotalLibros() {
        return biblioteca.getTotalLibros(); /**Devuelve el total de libros**/
    }

    /** Metodo para obtener el total de usuarios en la biblioteca**/
    public int getTotalUsuarios() {
        return biblioteca.getTotalUsuarios(); /** Devuelve el total de usuarios**/
    }

    /** Metodo para obtener el total de préstamos realizados**/
    public int getTotalPrestamos() {
        return biblioteca.getTotalPrestamos(); /** Devuelve el total de préstamos**/
    }
}