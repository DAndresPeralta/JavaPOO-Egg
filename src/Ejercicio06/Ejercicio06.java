package Ejercicio06;

import Ejercicio06.Servicios.Servicio;
import Ejercicio06.entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class Ejercicio06 {

    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in).useDelimiter("\n");

        Servicio Sc1 = new Servicio();

        Cafetera C1 = Sc1.llenarCafetera();

        Sc1.menu();

        switch (Sc1.respuesta(C1.getRespuesta())) {

            case 1:
                System.out.println("***Servir***");
                Sc1.servirTaza(C1.getCapacidadActual());
                break;

            case 2:
                System.out.println("***Vaciar***");
                System.out.println("Cantidad de café: " + Sc1.vaciarCafetera(C1.getCapacidadActual()));
                break;

            case 3:

                System.out.println("Ingrese una cantidad de café a agregar.");
                double cafe = Leer.nextDouble();

                System.out.println("Cantidad de cafe: " + Sc1.agregarCafe(cafe, C1.getCapacidadActual()));
                break;

        }

    }

}
