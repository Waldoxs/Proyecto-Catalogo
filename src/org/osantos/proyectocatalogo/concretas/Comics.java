package org.osantos.proyectocatalogo.concretas;

import java.util.Date;

public class Comics extends Libro{

    private String personaje;

    public Comics(int precio, Date fechaPublicacion, String editorial, String titulo, String autor, String personaje) {
        super(precio, fechaPublicacion, editorial, titulo, autor);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return personaje;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 0.85;
    }

    @Override
    public String toString() {
        return "========== Comic ========== \n" +
                "Título: " + getTitulo() + "\n" +
                "Autor: " + getAutor() + "\n" +
                "Fecha de publicación: " + getFechaPublicacion() + "\n" +
                "Precio: $" + getPrecioVenta() + "\n";
    }
}
