package modelo;

/** Clase que implementa la interfaz IdiomaMensajes para proporcionar mensajes en chino**/
public class IdiomaChino implements IdiomaMensajes {

    /** Métodos que devuelven mensajes en chino para la interfaz de usuario**/
    public String getTitulo() { return "=== 图书馆管理系统 ==="; }
    public String getOpcion1() { return "1. 添加书籍"; } /** Opción 1: Agregar libro**/
    public String getOpcion2() { return "2. 添加用户"; } /**Opción 2: Agregar usuario**/
    public String getOpcion3() { return "3. 进行借阅"; } /** Opción 3: Realizar préstamo**/
    public String getOpcion4() { return "4. 生成报告"; } /** Opción 4: Generar informe**/
    public String getOpcion5() { return "5. 退出"; } /** Opción 5: Salir**/
    public String getSeleccion() { return "选择一个选项: "; } /** Mensaje para seleccionar opción**/
    public String getSalida() { return "退出中..."; } /** Mensaje de salida**/
    public String getidUsuario() { return "用户身份"; } /** ID de usuario**/
    public String getnombreUsuario() { return "用户名"; } /** Nombre de usuario**/
    public String getgmailUsuario() { return " Gmail 用户"; } /** Usuario de Gmail**/
    public String getIdLibro() { return "图书编号"; } /** ID del libro**/
    public String getautorLibro() { return " 作者书"; } /** Autor del libro**/
    public String gettituloLibro() { return "书名"; } /** Título del libro**/
    public String getlibroId() { return "图书编号"; } /** ID del libro (repetido)**/
    public String getusuarioId() { return " 用户身份"; } /** ID de usuario (repetido)**/
    public String gettotalPrestamos() { return "总图书数: "; } /** Total de libros**/
    public String gettotalLibros() { return "用户总数: "; } /** Total de usuarios**/
    public String gettotalUsuarios() { return "贷款总额: "; } /** Total de préstamos**/
    public String getreporteBiblioteca() { return " 图书馆报告"; } /** Informe de la biblioteca**/
    public String getOpcionInvalida() { return "无效选项。请再试一次。"; } /** Opción inválida**/
    public String getLibroAgregado() { return "书籍添加成功。"; } /** Libro agregado exitosamente**/
    public String getUsuarioAgregado() { return "用户添加成功。"; } /** Usuario agregado exitosamente**/
    public String getPrestamoExitoso() { return "借贷成功。"; } /** Préstamo exitoso**/
    public String getPrestamoFallido() { return "无法进行借贷。请检查书籍的可用性和用户的活动借贷。"; } /** Préstamo fallido**/
}

