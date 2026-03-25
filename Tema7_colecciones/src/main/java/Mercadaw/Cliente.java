package Mercadaw;
/**
 * Clase que representa a un cliente del supermercado.
 *
 * Guarda los datos básicos como usuario, contraseña,
 * dirección, su pedido y si ha aplicado promociones.
 */
public class Cliente {
    private String usuario;
    private String contraseña;
    private String direccion;
    private Pedido pedido;
    private boolean promociones;
    /**
     * Constructor de la clase Cliente.
     *
     * Inicializa el usuario, la contraseña y asigna
     * una dirección por defecto. El pedido empieza en null
     * y las promociones desactivadas.
     *
     * @param usuario nombre del usuario
     * @param contraseña contraseña del usuario
     */
    public Cliente(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.direccion = "calle falsa, 123";
        this.pedido = null;
        this.promociones=false;
    }
    /**
     * Crea un nuevo pedido para el cliente.
     */

    public void crearpedido(){
        System.out.println("creando pedido....");
        this.pedido = new Pedido();
    }

    /**
     * Añade un producto al pedido del cliente.
     *
     * @param producto producto que se quiere añadir
     */

    public void insertarProducto(Producto producto) {
        pedido.insertarProducto(producto);
    }

    /**
     * Cambia el nombre de usuario.
     *
     * @param usuario nuevo usuario
     */

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setPromociones(boolean promociones) {
        this.promociones = promociones;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public boolean isPromociones() {
        return promociones;
    }
    /**
     * Muestra la información del cliente en forma de texto.
     */
    @Override
    public String toString() {
        return "Cliente{" +
                "usuario='" + usuario + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", direccion='" + direccion + '\'' +
                ", pedido=" + pedido +
                ", promociones=" + promociones +
                '}';
    }
}
