package controlador;

import modelo.Curso;
import modelo.Materia;
import modelo.Alumno;
import modelo.Profesor;
import java.util.ArrayList;

public class GestorCurso {
    private ArrayList<Curso> cursos;

    public GestorCurso() {
        cursos = new ArrayList<>();
    }

    public void agregarCurso(String nombre, Materia[] materias) {
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("Error: El nombre del curso no puede estar vacío.");
            return;
        }
        Curso nuevoCurso = new Curso(nombre, materias);
        cursos.add(nuevoCurso);
        System.out.println("Curso agregado correctamente: " + nuevoCurso);
    }

    public Curso buscarCurso(String nombre) {
        for (Curso curso : cursos) {
            if (curso.getNombre().equalsIgnoreCase(nombre)) {
                return curso;
            }
        }
        return null;
    }

    public boolean eliminarCurso(String nombre) {
        Curso cursoAEliminar = buscarCurso(nombre);
        if (cursoAEliminar != null) {
            cursos.remove(cursoAEliminar);
            System.out.println("Curso eliminado correctamente: " + nombre);
            return true;
        }
        System.out.println("Error: Curso no encontrado");
        return false;
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("No hay cursos registrados.");
        } else {
            System.out.println("=== Lista de Cursos ===");
            for (Curso curso : cursos) {
                System.out.println(curso);
            }
        }
    }

    public boolean agregarAlumnoACurso(String nombreCurso, Alumno alumno) {
        Curso curso = buscarCurso(nombreCurso);
        if (curso != null) {
            return curso.agregarAlumno(alumno);
        }
        System.out.println("Error: Curso no encontrado");
        return false;
    }

    public void agregarProfesorACurso(String nombreCurso, Profesor profesor) {
        Curso curso = buscarCurso(nombreCurso);
        if (curso != null) {
            curso.agregarProfesor(profesor);
            System.out.println("Profesor agregado correctamente al curso " + nombreCurso);
        } else {
            System.out.println("Error: Curso no encontrado");
        }
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }
}
