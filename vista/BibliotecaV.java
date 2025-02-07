package vista;

import controlador.BibliotecaC;
import modelo.Language;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BibliotecaV {

    private final BibliotecaC controlador;
    private final Scanner scanner;

    public BibliotecaV(BibliotecaC controlador) {
        this.controlador = controlador;
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        while (true) {
            System.out.println("=== " + Language.getMenuMessage() + " ===");
            System.out.println("1. " + Language.getAddBookOption());
            System.out.println("2. " + Language.getAddUserOption());
            System.out.println("3. " + Language.getLoanOption());
            System.out.println("4. " + Language.getReportOption());
            System.out.println("5. " + Language.getExitOption());
            System.out.print(Language.getSelectOptionMessage() + ": ");

            int opcion = 0;
            boolean validInput = false;
            while (!validInput) {
                try {
                    opcion = scanner.nextInt();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println(Language.getInvalidOptionMessage());
                    scanner.nextLine();
                    System.out.print(Language.getSelectOptionMessage() + ": ");
                }
            }
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    agregarLibro();
                    break;
                case 2:
                    agregarUsuario();
                    break;
                case 3:
                    realizarPrestamo();
                    break;
                case 4:
                    generarReporte();
                    break;
                case 5:
                    System.out.println(Language.getExitMessage());
                    return;
                default:
                    System.out.println(Language.getInvalidOptionMessage());
            }
        }
    }

    private void agregarLibro() {
        System.out.print(Language.getEnterBookIdMessage());
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print(Language.getEnterBookTitleMessage());
        String titulo = scanner.nextLine();
        System.out.print(Language.getEnterBookAuthorMessage());
        String autor = scanner.nextLine();
        System.out.print(Language.getEnterPublicationYearMessage());
        int anoPublicacion = scanner.nextInt();
        scanner.nextLine();

        controlador.agregarLibro(id, titulo, autor, anoPublicacion);
        System.out.println(Language.getBookAddedMessage());
    }

    private void agregarUsuario() {
        System.out.print(Language.getEnterUserIdMessage());
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print(Language.getEnterUserNameMessage());
        String nombre = scanner.nextLine();
        System.out.print(Language.getEnterUserEmailMessage());
        String email = scanner.nextLine();
        controlador.agregarUsuario(id, nombre, email);
        System.out.println(Language.getUserAddedMessage());
    }

    private void realizarPrestamo() {
        System.out.print(Language.getEnterBookLoanIdMessage());
        int idLibro = scanner.nextInt();
        System.out.print(Language.getEnterUserIdMessage());
        int idUsuario = scanner.nextInt();
        scanner.nextLine();

        if (controlador.realizarPrestamo(idLibro, idUsuario)) {
            System.out.println(Language.getLoanSuccessMessage());
        } else {
            System.out.println(Language.getLoanFailureMessage());
        }
    }

    private void generarReporte() {
        System.out.println(Language.getReportTitle());
        System.out.println(Language.getTotalBooksMessage() + controlador.getTotalLibros());
        System.out.println(Language.getTotalUsersMessage() + controlador.getTotalUsuarios());
        System.out.println(Language.getTotalLoansMessage() + controlador.getTotalPrestamos());
    }
}