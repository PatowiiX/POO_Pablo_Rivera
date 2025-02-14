package modelo;

/**Clase que representa una materia académica.**/
public class Materia {
    private String nombre;
    private String clave;
    private int creditos;
    private int horasSemanales;

    /**Constructor por defecto.**/
    public Materia() {}

    /**
     * Constructor que inicializa los atributos de la materia.
     *
     * @param nombre          El nombre de la materia.
     * @param clave           La clave única de la materia.
     * @param creditos        El número de créditos de la materia.
     * @param horasSemanales  Las horas semanales dedicadas a la materia.
     **/
    public Materia(String nombre, String clave, int creditos, int horasSemanales) {
        this.nombre = nombre;
        this.clave = clave;
        this.creditos = creditos;
        this.horasSemanales = horasSemanales;
    }

    /**
     * Obtiene el número de créditos de la materia.
     *
     * @return El número de créditos.
     **/
    public int getCreditos() {
        return creditos;
    }

    /**
     * Obtiene el número de horas semanales dedicadas a la materia.
     *
     * @return El número de horas semanales.
     **/
    public int getHorasSemanales() {
        return horasSemanales;
    }

    /**
     * Devuelve una representación en forma de cadena de la materia.
     *
     * @return Una cadena que representa la materia.
     **/
    public String toString() {
        return nombre + " (" + clave + ") - " + creditos + " créditos, " + horasSemanales + " horas/P/semana";
    }
}