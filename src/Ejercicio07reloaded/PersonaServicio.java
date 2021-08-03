package Ejercicio07reloaded;

import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class PersonaServicio {

    Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    private final int PESO_BAJO = -1;
    private final int PESO_IDEAL = 0;
    private final int PESO_ALTO = 1;

    public Persona crearPersona() {

        System.out.println("Ingrese el nombre.");
        String nombre = Leer.next();

        System.out.println("Ingrese la edad.");
        int edad = Leer.nextInt();

        System.out.println("Ingrese el sexo.");
        char sexo = Character.toUpperCase(Leer.next().charAt(0));

        System.out.println("Ingrese el peso.");
        double peso = Leer.nextDouble();

        System.out.println("Ingrese la altura.");
        double altura = Leer.nextDouble();

        while (sexo != 'M' && sexo != 'F' && sexo != 'O') {

            System.out.println("Opción incorrecta. Intente nuevamente.");

            System.out.println("Ingrese el sexo.");
            sexo = Character.toUpperCase(Leer.next().charAt(0));

        }

        return new Persona(nombre, edad, sexo, peso, altura);

    }

    public int calcularIMC(Persona p) {

        double peso = p.getPeso();
        double altura = p.getAltura();

        double imc = peso / (Math.pow(altura, 2));

        if (imc < 20) {
            return PESO_BAJO;

        } else if (imc > 25) {
            return PESO_ALTO;

        } else {
            return PESO_IDEAL;
        }

    }

    public boolean esMayorDeEdad(Persona p) {

        return p.getEdad() >= 18;

    }

    public Persona[] crearPersonas(int cant) {

        Persona[] personas = new Persona[cant];

        for (int i = 0; i < personas.length; i++) {

            personas[i] = crearPersona();

        }
        return personas;

    }

    public void porcentajePeso(Persona[] personas) {

        int contadorBajo = 0;
        int contadorIdeal = 0;
        int contadorAlto = 0;
        int cantidadPersonas = personas.length;

        for (Persona persona : personas) {

            switch (calcularIMC(persona)) {

                case -1:

                    System.out.println(persona.getNombre() + " se encuentra en bajo peso.");
                    contadorBajo++;
                    break;

                case 0:

                    System.out.println(persona.getNombre() + " esta en peso ideal.");
                    contadorIdeal++;
                    break;

                case 1:

                    System.out.println(persona.getNombre() + " esta por encima del peso ideal.");
                    contadorAlto++;
                    break;

            }

        }

        System.out.println("El " + ((contadorBajo * 100) / cantidadPersonas) + " % de los pacientes posee bajo peso.");
        System.out.println("El " + ((contadorIdeal * 100) / cantidadPersonas) + " % de los pacientes esta en su peso ideal.");
        System.out.println("El " + ((contadorAlto * 100) / cantidadPersonas) + " % de los pacientes posee alto peso.");

    }

    public void porcentajeEdad(Persona[] personas) {

        int contadorMayor = 0;
        int cantidadPersonas = personas.length;

        for (Persona persona : personas) {

            if (esMayorDeEdad(persona)) {

                contadorMayor++;
                System.out.println(persona.getNombre() + " es mayor de edad.");

            }

        }

        System.out.println("El " + ((contadorMayor * 100) / cantidadPersonas) + " % de los pacientes es mayor de edad.");

    }

}
