package net.salesianos;

public class Elemento implements Comparable<Elemento> {
    private String nombre;
    private String categoria;
    private String ubicacion;
    private int puntuacion;

    public Elemento(String nombre, String categoria, String ubicacion, int puntuacion) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.ubicacion = ubicacion;
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public int compareTo(Elemento otro) {
        return Integer.compare(otro.puntuacion, this.puntuacion);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Categoría: " + categoria + ", Ubicación: " + ubicacion + ", Puntuación: "
                + puntuacion;
    }
}
