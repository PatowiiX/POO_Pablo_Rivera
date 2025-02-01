package edu.pablo.rivera.actividades.Actividad3.process;

/** Clase que representa la colección de productos**/
public class Products {
    /** Array que almacena los productos**/
    private Product[] productList;

    /**Inicializa el array de productos con una cantidad específica**/
    public Products(int quantity) {
        productList = new Product[quantity]; // Crea un nuevo array de productos con el tamaño especificado
    }

    /** Metodo para agregar un producto en una posición específica del array**/
    public void addProduct(Product product, int index) {
        /** Verifica que el índice esté dentro de los límites del array**/
        if (index >= 0 && index < productList.length) {
            productList[index] = product; /** Asigna el producto al índice especificado**/
        }
    }

    /**Metodo para obtener un producto de una posición específica del array**/
    public Product getProduct(int index) {
        /** Verifica que el índice esté dentro de los límites del array**/
        if (index >= 0 && index < productList.length) {
            return productList[index]; // Devuelve el producto en el índice especificado
        }
        return null; /** Si el índice es inválido, devuelve null**/
    }
}