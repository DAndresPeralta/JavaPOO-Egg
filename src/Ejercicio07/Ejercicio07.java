package Ejercicio07;

import Ejercicio07.Servicio.PersonaService;
import Ejercicio07.entidades.Persona;

/**
 *
 * @author d.andresperalta
 */
public class Ejercicio07 {

    public static void main(String[] args) {

        int contador = 0;
        int contadorB = 0;
        int contadorI = 0;
        int contadorS = 0;

        PersonaService Sp1 = new PersonaService();

        Persona P1 = Sp1.crearPersona();

        Sp1.calcularIMC(P1, P1.getPeso(), P1.getAltura());

        System.out.println("El IMC de " + P1.getNombre() + " es: " + P1.getImc());

        System.out.println("Su rango es : " + Sp1.calcularIMC(P1, P1.getPeso(), P1.getAltura()));

        if (Sp1.esMayorDeEdad(P1, P1.getEdad()) == true) {

            System.out.println(P1.getNombre() + " es mayor de edad.");
            contador = contador + 1;
        }

        if (P1.getImc() == -1) {
            contadorB++;

        } else if (P1.getImc() == 0) {
            contadorI++;
        } else if (P1.getImc() == 1) {
            contadorS++;
        }

        Persona P2 = Sp1.crearPersona();

        Sp1.calcularIMC(P2, P2.getPeso(), P2.getAltura());

        System.out.println("El IMC de " + P2.getNombre() + " es: " + P2.getImc());

        System.out.println("Su rango es : " + Sp1.calcularIMC(P2, P2.getPeso(), P2.getAltura()));

        if (Sp1.esMayorDeEdad(P2, P2.getEdad()) == true) {

            System.out.println(P2.getNombre() + " es mayor de edad.");
            contador = contador + 1;
        }
        if (P2.getImc() == -1) {
            contadorB++;

        } else if (P2.getImc() == 0) {
            contadorI++;
        } else if (P2.getImc() == 1) {
            contadorS++;
        }

        Persona P3 = Sp1.crearPersona();

        Sp1.calcularIMC(P3, P3.getPeso(), P3.getAltura());

        System.out.println("El IMC de " + P3.getNombre() + " es: " + P3.getImc());

        System.out.println("Su rango es : " + Sp1.calcularIMC(P3, P3.getPeso(), P3.getAltura()));

        if (Sp1.esMayorDeEdad(P3, P3.getEdad()) == true) {

            System.out.println(P3.getNombre() + " es mayor de edad.");
            contador = contador + 1;
        }

        if (P3.getImc() == -1) {
            contadorB++;

        } else if (P3.getImc() == 0) {
            contadorI++;
        } else if (P3.getImc() == 1) {
            contadorS++;
        }

        Persona P4 = Sp1.crearPersona();

        Sp1.calcularIMC(P4, P4.getPeso(), P4.getAltura());

        System.out.println("El IMC de " + P4.getNombre() + " es: " + P4.getImc());

        System.out.println("Su rango es : " + Sp1.calcularIMC(P4, P4.getPeso(), P4.getAltura()));

        if (Sp1.esMayorDeEdad(P4, P4.getEdad()) == true) {

            System.out.println(P4.getNombre() + " es mayor de edad.");
            contador = contador + 1;
        }
        if (P4.getImc() == -1) {
            contadorB++;

        } else if (P4.getImc() == 0) {
            contadorI++;
        } else if (P4.getImc() == 1) {
            contadorS++;
        }
        
        int promedio1 = (contador/4)*100;

        System.out.println("Promedio de mayores de edad: " + promedio1);

        System.out.println("Promedio de pacientes con bajo IMC: " + (contadorB / 4) * 100);

        System.out.println("Promedio de pacientes con IMC normal: " + (contadorI / 4) * 100);

        System.out.println("Promedio de pacientes con alto IMC: " + (contadorS / 4) * 100);

    }

}
