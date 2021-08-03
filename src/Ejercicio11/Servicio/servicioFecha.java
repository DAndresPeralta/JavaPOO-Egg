package Ejercicio11.Servicio;

import Ejercicio11.entidades.Fecha;
import java.util.Scanner;

public class servicioFecha {

    public Fecha crearFecha() {

        Scanner Leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese un dia.");
        int dia = Leer.nextInt();

        System.out.println("Ingrese un mes (números).");
        int mes = Leer.nextInt();
        mes = (mes - 1);

        System.out.println("Ingrese un año.");
        int anio = Leer.nextInt();
        anio = (anio - 1900);
        
        

        return new Fecha(dia, mes, anio);
    }

}
