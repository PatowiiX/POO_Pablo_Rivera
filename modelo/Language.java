package modelo;

import java.util.Scanner;

public class Language {

    private static String selectedLanguage;

    public static void seleccionarIdioma() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("Selecciona un idioma:");
        System.out.println("1. Español");
        System.out.println("2. Inglés");
        System.out.println("3. Japonés");
        System.out.print("Tu opción es?: ");

        while (true) {
            try {
                opcion = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.print("Por favor, ingrese una opción válida: ");
            }
        }

        switch (opcion) {
            case 1:
                selectedLanguage = "es";
                System.out.println("Has seleccionado Español.");
                break;
            case 2:
                selectedLanguage = "en";
                System.out.println("You have selected English.");
                break;
            case 3:
                selectedLanguage = "ja";
                System.out.println("日本語を選択しました。");
                break;
            default:
                System.out.println("Opción no válida, se seleccionará Español por defecto.");
                selectedLanguage = "es";
                break;
        }
    }

    public static String getMenuMessage() {
        switch (selectedLanguage) {
            case "es":
                return "Sistema de Gestión de Biblioteca";
            case "en":
                return "Library Management System";
            case "ja":
                return "図書館管理システム";
            default:
                return "Idioma no soportado";
        }
    }

    public static String getAddBookOption() {
        return selectedLanguage.equals("es") ? "Agregar Libro" : selectedLanguage.equals("en") ? "Add Book" : "本を追加";
    }

    public static String getAddUserOption() {
        return selectedLanguage.equals("es") ? "Agregar Usuario" : selectedLanguage.equals("en") ? "Add User" : "ユーザーを追加";
    }

    public static String getLoanOption() {
        return selectedLanguage.equals("es") ? "Realizar Préstamo" : selectedLanguage.equals("en") ? "Make Loan" : "ローンを作成";
    }

    public static String getReportOption() {
        return selectedLanguage.equals("es") ? "Generar Reporte" : selectedLanguage.equals("en") ? "Generate Report" : "レポートを生成";
    }

    public static String getExitOption() {
        return selectedLanguage.equals("es") ? "Salir" : selectedLanguage.equals("en") ? "Exit" : "出口";
    }

    public static String getSelectOptionMessage() {
        return selectedLanguage.equals("es") ? "Seleccione una opción" : selectedLanguage.equals("en") ? "Select an option" : "オプションを選択してください";
    }

    public static String getEnterBookIdMessage() {
        return selectedLanguage.equals("es") ? "Ingrese ID del libro: " : selectedLanguage.equals("en") ? "Enter book ID: " : "本のIDを入力してください: ";
    }

    public static String getEnterBookTitleMessage() {
        return selectedLanguage.equals("es") ? "Ingrese título del libro: " : selectedLanguage.equals("en") ? "Enter book title: " : "本のタイトルを入力してください: ";
    }

    public static String getEnterBookAuthorMessage() {
        return selectedLanguage.equals("es") ? "Ingrese autor del libro: " : selectedLanguage.equals("en") ? "Enter book author: " : "本の著 者を入力してください: ";
    }

    public static String getEnterPublicationYearMessage() {
        return selectedLanguage.equals("es") ? "Ingrese año de publicación del libro: " : selectedLanguage.equals("en") ? "Enter publication year: " : "出版年を入力してください: ";
    }

    public static String getBookAddedMessage() {
        return selectedLanguage.equals("es") ? "Libro agregado exitosamente." : selectedLanguage.equals("en") ? "Book added successfully." : "本が正常に追加されました。";
    }

    public static String getEnterUserIdMessage() {
        return selectedLanguage.equals("es") ? "Ingrese ID del usuario: " : selectedLanguage.equals("en") ? "Enter user ID: " : "ユーザーIDを入力してください: ";
    }

    public static String getEnterUserNameMessage() {
        return selectedLanguage.equals("es") ? "Ingrese nombre del usuario: " : selectedLanguage.equals("en") ? "Enter user name: " : "ユーザー名を入力してください: ";
    }

    public static String getEnterUserEmailMessage() {
        return selectedLanguage.equals("es") ? "Ingrese correo electrónico del usuario: " : selectedLanguage.equals("en") ? "Enter user email: " : "ユーザーのメールアドレスを入力してください: ";
    }

    public static String getUserAddedMessage() {
        return selectedLanguage.equals("es") ? "Usuario agregado exitosamente." : selectedLanguage.equals("en") ? "User  added successfully." : "ユーザーが正常に追加されました。";
    }

    public static String getEnterBookLoanIdMessage() {
        return selectedLanguage.equals("es") ? "Ingrese ID del préstamo del libro: " : selectedLanguage.equals("en") ? "Enter book loan ID: " : "本の貸出IDを入力してください: ";
    }

    public static String getLoanSuccessMessage() {
        return selectedLanguage.equals("es") ? "Préstamo realizado con éxito." : selectedLanguage.equals("en") ? "Loan successfully made." : "ローンが正常に行われました。";
    }

    public static String getLoanFailureMessage() {
        return selectedLanguage.equals("es") ? "Error al realizar el préstamo." : selectedLanguage.equals("en") ? "Failed to make loan." : "ローンの作成に失敗しました。";
    }

    public static String getReportTitle() {
        return selectedLanguage.equals("es") ? "Reporte de Biblioteca" : selectedLanguage.equals("en") ? "Library Report" : "図書館のレポート";
    }

    public static String getTotalBooksMessage() {
        return selectedLanguage.equals("es") ? "Total de libros: " : selectedLanguage.equals("en") ? "Total books: " : "合計の本: ";
    }

    public static String getTotalUsersMessage() {
        return selectedLanguage.equals("es") ? "Total de usuarios: " : selectedLanguage.equals("en") ? "Total users: " : "合計のユーザー: ";
    }

    public static String getTotalLoansMessage() {
        return selectedLanguage.equals("es") ? "Total de préstamos: " : selectedLanguage.equals("en") ? "Total loans: " : "合計のローン: ";
    }

    public static String getExitMessage() {
        return selectedLanguage.equals("es") ? "Saliendo del sistema..." : selectedLanguage.equals("en") ? "Exiting the system..." : "システムを終了します...";
    }

    public static String getInvalidOptionMessage() {
        return selectedLanguage.equals("es") ? "Opción no válida, por favor intente de nuevo." : selectedLanguage.equals("en") ? "Invalid option, please try again." : "無効なオプションです。もう一度お試しください。";
    }
}
 
