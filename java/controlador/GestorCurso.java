package controlador;

import modelo.Curso;
import modelo.Materia;
import java.util.ArrayList;
import java.util.List;

/**Clase GestorCurso para gestionar una lista de cursos.**/
public class GestorCurso {
    private List<Curso> cursos; // Lista para almacenar los cursos

    /**Constructor que inicializa la lista de cursos.**/
    public GestorCurso() {
        this.cursos = new ArrayList<>();
    }

    /**
     * Agrega un nuevo curso a la lista.
     *
     * @param nombreCurso Nombre del curso.
     * @param materias Array de materias que conforman el curso.
     * @throws IllegalArgumentException Si el nombre del curso está vacío o no se proporcionan materias.
     **/
    public void agregarCurso(String nombreCurso, Materia[] materias) {
        if (nombreCurso == null || nombreCurso.isEmpty()) {
            throw new IllegalArgumentException("El nombre del curso no puede estar vacío.");
        }

        if (materias == null || materias.length == 0) {
            throw new IllegalArgumentException("Debe proporcionar al menos una materia.");
        }

        Curso nuevoCurso = new Curso(nombreCurso, materias);
        cursos.add(nuevoCurso);
    }

    /**
     * Obtiene la lista de cursos.
     *
     * @return Lista de objetos Curso.
     **/
    public List<Curso> getCursos() {
        return cursos;
    }
}