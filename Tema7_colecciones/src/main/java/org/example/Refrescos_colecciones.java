package org.example;


import java.util.Objects;

public class Refrescos_colecciones {
        private String marca;
        private double precio;

        public Refrescos_colecciones(String marca, double precio){
            this.marca = marca;
            this.precio = precio;
        }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Refrescos_colecciones that = (Refrescos_colecciones) o;
        return Double.compare(precio, that.precio) == 0 && Objects.equals(marca, that.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, precio);
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Refrescos_colecciones{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                '}';
    }
}

