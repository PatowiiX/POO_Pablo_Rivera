package controlador;
import java.util.ArrayList;
import modelo.Alumno;

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

    // Método para eliminar un alumno por matrícula
    public boolean eliminarAlumno(String matricula) {
        for (Alumno alumno : alumnos) {
            if (alumno.getMatricula().equals(matricula)) {
                alumnos.remove(alumno);
                return true; // Indica que el alumno fue eliminado
            }
        }
        return false; // Indica que el alumno no fue encontrado
    }

    // Método para obtener la lista de alumnos
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }
}
