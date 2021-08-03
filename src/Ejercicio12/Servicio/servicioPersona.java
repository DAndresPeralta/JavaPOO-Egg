package Ejercicio12.Servicio;

import Ejercicio12.entidades.Persona;
import java.util.Date;

import java.util.Scanner;

public class servicioPersona {

    Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {

        System.out.println("Ingrese su nombre.");
        String nombre = Leer.next();

        System.out.println("Ingrese su fecha de nacimiento.");

        System.out.print("Día: ");
        int dia = Leer.nextInt();

        System.out.print("Mes: ");
        int mes = Leer.nextInt();
        mes = (mes - 1);

        System.out.print("Año: ");
        int anio = Leer.nextInt();
        anio = (anio - 1900);

        return new Persona(nombre, dia, mes, anio);

    }

    public void calcularEdad(Persona P1, Date fechaDeNacimiento, Date fechaActual, String nombre) {

        int edad;

        edad = (fechaActual.getYear() - fechaDeNacimiento.getYear());

        P1.setEdad(edad);

        System.out.println("La edad de " + P1.getNombre() + " es " + P1.getEdad() + " años.");

    }

    public boolean menorQue(Persona P1, Persona P2, int edad, int edad2) {

        boolean resp;

        if (P1.getEdad() < P2.getEdad()) {
            resp = true;
        } else {
            resp = false;
        }
        return resp;
    }

    public void mostrarPersona(Persona P2, String nombre, Date fechaDeNacimiento2, int edad) {

        System.out.println("Nombre: " + P2.getNombre() + "\n"
                + "Fecha de nacimiento: " + fechaDeNacimiento2 + "\n"
                + "Edad: " + P2.getEdad());

    }

}
