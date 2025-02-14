package vista;

public class IdiomaIngles implements Idioma {
    @Override
    public String getMenuPrincipal() {
        return "=== Main Menu ===";
    }

    @Override
    public String getAgregarProfesor() {
        return "1. Add Teacher";
    }

    @Override
    public String getEliminarProfesor() {
        return "2. Remove Teacher";
    }

    @Override
    public String getAgregarAlumno() {
        return "3. Add Student";
    }

    @Override
    public String getEliminarAlumno() {
        return "4. Remove Student";
    }

    @Override
    public String getCalcularPagos() {
        return "5. Calculate Payments";
    }

    @Override
    public String getMostrarAlumnos() {
        return "6. Show Students";
    }

    @Override
    public String getMostrarProfesores() {
        return "7. Show Teachers";
    }

    @Override
    public String getMostrarCursos() {
        return "8. Show Courses";
    }

    @Override
    public String getAgregarCurso() {
        return "9. Add Course";
    }

    @Override
    public String getAgregarAlumnoACurso() {
        return "10. Add Student to Course";
    }

    @Override
    public String getAgregarProfesorACurso() {
        return "11. Add Teacher to Course";
    }

    @Override
    public String getAsignarMateriaAProfesor() {
        return "12. Assign Subject to Teacher";
    }

    @Override
    public String getSalir() {
        return "13. Exit";
    }

    @Override
    public String getOpcionNoValida() {
        return "Invalid option. Please try again.";
    }

    // Nuevos métodos para textos adicionales
    public String getSeleccioneOpcion() {
        return "Select an option";
    }

    public String getSalirMensaje() {
        return "Exiting the program...";
    }

    public String getNoProfesores() {
        return "No teachers registered.";
    }

    public String getIngreseNombreProfesor() {
        return "Enter the teacher's name";
    }

    public String getIngreseNumNomina() {
        return "Enter the payroll number";
    }

    public String getProfesorAgregado() {
        return "Teacher added successfully.";
    }

    public String getIngreseNumNominaEliminar() {
        return "Enter the payroll number of the teacher to remove";
    }

    public String getProfesorEliminado() {
        return "Teacher removed successfully.";
    }

    public String getProfesorNoEncontrado() {
        return "Teacher not found.";
    }

    public String getIngreseMatriculaAlumno() {
        return "Enter the student's ID";
    }

    public String getIngreseNombreAlumno() {
        return "Enter the student's name";
    }

    public String getIngreseEdadAlumno() {
        return "Enter the student's age";
    }

    public String getEdadNoValida() {
        return "Invalid age. Please try again.";
    }

    public String getAlumnoAgregado() {
        return "Student added successfully.";
    }

    public String getIngreseMatriculaEliminar() {
        return "Enter the ID of the student to remove";
    }

    public String getAlumnoEliminado() {
        return "Student removed successfully.";
    }

    public String getAlumnoNoEncontrado() {
        return "Student not found.";
    }

    public String getSeleccioneProfesor() {
        return "Select the index of the teacher to assign a subject";
    }

    public String getIndiceNoValido() {
        return "Invalid index. Please try again.";
    }

    public String getIndiceProfesorNoValido() {
        return "Invalid teacher index.";
    }

    public String getIngreseNombreMateria() {
        return "Enter the subject name";
    }

    public String getIngreseClaveMateria() {
        return "Enter the subject key";
    }

    public String getIngreseCreditosMateria() {
        return "Enter the subject credits";
    }

    public String getIngreseHorasSemanales() {
        return "Enter the weekly hours of the subject";
    }

    public String getMateriaAsignada() {
        return "Subject assigned successfully to the teacher.";
    }

    public String getDatosNoValidos() {
        return "Invalid data. Please try again.";
    }

    public String getIngreseNombreCurso() {
        return "Enter the course name";
    }

    public String getMateria() {
        return "Subject";
    }

    public String getCursoAgregado() {
        return "Course added successfully.";
    }

    public String getSeleccioneCurso() {
        return "Select the index of the course to add a student";
    }

    public String getAlumnoAgregadoCurso() {
        return "Student added successfully to the course.";
    }

    public String getNoMasAlumnos() {
        return "Cannot add more than 23 students to this course.";
    }

    public String getIndiceCursoNoValido() {
        return "Invalid course index.";
    }

    public String getProfesorAgregadoCurso() {
        return "Teacher added successfully to the course.";
    }
}