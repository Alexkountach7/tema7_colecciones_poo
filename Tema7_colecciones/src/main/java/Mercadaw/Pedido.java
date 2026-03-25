package Mercadaw;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static Mercadaw.AppZonaClientes.cliente;
/**
 * Clase que representa el pedido de un cliente.
 *
 * Aquí se guardan los productos añadidos, sus cantidades
 * y el importe total del carrito.
 */
public class Pedido {
    private HashMap<Producto,Integer> mapapedido;
    private double importetotal;
    Scanner sc = new Scanner(System.in);
    /**
     * Constructor de la clase Pedido.
     *
     * Inicializa el mapa de productos vacío y el importe a 0.
     */
    public Pedido() {
        this.mapapedido = new HashMap<>();
        this.importetotal = 0;
    }




    /**
     * Suma una cantidad al importe total.
     *
     * @param importe cantidad a añadir
     */

    public void actualizarImportetotal(double importe){
        importetotal +=importe;

    }

    /**
     * Inserta un producto en el pedido.
     *
     * Si el producto ya existe, aumenta la cantidad.
     * Si no existe, lo añade con cantidad 1.
     *
     * También actualiza el importe total.
     *
     * @param producto producto a añadir
     */
    public void insertarProducto(Producto producto) { // revisarlo


        if (mapapedido.containsKey(producto)) {
            int cantidad = mapapedido.get(producto);
            mapapedido.put(producto, cantidad + 1);
        } else {
            mapapedido.put(producto, 1);
        }
        actualizarImportetotal(producto.getPrecio());



    }
    /**
     * Aplica la promoción 3x2 al pedido.
     *
     * Por cada 3 unidades de un producto, solo se pagan 2.
     * Se recalcula el importe total.
     */

    public void aplicarPromo3x2(){
        double nuevototal =0;
        for (Map.Entry<Producto, Integer> mapa : mapapedido.entrySet()){
            int cantidad = mapa.getValue();
            Producto producto = mapa.getKey();

            int grupos = cantidad/3;
            int cantidadpagar = cantidad -grupos;

            nuevototal += cantidadpagar* producto.getPrecio();
        }

        importetotal = nuevototal;

    }
    /**
     * Aplica un descuento del 10% al importe total.
     */
    public void aplicarPromo10(){
        importetotal = importetotal*0.9;


    }

    public HashMap<Producto, Integer> getMapapedido() {
        return mapapedido;
    }

    public double getImportetotal() {
        return importetotal;
    }

    public void setMapapedido(HashMap<Producto, Integer> mapapedido) {
        this.mapapedido = mapapedido;
    }

    public void setImportetotal(double importetotal) {
        this.importetotal = importetotal;
    }

}
