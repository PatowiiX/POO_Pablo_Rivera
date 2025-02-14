package vista;

import java.util.ArrayList;
import java.util.Scanner;

import controlador.GestorAlumno;
import controlador.GestorCurso;
import controlador.GestorPagos;
import controlador.GestorProfesor;
import modelo.Alumno;
import modelo.Curso;
import modelo.Materia;
import modelo.Profesor;

/**Clase que representa la vista de la aplicación, encargada de interactuar con el usuario.**/
public class Vista {
    private Scanner scanner;                /** Scanner para la entrada de datos**/
    public GestorPagos gestorPagos;         /** Gestor de pagos**/
    private GestorProfesor gestorProfesor;   /** Gestor de profesores**/
    private GestorCurso gestorCurso;         /**Gestor de cursos**/
    private GestorAlumno gestorAlumno;       /** Gestor de alumnos**/
    private Idioma idioma;                   /** Variable para manejar el idioma**/

    /**
     * Constructor que inicializa la vista con un idioma específico.
     * @param idioma Implementación de la interfaz Idioma para manejar textos en diferentes idiomas.
     **/
    public Vista(Idioma idioma) { /**Recibe una implementación de Idioma**/
        this.idioma = idioma; /** Inicializar el idioma**/
        scanner = new Scanner(System.in);
        gestorPagos = new GestorPagos();
        gestorProfesor = new GestorProfesor();
        gestorCurso = new GestorCurso(); /**Inicializar el gestor de cursos**/
        gestorAlumno = new GestorAlumno(); /** Inicializar el gestor de alumnos**/
    }

    /**
     * Muestra el menú principal y gestiona la interacción del usuario.
     **/
    public void mostrarMenu() {
        while (true) {
            System.out.println(idioma.getMenuPrincipal());
            System.out.println(idioma.getAgregarProfesor());
            System.out.println(idioma.getEliminarProfesor());
            System.out.println(idioma.getAgregarAlumno());
            System.out.println(idioma.getEliminarAlumno());
            System.out.println(idioma.getCalcularPagos());
            System.out.println(idioma.getMostrarAlumnos());
            System.out.println(idioma.getMostrarProfesores());
            System.out.println(idioma.getMostrarCursos());
            System.out.println(idioma.getAgregarCurso());
            System.out.println(idioma.getAgregarAlumnoACurso());
            System.out.println(idioma.getAgregarProfesorACurso());
            System.out.println(idioma.getAsignarMateriaAProfesor());
            System.out.println(idioma.getSalir());
            System.out.print(idioma.getSeleccioneOpcion() + ": ");

            int opcion;
            try {
                opcion = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println(idioma.getOpcionNoValida());
                scanner.nextLine(); /** Limpiar el buffer**/
                continue;
            }

            switch (opcion) {
                case 1:
                    agregarProfesor();
                    break;
                case 2:
                    eliminarProfesor();
                    break;
                case 3:
                    agregarAlumno();
                    break;
                case 4:
                    eliminarAlumno();
                    break;
                case 5:
                    mostrarPagos();
                    break;
                case 6:
                    mostrarAlumnos();
                    break;
                case 7:
                    mostrarProfesores();
                    break;
                case 8:
                    mostrarCursos();
                    break;
                case 9:
                    agregarCurso();
                    break;
                case 10:
                    agregarAlumnoACurso();
                    break;
                case 11:
                    agregarProfesorACurso();
                    break;
                case 12:
                    asignarMateriaAProfesor();
                    break;
                case 13:
                    System.out.println(idioma.getSalirMensaje());
                    return;
                default:
                    System.out.println(idioma.getOpcionNoValida());
            }
        }
    }

    /**
     * Muestra los pagos calculados para los profesores.
     **/
    private void mostrarPagos() {
        System.out.println("=== " + idioma.getCalcularPagos() + " ===");
        ArrayList<String> resultados = gestorPagos.calcularPagos();
        if (resultados.isEmpty()) {
            System.out.println(idioma.getNoProfesores());
        } else {
            for (String resultado : resultados) {
                System.out.println(resultado);
            }
        }
    }

    /**
     * Agrega un nuevo profesor a la lista.
     **/
    private void agregarProfesor() {
        System.out.print(idioma.getIngreseNombreProfesor() + ": ");
        String nombre = scanner.nextLine();
        System.out.print(idioma.getIngreseNumNomina() + ": ");
        String numNomina = scanner.nextLine();
        Profesor profesor = new Profesor(nombre, numNomina, 250);
        gestorProfesor.agregarProfesor(profesor);
        gestorPagos.agregarProfesor(profesor);
        System.out.println(idioma.getProfesorAgregado());
    }

    /**
     * Elimina un profesor de la lista.
     **/
    private void eliminarProfesor() {
        System.out.print(idioma.getIngreseNumNominaEliminar() + ": ");
        String numNomina = scanner.nextLine();
        if (gestorProfesor.eliminarProfesor(numNomina)) {
            System.out.println(idioma.getProfesorEliminado());
        } else {
            System.out.println(idioma.getProfesorNoEncontrado());
        }
    }

    /**
     * Agrega un nuevo alumno a la lista.
     **/
    private void agregarAlumno() {
        System.out.print(idioma.getIngreseMatriculaAlumno() + ": ");
        String matricula = scanner.nextLine();
        System.out.print(idioma.getIngreseNombreAlumno() + ": ");
        String nombre = scanner.nextLine();
        System.out.print(idioma.getIngreseEdadAlumno() + ": ");
        int edad;
        try {
            edad = scanner.nextInt();
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println(idioma.getEdadNoValida());
            scanner.nextLine();
            return;
        }

        Alumno alumno = new Alumno(matricula, nombre, edad, null);
        gestorAlumno.agregarAlumno(alumno);
        System.out.println(idioma.getAlumnoAgregado());
    }

    /**
     * Elimina un alumno de la lista.
     **/
    private void eliminarAlumno() {
        System.out.print(idioma.getIngreseMatriculaEliminar() + ": ");
        String matricula = scanner.nextLine();
        boolean encontrado = false;
        for (Alumno alumno : gestorAlumno.getAlumnos()) {
            if (alumno.getMatricula().equals(matricula)) {
                gestorAlumno.eliminarAlumno(matricula);
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println(idioma.getAlumnoEliminado());
        } else {
            System.out.println(idioma.getAlumnoNoEncontrado());
        }
    }

    /**
     * Muestra la lista de alumnos.
     **/
    private void mostrarAlumnos() {
        System.out.println("\n=== " + idioma.getMostrarAlumnos() + " ===");
        for (Alumno alumno : gestorAlumno.getAlumnos()) {
            System.out.println(alumno);
        }
    }

    /**
     * Asigna una materia a un profesor seleccionado.
     **/
    private void asignarMateriaAProfesor() {
        mostrarProfesores();
        System.out.print(idioma.getSeleccioneProfesor() + ": ");
        int indiceProfesor;
        try {
            indiceProfesor = scanner.nextInt();
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println(idioma.getIndiceNoValido());
            scanner.nextLine();
            return;
        }

        if (indiceProfesor < 0 || indiceProfesor >= gestorProfesor.getProfesores().size()) {
            System.out.println(idioma.getIndiceProfesorNoValido());
            return;
        }

        Profesor profesorSeleccionado = gestorProfesor.getProfesores().get(indiceProfesor);
        System.out.print(idioma.getIngreseNombreMateria() + ": ");
        String nombreMateria = scanner.nextLine();
        System.out.print(idioma.getIngreseClaveMateria() + ": ");
        String claveMateria = scanner.nextLine();
        System.out.print(idioma.getIngreseCreditosMateria() + ": ");
        int creditos;
        System.out.print(idioma.getIngreseHorasSemanales() + ": ");
        int horasSemanales;
        try {
            creditos = scanner.nextInt();
            horasSemanales = scanner.nextInt();
            scanner.nextLine();

            Materia materia = new Materia(nombreMateria, claveMateria, creditos, horasSemanales);
            profesorSeleccionado.asignarMateria(materia);
            System.out.println(idioma.getMateriaAsignada());
        } catch (Exception e) {
            System.out.println(idioma.getDatosNoValidos());
            scanner.nextLine();
        }
    }

    /**
     * Muestra la lista de profesores.
     **/
    private void mostrarProfesores() {
        System.out.println("\n=== " + idioma.getMostrarProfesores() + " ===");
        for (Profesor profesor : gestorProfesor.getProfesores()) {
            System.out.println(profesor);
        }
    }

    /**
     * Agrega un nuevo curso a la lista.
     **/
    private void agregarCurso() {
        System.out.print(idioma.getIngreseNombreCurso() + ": ");
        String nombreCurso = scanner.nextLine();
        Materia[] materias = new Materia[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("\nMateria " + (i + 1) + ":");
            System.out.print(idioma.getMateria() + " " + (i + 1) + " - " + idioma.getIngreseNombreMateria() + ": ");
            String nombreMateria = scanner.nextLine();
            System.out.print(idioma.getIngreseClaveMateria() + ": ");
            String claveMateria = scanner.nextLine();
            System.out.print(idioma.getIngreseCreditosMateria() + ": ");
            int creditos;
            System.out.print(idioma.getIngreseHorasSemanales() + ": ");
            int horasSemanales;
            try {
                creditos = scanner.nextInt();
                horasSemanales = scanner.nextInt();
                scanner.nextLine();

                materias[i] = new Materia(nombreMateria, claveMateria, creditos, horasSemanales);
            } catch (Exception e) {
                System.out.println(idioma.getDatosNoValidos());
                scanner.nextLine();
                i--;
            }
        }

        gestorCurso.agregarCurso(nombreCurso, materias);
        System.out.println(idioma.getCursoAgregado());
    }

    /**Agrega un alumno a un curso seleccionado.**/
    private void agregarAlumnoACurso() {
        mostrarCursos();
        System.out.print(idioma.getSeleccioneCurso() + ": ");
        int indiceCurso;
        try {
            indiceCurso = scanner.nextInt();
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println(idioma.getIndiceCursoNoValido());
            scanner.nextLine();
            return;
        }

        if (indiceCurso < 0 || indiceCurso >= gestorCurso.getCursos().size()) {
            System.out.println(idioma.getIndiceCursoNoValido());
            return;
        }

        Curso cursoSeleccionado = gestorCurso.getCursos().get(indiceCurso);
        System.out.print(idioma.getIngreseMatriculaAlumno() + ": ");
        String matricula = scanner.nextLine();
        System.out.print(idioma.getIngreseNombreAlumno() + ": ");
        String nombre = scanner.nextLine();
        System.out.print(idioma.getIngreseEdadAlumno() + ": ");
        int edad;
        try {
            edad = scanner.nextInt();
            scanner.nextLine();

            Alumno alumno = new Alumno(matricula, nombre, edad, cursoSeleccionado);
            if (cursoSeleccionado.agregarAlumno(alumno)) {
                System.out.println(idioma.getAlumnoAgregadoCurso());
            } else {
                System.out.println(idioma.getNoMasAlumnos());
            }
        } catch (Exception e) {
            System.out.println(idioma.getEdadNoValida());
            scanner.nextLine();
        }
    }

    /**Agrega un profesor a un curso seleccionado.**/
    private void agregarProfesorACurso() {
        mostrarCursos();
        System.out.print(idioma.getSeleccioneCurso() + ": ");
        int indiceCurso;
        try {
            indiceCurso = scanner.nextInt();
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println(idioma.getIndiceCursoNoValido());
            scanner.nextLine();
            return;
        }

        if (indiceCurso < 0 || indiceCurso >= gestorCurso.getCursos().size()) {
            System.out.println(idioma.getIndiceCursoNoValido());
            return;
        }

        Curso cursoSeleccionado = gestorCurso.getCursos().get(indiceCurso);
        System.out.print(idioma.getIngreseNombreProfesor() + ": ");
        String nombre = scanner.nextLine();
        System.out.print(idioma.getIngreseNumNomina() + ": ");
        String numNomina = scanner.nextLine();
        Profesor profesor = new Profesor(nombre, numNomina, 250);
        cursoSeleccionado.agregarProfesor(profesor);
        System.out.println(idioma.getProfesorAgregadoCurso());
    }

    /**Muestra la lista de cursos disponibles.**/
    private void mostrarCursos() {
        System.out.println("\n=== " + idioma.getMostrarCursos() + " ===");
        for (int i = 0; i < gestorCurso.getCursos().size(); i++) {
            System.out.println(i + ": " + gestorCurso.getCursos().get(i));
        }

    }
}