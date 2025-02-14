package controlador;

import modelo.Profesor;
import java.util.ArrayList;

/**Clase GestorPagos para gestionar los pagos de los profesores.**/
public class GestorPagos {
    private ArrayList<Profesor> profesores = new ArrayList<>();

    /**
     * Agrega un nuevo profesor a la lista.
     *
     * @param profesor Objeto(?) de tipo Profesor a agregar.
     **/
    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    /**
     * Calcula los pagos semanales de los profesores.
     *
     * @return Una lista de strings con la información del profesor y su sueldo semanal.
     **/
    public ArrayList<String> calcularPagos() {
        ArrayList<String> resultados = new ArrayList<>();
        for (Profesor profesor : profesores) {
            double sueldoSemanal = profesor.calcularSueldoSemanal();
            resultados.add(profesor.toString() + " - Sueldo semanal: $" + sueldoSemanal);
        }
        return resultados;
    }

    /**
     * Obtiene la lista de profesores.
     *
     * @return Lista de objetos Profesor.
     **/
    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }
}