package modelo;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

/** Clase que representa la biblioteca, que gestiona libros, usuarios y préstamos**/
public class Biblioteca {

    private List<Libro> libros; /**Lista que almacena los libros de la biblioteca**/
    private List<Usuario> usuarios; /** Lista que almacena los usuarios de la biblioteca**/
    private List<Prestamo> prestamos; /**Lista que almacena los préstamos realizados**/

    /**Constructor de la clase Biblioteca**/
    public Biblioteca() {
        libros = new ArrayList<>(); /** Inicializa la lista de libros**/
        usuarios = new ArrayList<>(); /**Inicializa la lista de usuarios**/
        prestamos = new ArrayList<>(); /** Inicializa la lista de préstamos**/
    }

    /** Metodo para agregar un libro a la biblioteca**/
    public void agregarLibro(Libro libro) {
        libros.add(libro); /**Añade el libro a la lista de libros**/
    }

    /**Metodo para agregar un usuario a la biblioteca**/
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario); /** Añade el usuario a la lista de usuarios**/
    }

    /** Metodo para realizar un préstamo de un libro a un usuario**/
    public boolean realizarPrestamo(int idLibro, int idUsuario) {
        /** Busca el libro por su ID y verifica si está disponible**/
        Libro libro = libros.stream()
                .filter(l -> l.getId() == idLibro && l.isDisponible())
                .findFirst()
                .orElse(null); /** Si no se encuentra, devuelve null**/

        /** Busca el usuario por su ID**/
        Usuario usuario = usuarios.stream()
                .filter(u -> u.getId() == idUsuario)
                .findFirst()
                .orElse(null); /** Si no se encuentra, devuelve null**/

        /** Verifica que el libro y el usuario existan y que el usuario pueda realizar un préstamo**/
        if (libro != null && usuario != null && usuario.realizarPrestamo()) {
            libro.setDisponible(false); /**Marca el libro como no disponible**/
            /** Crea un nuevo préstamo con la fecha actual con fecha maxima de 15 dias**/
            Prestamo nuevoPrestamo = new Prestamo(prestamos.size() + 1, libro, usuario, LocalDate.now(), LocalDate.now().plusDays(15));
            prestamos.add(nuevoPrestamo); /**Añade el nuevo préstamo a la lista de préstamos**/
            return true; /**Retorna true indicando que el préstamo fue exitoso**/
        }
        return false; /** Retorna false si no se pudo realizar el préstamo**/
    }

    /** Metodo para obtener el total de libros en la biblioteca**/
    public int getTotalLibros() {
        return libros.size(); /**Devuelve el tamaño de la lista de libros**/
    }

    /** Metodo para obtener el total de usuarios en la biblioteca**/
    public int getTotalUsuarios() {
        return usuarios.size(); /**Devuelve el tamaño de la lista de usuarios**/
    }

    /** Metodo para obtener el total de préstamos realizados**/
    public int getTotalPrestamos() {
        return prestamos.size(); /**Devuelve el tamaño de la lista de préstamos**/
    }
}