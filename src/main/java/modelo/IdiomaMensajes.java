package modelo;

/**Interfaz que define los métodos para proporcionar mensajes en diferentes idiomas**/
public interface IdiomaMensajes {

    String getTitulo(); /** Metodo para obtener el título del sistema**/
    String getOpcion1(); /** Metodo para obtener la opción 1**/
    String getOpcion2(); /** Metodo para obtener la opción 2**/
    String getOpcion3(); /** Metodo para obtener la opción 3**/
    String getOpcion4(); /**Metodo para obtener la opción 4**/
    String getOpcion5(); /** Metodo para obtener la opción 5**/
    String getSeleccion(); /** Metodo para obtener el mensaje de selección de opción**/
    String getSalida(); /** Metodo para obtener el mensaje de salida**/
    String getOpcionInvalida(); /** Metodo para obtener el mensaje de opción inválida**/
    String getIdLibro(); /**Metodo para obtener el mensaje del ID del libro**/
    String getautorLibro(); /**Metodo para obtener el mensaje del autor del libro**/
    String gettituloLibro(); /** Metodo para obtener el mensaje del título del libro**/
    String getidUsuario(); /** Metodo para obtener el mensaje del ID del usuario**/
    String getnombreUsuario(); /** Metodo para obtener el mensaje del nombre del usuario**/
    String getgmailUsuario(); /** Metodo para obtener el mensaje del Gmail del usuario**/
    String getusuarioId(); /** Metodo para obtener el mensaje del ID del usuario (repetido)**/
    String getlibroId(); /** Metodo para obtener el mensaje del ID del libro (repetido)**/
    String getreporteBiblioteca(); /** Metodo para obtener el mensaje del reporte de la biblioteca**/
    String gettotalLibros(); /** Metodo para obtener el mensaje del total de libros**/
    String gettotalUsuarios(); /** Metodo para obtener el mensaje del total de usuarios**/
    String gettotalPrestamos(); /** Metodo para obtener el mensaje del total de préstamos**/
    String getLibroAgregado(); /** Metodo para obtener el mensaje de libro agregado**/
    String getUsuarioAgregado(); /**Metodo para obtener el mensaje de usuario agregado**/
    String getPrestamoExitoso(); /**Metodo para obtener el mensaje de préstamo exitoso**/
    String getPrestamoFallido(); /** Metodo para obtener el mensaje de préstamo fallido**/
}