package modelo;
public class Usuario {

    private int id; /** ID del usuario**/
    private String nombre; /** Nombre del usuario**/
    private String email; /** Correo electrónico del usuario**/
    private int prestamosActivos; /** Número de préstamos activos del usuario**/

    /** Constructor que inicializa un usuario con su ID, nombre y correo electrónico**/
    public Usuario(int id, String nombre, String email) {
        this.id = id; /** Asigna el ID del usuario**/
        this.nombre = nombre; /**Asigna el nombre del usuario**/
        this.email = email; /** Asigna el correo electrónico del usuario**/
        this.prestamosActivos = 0; /** Inicializa los préstamos activos en 0**/
    }

    /** Metodo para obtener el ID del usuario**/
    public int getId() {
        return id; /**Devuelve el ID del usuario**/
    }

    /** Metodo para obtener el nombre del usuario**/
    public String getNombre() {
        return nombre; /** Devuelve el nombre del usuario**/
    }

    /**Metodo para obtener el correo electrónico del usuario**/
    public String getEmail() {
        return email; /**Devuelve el correo electrónico del usuario**/
    }

    /**Metodo para obtener el número de préstamos activos**/
    public int getPrestamosActivos() {
        return prestamosActivos; /**Devuelve el número de préstamos activos**/
    }

    /**Metodo para realizar un préstamo**/
    public boolean realizarPrestamo() {
        /**Permite realizar un préstamo si el usuario tiene menos de 2 préstamos activos**/
        if (prestamosActivos < 2) {
            prestamosActivos++; /**Incrementa el contador de préstamos activos**/
            return true; /**Retorna true indicando que el préstamo fue exitoso**/
        }
        return false; /** Retorna false si el usuario ya tiene 2 préstamos activos**/
    }
}
