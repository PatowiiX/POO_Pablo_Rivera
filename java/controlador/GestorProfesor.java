package controlador;

import modelo.Profesor;
import java.util.ArrayList;

/**Clase GestorProfesor para gestionar una lista de profesores.**/
public class GestorProfesor {
    private ArrayList<Profesor> profesores;

    /**Constructor que inicializa la lista de profesores.**/
    public GestorProfesor() {
        profesores = new ArrayList<>();
    }

    /**
     * Agrega un nuevo profesor a la lista.
     *
     * @param profesor Objeto de tipo Profesor a agregar.
     */
    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    /**
     * Elimina un profesor de la lista utilizando su número de nómina.
     *
     * @param numNomina Número de nómina del profesor a eliminar.
     * @return true si el profesor fue eliminado, false si no se encontró.
     **/
    public boolean eliminarProfesor(String numNomina) {
        for (Profesor profesor : profesores) {
            if (profesor.getNumNomina().equals(numNomina)) {
                profesores.remove(profesor);
                return true;
            }
        }
        return false;
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