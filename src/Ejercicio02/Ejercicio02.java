package Ejercicio02;

/**
 *
 * @author d.andresperalta
 */
public class Ejercicio02 {

    public static void main(String[] args) {

        Circunferencia c1 = new Circunferencia(0);

        c1.pedirRadio();

        System.out.println("El area de la circunferencia es: " + c1.area(0));

        System.out.println("El perimetro de la circunferencia es: " + c1.perimetro(0));

    }

}
