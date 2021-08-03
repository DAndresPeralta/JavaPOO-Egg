package Ejercicio07reloaded;

import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class Ejercicio07 {

    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in).useDelimiter("\n");

        PersonaServicio Ps1 = new PersonaServicio();

        System.out.println("Ingrese la cantidad de personas a registrar.");

        int paciente = Leer.nextInt();

        Persona[] vectorPersonas = Ps1.crearPersonas(paciente);

        Ps1.porcentajePeso(vectorPersonas);

        Ps1.porcentajeEdad(vectorPersonas);

    }

}
