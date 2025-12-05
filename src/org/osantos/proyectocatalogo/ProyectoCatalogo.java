package org.osantos.proyectocatalogo;

import org.osantos.proyectocatalogo.abstractas.*;
import org.osantos.proyectocatalogo.concretas.*;
import org.osantos.proyectocatalogo.interfaz.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ProyectoCatalogo {
    public static void main(String[] args) {

        Calendar fechaComic = Calendar.getInstance();
        fechaComic.set(1985, Calendar.JULY,1);
        Date fC = fechaComic.getTime();


        IProducto[] productos = new Producto[4];
        productos[0] = new Comics(130,fC, "DC comics","Batman vs los monstrous de gótica", "Philps", "Batman");
        productos[1] = new TvLcd(11500,"LG",65);
        productos[2] = new IPhone(50000,"Apple", "15 pro max", "Naranja");
        productos[3]=new Libro(200,new Date(),"Omega","Control de procesos", "Ogata");

        for(IProducto prod:productos){
            System.out.println(prod);

        }


    }
}
