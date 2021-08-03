package Ejercicio12;

import Ejercicio12.Servicio.servicioPersona;
import Ejercicio12.entidades.Persona;
import java.util.Date;

/**
 *
 * @author d.andresperalta
 */
public class Ejercicio12 {

    public static void main(String[] args) {

        servicioPersona Sp1 = new servicioPersona();

        Persona P1 = Sp1.crearPersona();

        Date fechaDeNacimiento = new Date(P1.getAnio(), P1.getMes(), P1.getDia());

        Date fechaActual = new Date();

        Sp1.calcularEdad(P1, fechaDeNacimiento, fechaActual, P1.getNombre());

        Persona P2 = Sp1.crearPersona();

        Date fechaDeNacimiento2 = new Date(P2.getAnio(), P2.getMes(), P2.getDia());

        Sp1.calcularEdad(P2, fechaDeNacimiento2, fechaActual, P2.getNombre());

        if (Sp1.menorQue(P1, P2, P1.getEdad(), P2.getEdad()) == true) {
            System.out.println(P1.getNombre() + " es menor que " + P2.getNombre());
        }

        if (Sp1.menorQue(P1, P2, P1.getEdad(), P2.getEdad()) == false) {
            System.out.println(P1.getNombre() + " es mayor que " + P2.getNombre());
        }
        
        Sp1.mostrarPersona(P2, P2.getNombre(), fechaDeNacimiento2, P2.getEdad());

    }

}
