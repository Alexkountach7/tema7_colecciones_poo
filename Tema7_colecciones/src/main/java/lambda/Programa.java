package lambda;

public class Programa {
    public static void main(String[] args) {

        // Clase anónima
        Prueba anonima = new Prueba() {
            @Override
            public void Saludar(String nombre) {
                System.out.println("hola soy una anonima");

            }
        };

        // Lambda
        Prueba lambda = (String nombre) -> {
            System.out.println("hola soy una lambda");
            // nombre.charAt(nombre.length(nombre.length())/2);
        };


        // Ejecutar
        anonima.Saludar("ivan");
        lambda.Saludar("pablo");
    }
}