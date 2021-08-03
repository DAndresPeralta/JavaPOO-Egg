package Ejercicio11;

import Ejercicio11.Servicio.servicioFecha;
import Ejercicio11.entidades.Fecha;
import java.util.Date;

/**
 *
 * @author d.andresperalta
 */
public class Ejercicio11 {

    public static void main(String[] args) {

        servicioFecha Sf1 = new servicioFecha();

        Fecha F1 = Sf1.crearFecha();

        Date Fecha = new Date (F1.getAnio(), F1.getMes(), F1.getDia());

        System.out.println(Fecha);
        
        Date fechaActual = new Date();
        
        System.out.println(fechaActual);

        int year = fechaActual.getYear() - Fecha.getYear();
        
        System.out.println("La diferencia de años es: " + year);
        

    }

}
