package Ejercicio03;

/**
 *
 * @author d.andresperalta
 */
public class Ejercicio03 {

    public static void main(String[] args) {

        int suma;
        int resta;
        int multiplicacion;
        double division;

        Operacion O1 = new Operacion();

        O1.crearOperacion();

        suma = O1.sumar();

        resta = O1.restar();

        multiplicacion = O1.multiplicar();

        division = O1.dividir();

        System.out.println("La suma de los valores es: " + suma);

        System.out.println("La resta de los valores es: " + resta);

        System.out.println("El producto de los valores es: " + multiplicacion);

        System.out.println("El cociente de los valores es: " + division);

    }

}
