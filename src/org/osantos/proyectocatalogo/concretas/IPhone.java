package org.osantos.proyectocatalogo.concretas;

import org.osantos.proyectocatalogo.abstractas.Electronico;

public class IPhone extends Electronico {
    private String modelo;
    private String color;

    public IPhone(int precio, String fabricante, String modelo, String color) {
        super(precio, fabricante);
        this.modelo = modelo;
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 0.9;
    }

    @Override
    public String toString() {
        return "========== Celular ========== \n" +
                "Fabricante: " + fabricante + "\n" +
                "Modelo: " + modelo + "\n" +
                "Color: " + color + "\n" +
                "Precio: $" + getPrecioVenta() + "\n";
    }
}
