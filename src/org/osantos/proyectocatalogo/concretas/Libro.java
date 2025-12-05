package org.osantos.proyectocatalogo.concretas;

import org.osantos.proyectocatalogo.abstractas.Producto;
import org.osantos.proyectocatalogo.interfaz.ILibro;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Libro extends Producto implements ILibro {
    private Date fechaPublicacion = new Date();
    private String autor;
    private String titulo;
    private String editorial;


    public Libro(int precio, Date fechaPublicacion, String editorial, String titulo, String autor) {
        super(precio);
        this.fechaPublicacion = fechaPublicacion;
        this.editorial = editorial;
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    @Override
    public String getEditorial() {
        return editorial;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 0.95;
    }

    @Override
    public String toString() {
        return "========== Libro ========== \n" +
                "Título: " + titulo + "\n" +
                "Autor: " + autor + "\n" +
                "Editorial: " + editorial + "\n" +
                "Fecha de publicación " + formatoDia.format(getFechaPublicacion()) + "\n" +
                "Precio: $" + getPrecioVenta() + "\n";

    }
}
