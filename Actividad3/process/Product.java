package edu.pablo.rivera.actividades.Actividad3.process;
/**Aqui se calcula el precio**/

/**Declaracion de atributos**/
public class Product {
    private String code;
    private String type;
    private String cost;
    private Double tax;

    /** Métodos de acceso A (getters)**/
    public String getCode() {
        return code;
    }

    public String getType() {
        return type;
    }

    public String getCost() {
        return cost;
    }

    public Double getTax() {
        return tax;
    }

    /**Métodos establecedores B (setters)**/
    public void setCode(String code) {
        this.code = code;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    /** Metodo para mostrar el producto**/
    public void showProduct() {
        System.out.println("Código: " + code);
        System.out.println("Tipo: " + type);
        System.out.println("Costo: " + cost);
        System.out.println("Impuesto: " + tax);
    }

    /** Metodo para calcular el precio de venta**/
    public double calculatePrice(double profitMargin) {
        double costDouble = Double.parseDouble(cost);
        double priceBeforeTax = costDouble + (costDouble * (profitMargin / 100));
        double finalPrice = priceBeforeTax + (priceBeforeTax * (tax / 100));
        return finalPrice;
    }
}