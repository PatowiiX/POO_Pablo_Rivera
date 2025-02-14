package modelo;

import java.util.ArrayList;
import java.util.Arrays;

/**Clase Curso que representa un curso con nombre, materias, alumnos y profesores.**/
public class Curso {
    private String nombre;
    private ArrayList<Materia> materias;
    private ArrayList<Alumno> alumnos;
    private ArrayList<Profesor> profesores;

    /**
     * Constructor para inicializar un objeto Curso.
     *
     * @param nombre Nombre del curso.
     * @param materias Arreglo de materias que componen el curso.
     **/
    public Curso(String nombre, Materia[] materias) {
        this.nombre = nombre;
        this.materias = new ArrayList<>(Arrays.asList(materias));
        this.alumnos = new ArrayList<>();
        this.profesores = new ArrayList<>();
    }

    /**
     * Obtiene el nombre del curso.
     *
     * @return Nombre del curso.
     **/
    public String getNombre() {
        return nombre;
    }

    /**
     * Agrega un alumno al curso si no supera el límite de 23 alumnos.
     *
     * @param alumno Alumno a agregar.
     * @return true si el alumno fue agregado, false si el curso está lleno.
     **/
    public boolean agregarAlumno(Alumno alumno) {
        if (alumnos.size() < 23) {
            alumnos.add(alumno);
            return true;
        }
        return false;
    }

    /**
     * Agrega un profesor al curso.
     *
     * @param profesor Profesor a agregar.
     **/
    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    /**
     * Obtiene una representación en cadena del curso, incluyendo su nombre y total de créditos.
     *
     * @return Cadena con la información del curso.
     **/
    public String toString() {
        return "Curso: " + nombre + " (" + getTotalCreditos() + " créditos)";
    }

    /**
     * Calcula el total de créditos del curso sumando los créditos de sus materias.
     *
     * @return Total de créditos del curso.
     */
    public int getTotalCreditos() {
        int total = 0;
        for (Materia m : materias) total += m.getCreditos();
        return total;
    }

    /**
     * Obtiene la lista de alumnos inscritos en el curso.
     *
     * @return Lista de alumnos.
     **/
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    /**
     * Obtiene la lista de profesores asignados al curso.
     *
     * @return Lista de profesores.
     **/
    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }
}
