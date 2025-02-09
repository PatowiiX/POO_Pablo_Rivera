package modelo;

public class Libro {

    private int id;
    private String titulo;
    private String autor;
    private boolean disponible;
    private int anoPublicacion;

    public Libro(int id, String titulo, String autor, int anoPublicacion) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
        this.anoPublicacion = anoPublicacion;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }
}
