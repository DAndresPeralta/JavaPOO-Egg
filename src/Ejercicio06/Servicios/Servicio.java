package Ejercicio06.Servicios;

//* @author d.andresperalta*/
import Ejercicio06.entidades.Cafetera;
import java.util.Scanner;

public class Servicio {

    private Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    public void menu() {

        System.out.println("*****NESPRESSO*****");
        System.out.println("--------------------------");
        System.out.println("Seleccione un opción:");
        System.out.println("1: Servir");
        System.out.println("2: Vaciar.");
        System.out.println("3: Rellenar.");
        System.out.println("4: Salir");

    }

    public int respuesta(int respuesta) {

        do {
            System.out.println("Ingrese un opción correcta.");
            respuesta = Leer.nextInt();

            if (respuesta > 4 || respuesta < 1) {

            }

        } while (respuesta > 4 || respuesta < 1);
        return respuesta;

    }

    public Cafetera llenarCafetera() {

        System.out.println("*****NESPRESSO*****");

        System.out.println("Ingrese la capacidad de su cafetera.");
        double capacidadMaxima = Leer.nextDouble();

        double capacidadActual = capacidadMaxima;

        System.out.println("Su cafetera esta llena.");

        return new Cafetera(capacidadMaxima, capacidadActual);

    }

    public void servirTaza(double cantidadActual) {

        double total;

        System.out.println("Ingrese el tamaño de la taza.");
        double tazaVacia = Leer.nextDouble();

        if (cantidadActual < tazaVacia) {

            total = cantidadActual;

            System.out.println("La taza no se lleno.");
            System.out.println("Alcanzo: " + total);
            System.out.println("Café disponible: 0");

        } else {

            total = (cantidadActual - tazaVacia);
            System.out.println("La taza se lleno.");
            System.out.println("Café disponible: " + total);

        }

    }

    public double vaciarCafetera(double cantidadActual) {

        cantidadActual = 0;
        return cantidadActual;

    }

    public double agregarCafe(double cafe, double cantidadActual) {

        return (cantidadActual + cafe);
    }

}
