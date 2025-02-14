package vista;
/** Toma los strings para convertirlos y regresarlos en idioma español, usando Override en algunos de los casos**/
public class IdiomaEspañol implements Idioma {
    @Override
    public String getMenuPrincipal() {
        return "=== Menú Principal ===";
    }

    @Override
    public String getAgregarProfesor() {
        return "1. Agregar Profesor";
    }

    @Override
    public String getEliminarProfesor() {
        return "2. Eliminar Profesor";
    }

    @Override
    public String getAgregarAlumno() {
        return "3. Agregar Alumno";
    }

    @Override
    public String getEliminarAlumno() {
        return "4. Eliminar Alumno";
    }

    @Override
    public String getCalcularPagos() {
        return "5. Calcular Pagos";
    }

    @Override
    public String getMostrarAlumnos() {
        return "6. Mostrar Alumnos";
    }

    @Override
    public String getMostrarProfesores() {
        return "7. Mostrar Profesores";
    }

    @Override
    public String getMostrarCursos() {
        return "8. Mostrar Cursos";
    }

    @Override
    public String getAgregarCurso() {
        return "9. Agregar Curso";
    }

    @Override
    public String getAgregarAlumnoACurso() {
        return "10. Agregar Alumno a Curso";
    }

    @Override
    public String getAgregarProfesorACurso() {
        return "11. Agregar Profesor a Curso";
    }

    @Override
    public String getAsignarMateriaAProfesor() {
        return "12. Asignar Materia a Profesor";
    }

    @Override
    public String getSalir() {
        return "13. Salir";
    }

    @Override
    public String getOpcionNoValida() {
        return "Opción no válida. Intente de nuevo.";
    }

    // Nuevos métodos para textos adicionales
    public String getSeleccioneOpcion() {
        return "Seleccione una opción";
    }

    public String getSalirMensaje() {
        return "Saliendo del programa...";
    }

    public String getNoProfesores() {
        return "No hay profesores registrados.";
    }

    public String getIngreseNombreProfesor() {
        return "Ingrese el nombre del profesor";
    }

    public String getIngreseNumNomina() {
        return "Ingrese el número de nómina";
    }

    public String getProfesorAgregado() {
        return "Profesor agregado correctamente.";
    }

    public String getIngreseNumNominaEliminar() {
        return "Ingrese el número de nómina del profesor a eliminar";
    }

    public String getProfesorEliminado() {
        return "Profesor eliminado correctamente.";
    }

    public String getProfesorNoEncontrado() {
        return "Profesor no encontrado.";
    }

    public String getIngreseMatriculaAlumno() {
        return "Ingrese la matrícula del alumno";
    }

    public String getIngreseNombreAlumno() {
        return "Ingrese el nombre del alumno";
    }

    public String getIngreseEdadAlumno() {
        return "Ingrese la edad del alumno";
    }

    public String getEdadNoValida() {
        return "Edad no válida. Intente de nuevo.";
    }

    public String getAlumnoAgregado() {
        return "Alumno agregado correctamente.";
    }

    public String getIngreseMatriculaEliminar() {
        return "Ingrese la matrícula del alumno a eliminar";
    }

    public String getAlumnoEliminado() {
        return "Alumno eliminado correctamente.";
    }

    public String getAlumnoNoEncontrado() {
        return "Alumno no encontrado.";
    }

    public String getSeleccioneProfesor() {
        return "Seleccione el índice del profesor al que desea asignar una materia";
    }

    public String getIndiceNoValido() {
        return "Índice no válido. Intente de nuevo.";
    }

    public String getIndiceProfesorNoValido() {
        return "Índice de profesor no válido.";
    }

    public String getIngreseNombreMateria() {
        return "Ingrese el nombre de la materia";
    }

    public String getIngreseClaveMateria() {
        return "Ingrese la clave de la materia";
    }

    public String getIngreseCreditosMateria() {
        return "Ingrese los créditos de la materia";
    }

    public String getIngreseHorasSemanales() {
        return "Ingrese las horas semanales de la materia";
    }

    public String getMateriaAsignada() {
        return "Materia asignada correctamente al profesor.";
    }

    public String getDatosNoValidos() {
        return "Datos no válidos. Intente de nuevo.";
    }

    public String getIngreseNombreCurso() {
        return "Ingrese el nombre del curso";
    }

    public String getMateria() {
        return "Materia";
    }

    public String getCursoAgregado() {
        return "Curso agregado correctamente.";
    }

    public String getSeleccioneCurso() {
        return "Seleccione el índice del curso al que desea agregar un alumno";
    }

    public String getAlumnoAgregadoCurso() {
        return "Alumno agregado correctamente al curso.";
    }

    public String getNoMasAlumnos() {
        return "No se pueden agregar más de 23 alumnos a este curso.";
    }

    public String getIndiceCursoNoValido() {
        return "Índice de curso no válido.";
    }

    public String getProfesorAgregadoCurso() {
        return "Profesor agregado correctamente al curso.";
    }
}