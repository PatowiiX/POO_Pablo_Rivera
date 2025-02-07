package modelo;

/**Clase que implementa la interfaz IdiomaMensajes para proporcionar mensajes en inglés**/
public class IdiomaIngles implements IdiomaMensajes {

    public String getTitulo() { return "=== Library Management System ==="; } /** Título del sistema**/
    public String getOpcion1() { return "1. Add Book"; } /** Opción 1: Agregar libro**/
    public String getOpcion2() { return "2. Add User"; } /** Opción 2: Agregar usuario**/
    public String getOpcion3() { return "3. Make Loan"; } /** Opción 3: Realizar préstamo**/
    public String getOpcion4() { return "4. Generate Report"; } /** Opción 4: Generar informe**/
    public String getOpcion5() { return "5. Exit"; } /** Opción 5: Salir**/
    public String getSeleccion() { return "Select an option: "; } /** Mensaje para seleccionar opción**/
    public String getSalida() { return "Exiting..."; } /** Mensaje de salida**/
    public String getidUsuario() { return "ID user"; } /** ID de usuario**/
    public String getnombreUsuario() { return "user name"; } /** Nombre de usuario**/
    public String getgmailUsuario() { return " gmail user"; } /** Gmail del usuario**/
    public String getIdLibro() { return "Id book"; } /** ID del libro**/
    public String getautorLibro() { return " author of book"; } /** Autor del libro**/
    public String gettituloLibro() { return " title of book"; } /** Título del libro**/
    public String getlibroId() { return "Book id"; } /** ID del libro (repetido)**/
    public String getusuarioId() { return " User id"; } /** ID de usuario (repetido)**/
    public String getOpcionInvalida() { return "Invalid option. Please try again."; } /** Opción inválida**/
    public String getLibroAgregado() { return "Book added successfully."; } /** Libro agregado exitosamente**/
    public String getUsuarioAgregado() { return "User  added successfully."; } /** Usuario agregado exitosamente**/
    public String getPrestamoExitoso() { return "Loan successfully made."; } /** Préstamo exitoso**/
    public String gettotalPrestamos() { return "Loan total: "; } /** Total de préstamos**/
    public String gettotalLibros() { return "Book total: "; } /**Total de libros**/
    public String gettotalUsuarios() { return "Users total: "; } /**Total de usuarios**/
    public String getreporteBiblioteca() { return " Report Library"; } /** Informe de la biblioteca**/
    public String getPrestamoFallido() { return "Could not make the loan. Check the book's availability and the user's active loans."; } /**Préstamo fallido**/
}