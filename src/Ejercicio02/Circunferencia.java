package Ejercicio02;

import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class Circunferencia {

    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void pedirRadio() {

        Scanner Leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el radio de la circunferencia.");
        radio = Leer.nextDouble();

    }

    public double area(double area) {

        return (Math.PI * Math.pow(radio, 2));

    }

    public double perimetro(double perimetro) {

        return (2 * Math.PI * radio);

    }

}
