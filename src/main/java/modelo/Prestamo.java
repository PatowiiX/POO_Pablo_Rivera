package modelo;

import java.time.LocalDate; /** Importa la clase LocalDate para manejar fechas**/


public class Prestamo {

    private int id; /** ID del préstamo**/
    private Libro libro; /**Libro que se presta**/
    private Usuario usuario; /** Usuario que realiza el préstamo**/
    private LocalDate fechaPrestamo; /**Fecha en que se realiza el préstamo**/
    private LocalDate fechaDevolucion; /** Fecha en que se debe devolver el libro**/

    /**Constructor que inicializa un préstamo con su ID, libro, usuario y fechas**/
    public Prestamo(int id, Libro libro, Usuario usuario, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        this.id = id; /**Asigna el ID del préstamo**/
        this.libro = libro; /**Asigna el libro prestado**/
        this.usuario = usuario; /** Asigna el usuario que realiza el préstamo**/
        this.fechaPrestamo = fechaPrestamo; /** Asigna la fecha de préstamo**/
        this.fechaDevolucion = fechaDevolucion; /**Asigna la fecha de devolución**/
    }

    /**Metodo para obtener el ID del préstamo**/
    public int getId() {
        return id; /** Devuelve el ID del préstamo**/
    }

    /** Metodo para obtener el libro prestado**/
    public Libro getLibro() {
        return libro; /**Devuelve el libro asociado al préstamo**/
    }

    /**Metodo para obtener el usuario que realizó el préstamo**/
    public Usuario getUsuario() {
        return usuario; /**Devuelve el usuario asociado al préstamo**/
    }

    /** Metodo para obtener la fecha de préstamo**/
    public LocalDate getFechaPrestamo() {
        return fechaPrestamo; /**Devuelve la fecha en que se realizó el préstamo**/
    }

    /** Metodo para obtener la fecha de devolución**/
    public LocalDate getFechaDevolucion() {
        return fechaDevolucion; /** Devuelve la fecha en que se debe devolver el libro**/
    }
}

