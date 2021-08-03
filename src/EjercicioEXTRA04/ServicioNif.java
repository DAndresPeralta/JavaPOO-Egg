package EjercicioEXTRA04;

import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class ServicioNif {

    private Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    private static final char[] vectorLetra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public NIF crearNif() {

        long dni;
        Character letra = ' ';
        int asignacion = 0;

        NIF N = new NIF();

        do {

            System.out.println("Ingrese su número de documento.");
            dni = Leer.nextLong();

            if (dni < 6 && dni > 8) {

                System.out.println("Número de dni incorrecto. Intente nuevamente.");

            }

        } while (dni < 6 && dni > 8);

        asignacion = Math.round(dni % 23);

        for (int i = 0; i < vectorLetra.length; i++) {

            letra = vectorLetra[asignacion];

        }

        N.setDni(dni);
        N.setLetra(letra);

        return N;

    }

    public void mostrar() {

        NIF N1 = crearNif();

        System.out.println(N1.getDni() + " - " + N1.getLetra());

    }

}
