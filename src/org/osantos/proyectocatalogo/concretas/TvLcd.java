package org.osantos.proyectocatalogo.concretas;

import org.osantos.proyectocatalogo.abstractas.Electronico;

public class TvLcd extends Electronico {
    private int pulgada;

    public TvLcd(int precio, String fabricante, int pulgada) {
        super(precio, fabricante);
        this.pulgada = pulgada;
    }

    public int getPulgada() {
        return pulgada;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 0.8;
    }

    @Override
    public String toString() {
        return "========== TV Lcd ========== \n" +
                "Fabricante: " + fabricante + "\n" +
                "Pulgadas: " + pulgada + " in \n" +
                "Precio: $" + getPrecioVenta() + "\n";
    }
}
