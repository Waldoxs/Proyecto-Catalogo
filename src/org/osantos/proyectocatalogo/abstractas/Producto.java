package org.osantos.proyectocatalogo.abstractas;

import org.osantos.proyectocatalogo.interfaz.IProducto;

abstract public class Producto implements IProducto {
    protected int precio;

    public Producto(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return precio;
    }
}
