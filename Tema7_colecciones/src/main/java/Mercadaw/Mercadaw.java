package Mercadaw;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
/**
 * Clase que representa el supermercado MERCADAW.
 *
 * Se encarga principalmente de gestionar los clientes,
 * generarlos de forma aleatoria y devolver la lista.
 */
public class Mercadaw {
    private Set<Cliente> cliente;
    /**
     * Constructor de la clase.
     *
     * Inicializa el conjunto de clientes vacío.
     */
    public Mercadaw() {
        this.cliente = new HashSet<>();
    }

    Random aleatorio = new Random();
    String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    /**
     * Genera varios clientes de forma aleatoria.
     *
     * Cada cliente tiene:
     * - Usuario de 8 caracteres
     * - Contraseña de 8 caracteres
     *
     * Después de generarlos, se muestran por pantalla.
     */

    public void generarclientes() {

        for (int j=0; j < 5; j++) {
            String contraseña = "";
            for (int i = 0; i < 8; i++) {
                int indice = aleatorio.nextInt(caracteres.length());
                contraseña += caracteres.charAt(indice);

            }
            String usuario = "";
            for (int i = 0; i < 8; i++) {
                int indice = aleatorio.nextInt(caracteres.length());
                usuario += caracteres.charAt(indice);
            }

            cliente.add(new Cliente(usuario,contraseña));


//        Cliente cliente1 = new Cliente(usuario,contraseña);
//        cliente.add(cliente1);
//        Cliente cliente2 = new Cliente(usuario,contraseña);
//        cliente.add(cliente2);
//        Cliente cliente3 = new Cliente(usuario,contraseña);
//        cliente.add(cliente3);
//        Cliente cliente4 = new Cliente(usuario,contraseña);
        }
        for (Cliente cliente_1: cliente){
            System.out.println(cliente_1);
        }
    }

    /**
     * Devuelve el conjunto de clientes.
     *
     * Se devuelve como no modificable para evitar cambios externos.
     *
     * @return conjunto de clientes
     */

    public Set<Cliente> getClientes() {
        return Collections.unmodifiableSet(cliente);
    }

    @Override
    public String toString() {
        return "Mercadaw{" +
                "cliente=" + cliente +
                '}';
    }
}
