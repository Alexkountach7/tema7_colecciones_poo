package Portatil;

public class Portatil implements Comparable<Portatil> {
    private String nombre;
    private Integer ram;
    private Double peso;

    public Portatil(String nombre,int ram, double peso) {
        this.nombre = nombre;
        this.ram = ram;
        this.peso = peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getRam() {
        return ram;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Portatil{" +
                "nombre='" + nombre + '\'' +
                ", ram=" + ram +
                ", peso=" + peso +
                '}';
    }

    @Override
    public int compareTo(Portatil portatil) {
        int comparar = ram.compareTo(portatil.getRam());

        if (comparar!=0){
            return comparar;
        }

        comparar = peso.compareTo(portatil.getPeso());
        if (comparar!=0){
            return comparar;
        }
        return 0;
    }
}
