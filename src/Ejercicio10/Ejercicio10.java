package Ejercicio10;

import Ejercicio10.Servicio.servicioArreglo;
import Ejercicio10.entidades.Arreglo;

/**
 *
 * @author d.andresperalta
 */
public class Ejercicio10 {

    public static void main(String[] args) {

        servicioArreglo Sa1 = new servicioArreglo();

        Arreglo Array1 = Sa1.crearArreglo();

        System.out.println("ARREGLO A: ");
        System.out.println();

        Sa1.mostrarArreglo(Array1, Array1.getA());

        System.out.println();
        System.out.println("ARREGLO A ORDENADO: ");
        System.out.println();

        Sa1.ordenarArreglo(Array1, Array1.getA(), Array1.getB());

        System.out.println();
        System.out.println("ARREGLO B: ");
        System.out.println();

        Sa1.llenarArregloB(Array1, Array1.getA(), Array1.getB());

    }

}
