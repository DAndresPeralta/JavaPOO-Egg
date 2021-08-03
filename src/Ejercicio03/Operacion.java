package Ejercicio03;

import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class Operacion {

    Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    private int numero1;
    private int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void crearOperacion() {

        System.out.println("Ingrese el primer número.");
        numero1 = Leer.nextInt();

        System.out.println("Ingrese el segundo número.");
        numero2 = Leer.nextInt();

    }

    public int sumar() {

        return (numero1 + numero2);

    }

    public int restar() {

        return (numero1 - numero2);

    }

    public int multiplicar() {

        if (numero1 == 0 || numero2 == 0) {

            return 0;

        } else {
            return (numero1 * numero2);
        }

    }

    public double dividir() {

        if (numero2 == 0) {
            System.out.println("No se puede dividir por cero.");
            return 0;
        }

        if (numero1 == 0) {

            return 0;

        } else {
            return (numero1 / numero2);
        }

    }

}
