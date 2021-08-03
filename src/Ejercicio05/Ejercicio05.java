package Ejercicio05;

import Ejercicio05.entidades.Cuenta;
import Ejercicio05.servicios.ServicioCuenta;

/**
 *
 * @author d.andresperalta
 */
public class Ejercicio05 {

    public static void main(String[] args) {

        ServicioCuenta Sc1 = new ServicioCuenta();

        Cuenta C1 = Sc1.crearCuenta();

        Sc1.menu();

        switch (Sc1.respuesta(C1.getRespuesta())) {

            case 1:
                System.out.println("***DEPOSITO***");
                System.out.println("Disponible: " + " $" + Sc1.ingreso(C1.getSaldoActual()));
                break;

            case 2:
                System.out.println("***EXTRACCION***");
                System.out.println("Disponible: " + " $" + Sc1.egreso(C1.getSaldoActual()));
                break;

            case 3:
                System.out.println("***EXTRACCION RAPIDA.");
                System.out.println("Disponible: " + " $" + Sc1.extraccion(C1.getSaldoActual()));
                break;

            case 4:
                System.out.println("***SALDO DISPONIBLE***");
                System.out.println(" $" + Sc1.saldo(C1.getSaldoActual()));
                break;

            case 5:
                System.out.println("***DATOS***");
                System.out.println(Sc1.datos(C1.getCuenta(), C1.getDNI()));
                break;

        }

    }

}
