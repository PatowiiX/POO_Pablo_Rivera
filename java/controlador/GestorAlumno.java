package controlador;
import java.util.ArrayList;
import modelo.Alumno;

/** Clase GestorAlumno para gestionar una lista de alumnos.**/
public class GestorAlumno {
    private ArrayList<Alumno> alumnos = new ArrayList<>();

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void listarAlumnos() {
        for (Alumno a : alumnos) {
            System.out.println(a);
        }
    }

    /** Metodo para eliminar un alumno por matrícula**/
    public boolean eliminarAlumno(String matricula) {
        for (Alumno alumno : alumnos) {
            if (alumno.getMatricula().equals(matricula)) {
                alumnos.remove(alumno);
                return true; /** Indica que el alumno fue eliminado**/
            }
        }
        return false; /** Indica que el alumno no fue encontrado**/
    }

    /** Metodo para obtener la lista de alumnos**/
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }
}

/**NOTA: Hubiera querido entrar mas a detalle con este codigo, pero al querer hacerlo se rompia, asi que perdon por la simpleza.**/