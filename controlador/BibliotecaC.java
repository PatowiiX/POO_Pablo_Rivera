package controlador;

import modelo.Biblioteca;
import modelo.Libro;
import modelo.Usuario;

public class BibliotecaC {

    private Biblioteca biblioteca;

    public BibliotecaC() {
        biblioteca = new Biblioteca();
    }

    public void agregarLibro(int id, String titulo, String autor, int anoPublicacion) {
        Libro libro = new Libro(id, titulo, autor, anoPublicacion);
        biblioteca.agregarLibro(libro);
    }

    public void agregarUsuario(int id, String nombre, String email) {
        Usuario usuario = new Usuario(id, nombre, email);
        biblioteca.agregarUsuario(usuario);
    }

    public boolean realizarPrestamo(int idLibro, int idUsuario) {
        return biblioteca.realizarPrestamo(idLibro, idUsuario);
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }
    public int getTotalLibros(){
        return biblioteca.getTotalLibros();
    } public int getTotalUsuarios(){
        return biblioteca.getTotalUsuarios();
    } public int getTotalPrestamos(){
        return biblioteca.getTotalPrestamos();
    }



}