package Ejercicio09;

import Ejercicio09.entidades.Matemática;
import Ejercicio09.servicio.ServiceMatemática;
import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class Ejercicio09 {

    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in).useDelimiter("\n");

        ServiceMatemática Sm1 = new ServiceMatemática();

        Matemática M1 = Sm1.crearObjeto();

        M1.setNum1(Math.random() * 10);
        M1.setNum2(Math.random() * 10);

        System.out.println(M1.getNum1() + " " + M1.getNum2());

        System.out.println("El mayor valor es: " + Sm1.devolverMayor(M1, M1.getNum1(), M1.getNum2()));

        System.out.println("La potencia de los valores es: " + Sm1.calcularPotencia(M1, M1.getNum1(), M1.getNum2()));
        
        System.out.println("La raíz cuadrada del número menor es: " + Sm1.calculaRaiz(M1, M1.getNum1(), M1.getNum2()));

    }

}
