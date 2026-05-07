import java.io.Serializable;

public class Nave implements Serializable {
    private String nomnbre;
    private double peso;
    private double velocidad;

    public Nave (String nombre, double peso, double velocidad) {
        this.nomnbre = nombre;
        this.peso = peso;
        this.velocidad = velocidad;
    }


    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public String getNomnbre() {
        return nomnbre;
    }

    public void setNomnbre(String nomnbre) {
        this.nomnbre = nomnbre;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Nave{" +
                "nomnbre='" + nomnbre + '\'' +
                ", peso=" + peso +
                ", velocidad=" + velocidad +
                '}';
    }
}
