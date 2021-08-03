package EjercicioEXTRA02;

import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class ServicioPunto {

    private Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    public Punto crearPunto() {

        Punto P = new Punto();

        System.out.println("Ingrese las coordenadas del Punto 1: ");
        System.out.println();

        System.out.println("Ingrese la cordenada x1.");
        int x1 = Leer.nextInt();

        System.out.println("Ingrese la cordenada y1.");
        int y1 = Leer.nextInt();

        System.out.println("Ingrese las coordenadas del Punto 2: ");
        System.out.println();

        System.out.println("Ingrese la cordenada x2.");
        int x2 = Leer.nextInt();

        System.out.println("Ingrese la cordenada y2.");
        int y2 = Leer.nextInt();

        P.setX1(x1);
        P.setX2(x2);
        P.setY1(y1);
        P.setY2(y2);

        return P;

    }

    public double calcularDistancia(Punto p) {

        int x1 = p.getX1();
        int x2 = p.getX2();
        int y1 = p.getY1();
        int y2 = p.getY2();

        double r1 = (x2 - x1);
        double r2 = (y2 - y1);
        double p1 = Math.pow(r1, 2);
        double p2 = Math.pow(r2, 2);
        double sf = (p1 + p2);

//        return (Math.sqrt(Math.pow((x2 - x1), 2)) + Math.pow((y2 - y1), 2));
        return Math.sqrt(sf);

    }

    public void ejecucion() {

        Punto p1 = crearPunto();

        System.out.println("La distancia entre los puntos P1(" + p1.getX1() + ";" + p1.getY1() + ") y el punto P2(" + p1.getX2() + ";" + p1.getY2() + ") es : " + calcularDistancia(p1));

    }

}
