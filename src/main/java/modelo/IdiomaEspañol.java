package modelo; /** Paquete modelo**/

public class IdiomaEspañol implements IdiomaMensajes {

    /**Métodos que devuelven mensajes en español para la interfaz de usuario**/
    public String getTitulo() { return "=== Sistema de Gestión de Biblioteca ==="; } /** Título del sistema**/
    public String getOpcion1() { return "1. Agregar Libro"; } /** Opción 1: Agregar libro**/
    public String getOpcion2() { return "2. Agregar Usuario"; } /** Opción 2: Agregar usuario**/
    public String getOpcion3() { return "3. Realizar Préstamo"; } /** Opción 3: Realizar préstamo**/
    public String getOpcion4() { return "4. Generar Reporte"; } /** Opción 4: Generar informe**/
    public String getOpcion5() { return "5. Salir"; } /** Opción 5: Salir**/
    public String getSeleccion() { return "Seleccione una opción: "; } /** Mensaje para seleccionar opción**/
    public String getSalida() { return "Saliendo..."; } /**Mensaje de salida**/
    public String getidUsuario() { return "ingresa id usuario"; } /** ID de usuario**/
    public String getnombreUsuario() { return "Nombre del usuario"; } /** Nombre de usuario**/
    public String getgmailUsuario() { return " gmail del usuario"; } /** Gmail del usuario**/
    public String getIdLibro() { return "Id del libro"; } /**ID del libro**/
    public String getautorLibro() { return " Autor del libro"; } /** Autor del libro**/
    public String gettituloLibro() { return "Titulo del libro"; } /** Título del libro**/
    public String getlibroId() { return "Id de el libro"; } /** ID del libro (repetido)**/
    public String getusuarioId() { return " Id de usuario"; } /** ID de usuario (repetido)**/
    public String gettotalLibros() { return "Total de libros"; } /** Total de libros**/
    public String gettotalPrestamos() { return "Total de prestamos"; } /** Total de préstamos**/
    public String gettotalUsuarios() { return "Usuarios totales"; } /** Total de usuarios**/
    public String getreporteBiblioteca() { return " Reporte de biblioteca"; } /** Informe de la biblioteca**/
    public String getOpcionInvalida() { return "Opción no válida. Intente de nuevo."; } /** Opción inválida**/
    public String getLibroAgregado() { return "Libro agregado exitosamente."; } /** Libro agregado exitosamente**/
    public String getUsuarioAgregado() { return "Usuario agregado exitosamente."; } /** Usuario agregado exitosamente**/
    public String getPrestamoExitoso() { return "Préstamo realizado exitosamente."; } /** Préstamo exitoso**/
    public String getPrestamoFallido() { return "No se pudo realizar el préstamo. Verifique la disponibilidad del libro y el número de préstamos activos del usuario."; } /**Préstamo fallido**/
}