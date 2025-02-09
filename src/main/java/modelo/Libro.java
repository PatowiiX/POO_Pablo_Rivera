package modelo;

public class Libro {

    private int id; /** ID del libro**/
    private String titulo; /** Título del libro**/
    private String autor; /** Autor del libro**/
    private boolean disponible; /** Estado de disponibilidad del libro**/

    /** Constructor que inicializa un libro con su ID, título y autor**/
    public Libro(int id, String titulo, String autor) {
        this.id = id; /** Asigna el ID del libro**/
        this.titulo = titulo; /** Asigna el título del libro**/
        this.autor = autor; /** Asigna el autor del libro**/
        this.disponible = true; /** Inicialmente, el libro está disponible**/
    }

    /** Metodo para obtener el ID del libro**/
    public int getId() {
        return id; /** Devuelve el ID del libro**/
    }

    /** Metodo para obtener el título del libro**/
    public String getTitulo() {
        return titulo; /** Devuelve el título del libro**/
    }

    /**Metodo para obtener el autor del libro**/
    public String getAutor() {
        return autor; /** Devuelve el autor del libro**/
    }

    /** Metodo para verificar si el libro está disponible**/
    public boolean isDisponible() {
        return disponible; /** Devuelve el estado de disponibilidad**/
    }

    /** Método para establecer la disponibilidad del libro**/
    public void setDisponible(boolean disponible) {
        this.disponible = disponible; /**Actualiza el estado de disponibilidad**/
    }
}