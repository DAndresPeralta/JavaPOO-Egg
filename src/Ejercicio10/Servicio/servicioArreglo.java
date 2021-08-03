package Ejercicio10.Servicio;

import Ejercicio10.entidades.Arreglo;
import java.util.Arrays;

/**
 *
 * @author d.andresperalta
 */
public class servicioArreglo {

    public Arreglo crearArreglo() {

        double[] A = new double[50];
        double[] B = new double[20];

        for (int i = 0; i < A.length; i++) {
            A[i] = Math.random()*100;

        }

        return new Arreglo(A, B);

    }

    public void mostrarArreglo(Arreglo Array1, double[] A) {

        for (int i = 0; i < A.length; i++) {

            System.out.print("[ " + Math.round(A[i]) + " ]");

        }
        System.out.println();
    }

    public void ordenarArreglo(Arreglo Array1, double[] A, double[] B) {

        Arrays.sort(Array1.getA());

        for (int i = 0; i < Array1.getA().length; i++) {

            System.out.print("[ " + Math.round(A[i]) + " ]");

        }
        System.out.println();

    }

    public void llenarArregloB(Arreglo Array1, double[] A, double[] B) {

        for (int i = 0; i < Array1.getB().length; i++) {

            if (i <= 9) {

                B[i] = A[i];

            } else if (i >= 10) {

                B[i] = 0.5;

            }

        }

        for (int i = 0; i < Array1.getB().length; i++) {

            System.out.print("[ " + Math.round(B[i]) + " ]");

        }
        System.out.println();
    }

}
