package modelo;

import java.util.ArrayList;

/**Clase que representa a un profesor.**/
public class Profesor {
    private static String nombre;
    private String numNomina;
    private double sueldoPorHora;
    private ArrayList<Materia> materias;
    private String status;

    /**
     * Constructor que inicializa los atributos del profesor.
     * @param nombre       El nombre del profesor.
     * @param numNomina    El número de nómina del profesor.
     * @param sueldoPorHora El sueldo por hora del profesor.
     **/
    public Profesor(String nombre, String numNomina, double sueldoPorHora) {
        this.nombre = nombre;
        this.numNomina = numNomina;
        this.sueldoPorHora = sueldoPorHora;
        this.materias = new ArrayList<>();
        this.status = "vigente";
    }

    /**
     * Asigna una materia al profesor.
     * @param materia La materia a asignar.
     **/
    public void asignarMateria(Materia materia) {
        this.materias.add(materia);
    }

    /**
     * Calcula el sueldo semanal del profesor basado en las materias que imparte.
     * @return El sueldo semanal total del profesor.
     **/
    public double calcularSueldoSemanal() {
        double totalSueldo = 0;
        for (Materia materia : materias) {
            totalSueldo += materia.getHorasSemanales() * sueldoPorHora;
        }
        /** Incremento del 25% por cada materia extra**/
        if (materias.size() > 1) {
            totalSueldo *= 1 + 0.25 * (materias.size() - 1);
        }
        return totalSueldo;
    }

    /**
     * Obtiene el estado del profesor.
     * @return El estado del profesor.
     **/
    public String getStatus() {
        return status;
    }

    /**
     * Establece el estado del profesor.
     * @param status El nuevo estado del profesor.
     **/
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Obtiene el nombre del profesor.
     * @return El nombre del profesor.
     **/
    public static String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el número de nómina del profesor.
     * @return El número de nómina.
     **/
    public String getNumNomina() {
        return numNomina;
    }

    /**
     * Obtiene la lista de materias que imparte el profesor.
     * @return La lista de materias.
     **/
    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    /**
     * Devuelve una representación en forma de cadena del profesor.
     * @return Una cadena que representa al profesor.
     **/
    public String toString() {
        return nombre + " (Nómina: " + numNomina + ", Status: " + status + ")";
    }
}