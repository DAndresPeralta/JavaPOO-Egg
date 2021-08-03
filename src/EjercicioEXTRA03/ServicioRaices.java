package EjercicioEXTRA03;

import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class ServicioRaices {

    private Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    public Raices crearObjeto() {

        Raices R = new Raices();

        System.out.println("Ingrese los valores de los términos de la ecucación de segundo grado: ");
        System.out.println();
        System.out.println("ax^2 + bx + c.");
        System.out.println();

        System.out.println("Ingrese el valor de a:");
        int a = Leer.nextInt();
        System.out.println("Ingrese el valor de b:");
        int b = Leer.nextInt();
        System.out.println("Ingrese el valor de c:");
        int c = Leer.nextInt();

        R.setA(a);
        R.setB(b);
        R.setC(c);

        return R;

    }

    public double getDiscriminante(Raices r) {

        double a = r.getA();
        double b = r.getB();
        double c = r.getC();
        double discriminante = (Math.pow(b, 2)) - (4 * a * c);

        return discriminante;

    }

    public boolean tieneRaices(Raices r) {

        return getDiscriminante(r) > 0;

    }

    public boolean tieneRaiz(Raices r) {

        return getDiscriminante(r) == 0;

    }

    public void obtenerRaices(Raices r) {

        double raizA = 0;
        double raizB = 0;

        double a = r.getA();
        double b = r.getB();
        double c = r.getC();

        double denominador1 = (Math.pow(b, 2));
        double denominador2 = (4 * a * c);
        double divisor = (2 * a);

        if (tieneRaices(r) == true) {

            raizA = ((-b + (Math.sqrt(denominador1 - denominador2))) / divisor);
            raizB = ((-b - (Math.sqrt(denominador1 - denominador2))) / divisor);

            System.out.println("La raíz a es: " + raizA);
            System.out.println("La raíz b es: " + raizB);

        } else if (tieneRaices(r) == false) {

        }
        {
            System.out.println("El discriminante es = 0 por lo que tiene una única raíz como solución.");

        }

    }

    public void obtenerRaiz(Raices r) {

        double raizA = 0;

        double a = r.getA();
        double b = r.getB();
        double c = r.getC();

        double denominador1 = (Math.pow(b, 2));
        double denominador2 = (4 * a * c);
        double divisor = (2 * a);

        if (tieneRaiz(r) == true) {

            raizA = ((-b + (Math.sqrt(denominador1 - denominador2))) / divisor);

            System.out.println("La raíz doble es: " + raizA);

        } else if (tieneRaiz(r) == false) {

            System.out.println("El discriminante es distinto de 0, por lo tanto tiene dos raices distintas.");

        }

    }

    public void calcular() {

        Raices R1 = crearObjeto();

        obtenerRaices(R1);

        obtenerRaiz(R1);

    }

}
