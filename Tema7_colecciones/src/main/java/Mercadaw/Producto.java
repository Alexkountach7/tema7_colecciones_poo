package Mercadaw;
/**
 * Enum que representa los productos disponibles en el supermercado.
 *
 * Cada producto tiene un precio asociado.
 */
public enum Producto {
    MANZANAS(2.30),
    PAN(1.0),
    ARROZ(3.5),
    POLLO(4.30),
    LECHE(1.30),
    ACEITE(8.30),
    HUEVOS(3.30),
    TOMATES(4.0),
    PASTA(0.89);

    private double precio;
    /**
     * Constructor del enum Producto.
     *
     * Asigna el precio a cada producto.
     *
     * @param precio precio del producto
     */
    Producto (double precio) {
        this.precio = precio;
    }

    /**
     * Devuelve el precio del producto.
     *
     * @return precio
     */

    public double getPrecio() {
        return precio;
    }

}
