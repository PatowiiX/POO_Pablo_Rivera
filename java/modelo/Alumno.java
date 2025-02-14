package modelo;

/**Clase Alumno que representa a un estudiante con matrícula, nombre, edad y un curso asignado.**/
public class Alumno {
    private String matricula;
    private String nombre;
    private int edad;
    private Curso curso;

    /**
     * Constructor para inicializar el objeto Alumno.
     *
     * @param matricula Identificador único del alumno.
     * @param nombre Nombre del alumno.
     * @param edad Edad del alumno.
     * @param curso Curso al que está inscrito el alumno.
     **/
    public Alumno(String matricula, String nombre, int edad, Curso curso) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    /**
     * Obtiene la matrícula del alumno.
     *
     * @return Matrícula del alumno.
     **/
    public String getMatricula() {
        return matricula;
    }

    /**
     * Representación en cadena del alumno.
     *
     * @return Cadena con el nombre, matrícula, edad y curso del alumno.
     **/
    public String toString() {
        return nombre + " (" + matricula + "), Edad: " + edad + "\n" + curso;
    }
}
