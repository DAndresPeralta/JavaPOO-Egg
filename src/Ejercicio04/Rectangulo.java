package Ejercicio04;

import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class Rectangulo {

    Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public Rectangulo CreaRectangulo() {

        System.out.println("Ingrese la base del rectángulo.");
        base = Leer.nextInt();

        System.out.println("Ingrese la altura del rectángulo.");
        altura = Leer.nextInt();

        return new Rectangulo(base, altura);

    }

    public double perimetro() {

        return ((base + altura) * 2);

    }

    public double superficie() {

        return (base * altura);

    }

    public void DibujarRectangulo() {

        for (int i = 0; i < base; i++) {

            System.out.print(" *");

        }
        System.out.println("");

        for (int i = 0; i < altura - 1; i++) {

            System.out.print(" *");
            for (int j = 0; j < altura - 1; j++) {
                System.out.print("   ");

            }
            System.out.println(" *");

        }

        for (int i = 0; i < base; i++) {

            System.out.print(" *");

        }
        System.out.println("");
    }

}
