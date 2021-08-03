package Ejercicio07.Servicio;

import Ejercicio07.entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class PersonaService {

    private Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {

        char sexo = 'A';

        System.out.println("Ingrese el nombre.");
        String nombre = Leer.next();

        System.out.println("Ingrese la edad.");
        int edad = Leer.nextInt();

        do {
            System.out.println("Ingrese el sexo.");
            sexo = Leer.next().charAt(0);

            if (sexo != 'M' && sexo != 'F' && sexo != 'O') {
                System.out.println("Opción inválida. Intente nuevamente.");

            }

        } while (sexo != 'M' && sexo != 'F' && sexo != 'O');

        System.out.println("Ingrese el peso.");
        double peso = Leer.nextDouble();

        System.out.println("Ingrese la altura.");
        double altura = Leer.nextDouble();

        return new Persona(nombre, edad, sexo, peso, altura);

    }

    public int calcularIMC(Persona P1, double peso, double altura) {

        P1.setImc((P1.getPeso() / (Math.pow(P1.getAltura(), 2))));

        if (P1.getImc() < 20) {
            return -1;
        } else if (P1.getImc() > 25) {
            return 1;
        } else {
            return 0;
        }

    }

    public boolean esMayorDeEdad(Persona P1, int edad) {

        boolean mayor = false;

        if (P1.getEdad() >= 18) {
            mayor = true;
        }
        return mayor;
    }
}
