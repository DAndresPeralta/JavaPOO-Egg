package Ejercicio04;

/**
 *
 * @author d.andresperalta
 */
public class Ejercicio04 {

    public static void main(String[] args) {

        Rectangulo R1 = new Rectangulo();

        R1.CreaRectangulo();

        System.out.println("El perimetro del rectangulo es: " + R1.perimetro());

        System.out.println("La superficie del rectangulo es: " + R1.superficie());
        
        R1.DibujarRectangulo();

    }

}
