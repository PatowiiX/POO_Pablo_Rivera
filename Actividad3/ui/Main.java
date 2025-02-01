package edu.pablo.rivera.actividades.Actividad3.ui;

import edu.pablo.rivera.actividades.Actividad3.process.Product; /** Importa la clase Product**/
import java.util.Scanner; /** Importa la clase Scanner para la entrada de datos**/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); /** Crea un objeto Scanner para leer la entrada del usuario**/

        /** Crear los dos objetos de la clase Product **/
        Product product1 = new Product(); // Crea el primer objeto de tipo Product
        Product product2 = new Product(); // Crea el segundo objeto de tipo Product

        /** Entrada de datos para el primer producto A **/
        try {
            System.out.println("Ingrese los datos del primer producto:"); /** Mensaje para el usuario**/
            System.out.print("Código: "); /** Solicita el código del producto**/
            product1.setCode(scanner.nextLine()); /** Lee el código y lo establece en product1**/
            System.out.print("Tipo: "); /** Solicita el tipo del producto**/
            product1.setType(scanner.nextLine()); /** Lee el tipo y lo establece en product1**/
            System.out.print("Costo: "); /** Solicita el costo del producto**/
            product1.setCost(scanner.nextLine()); /** Lee el costo y lo establece en product1**/
            System.out.print("Impuesto: "); /**Solicita el impuesto del producto**/
            product1.setTax(scanner.nextDouble()); /**Lee el impuesto y lo establece en product1**/
            scanner.nextLine(); /** Dejar limpito el buffer **/
        } catch (Exception e) {
            System.out.println("Esta mal, te equivocaste en algo, estas mal!!: " + e.getMessage()); /**Mensaje de error**/
            return; /** Sale del metodo main en caso de error**/
        }

        /** Entrada de datos para el segundo producto B **/
        try {
            System.out.println("Ingrese los datos del segundo producto:"); // Mensaje para el usuario
            System.out.print("Código: "); /** Solicita el código del producto
            product2.setCode(scanner.nextLine()); /** Lee el código y lo establece en product2**/
            System.out.print("Tipo: "); /** Solicita el tipo del producto**/
            product2.setType(scanner.nextLine()); /** Lee el tipo y lo establece en product2**/
            System.out.print("Costo: "); /** Solicita el costo del producto**/
            product2.setCost(scanner.nextLine()); /** Lee el costo y lo establece en product2**/
            System.out.print("Impuesto: "); /** Solicita el impuesto del producto**/
            product2.setTax(scanner.nextDouble()); /** Lee el impuesto y lo establece en product2**/
            scanner.nextLine(); /**Limpiar el buffer**/
        } catch (Exception e) {
            System.out.println("Esta mal, te equivocaste en algo, estas mal!! " + e.getMessage()); /** Mensaje de error**/
            return;
        }

        /** Mostrar productos **/
        System.out.println("\nDetalles del primer producto:"); /** Mensaje para mostrar detalles del primer producto
        product1.showProduct(); /** Llama al metodo para mostrar los detalles del primer producto**/
        System.out.println("\nDetalles del segundo producto:"); /**Mensaje para mostrar detalles del segundo producto**/
        product2.showProduct(); /** Llama al metodo para mostrar los detalles del segundo producto**/

        /** Comparar productos **/
        String result = compareProducts(product1, product2); /** Llama al metodo para comparar los productos**/
        System.out.println("\nProducto con mayor precio de venta: " + result); /** Muestra el resultado de la comparación**/
    }

    /** Metodo estático para comparar productos **/
    public static String compareProducts(Product p1, Product p2) {
        double price1 = p1.calculatePrice(20.0); /** Porcentaje de utilidad **/ /**Calcula el precio de venta del primer producto**/
        double price2 = p2.calculatePrice(20.0); /** Porcentaje de utilidad **/ /** Calcula el precio de venta del segundo producto**/

        /** Compara los precios de venta y devuelve el tipo y código del producto con mayor precio**/
        if (price1 > price2) {
            return p1.getType() + " (Código: " + p1.getCode() + ")"; /**Devuelve el tipo y código del primer producto**/
        } else {
            return p2.getType() + " (Código: " + p2.getCode() + ")"; /** Devuelve el tipo y código del segundo producto**/
        }
    }
}