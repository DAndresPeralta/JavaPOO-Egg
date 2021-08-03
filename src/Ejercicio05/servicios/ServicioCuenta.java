package Ejercicio05.servicios;

import Ejercicio05.entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class ServicioCuenta {

    private Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    public void menu() {

        System.out.println("BIENVENIDO \n"
                + "------------MENU---------------\n"
                + "Ingrese la opción deseada.\n"
                + "1: Deposito.\n"
                + "2: Extracción.\n"
                + "3: Extracción Rápida.\n"
                + "4: Consulta de Saldo.\n"
                + "5: Consulta de Datos.");

    }

    public int respuesta(int respuesta) {
        System.out.println("");
        System.out.println("Ingrese una opción correcta.");
        do {
            respuesta = Leer.nextInt();
            if (respuesta > 5 || respuesta < 1) {
                System.out.println("Opción inválida. Intenten nuevamente.");

            }

        } while (respuesta > 5 || respuesta < 1);
        return respuesta;
    }

    public Cuenta crearCuenta() {

        System.out.println("***BIENVENIDO A EGGBANK***");
        System.out.println("");

        System.out.println("Ingrese su número de cuenta.");
        int cuenta = Leer.nextInt();

        System.out.println("Ingrese su número de documento");
        long DNI = Leer.nextLong();

        System.out.println("Ingrese su saldo actual.");
        double saldoActual = Leer.nextDouble();

        return new Cuenta(cuenta, DNI, saldoActual);

    }

    public double ingreso(double saldoActual) {

        System.out.println("Ingrese el monto a depositar.");
        double ingreso = Leer.nextDouble();

        System.out.println("Transacción exitosa.");

        return (ingreso + saldoActual);

    }

    public double egreso(double saldoActual) {

        System.out.println("Ingrese el monto a retirar.");
        double egreso = Leer.nextDouble();

        System.out.println("Transacción exitosa.");

        if (saldoActual < egreso) {

            return 0;

        } else {
            return (saldoActual - egreso);
        }

    }

    public double extraccion(double saldoActual) {

        double monto;

        do {
            System.out.println("Ingrese el monto a retirar.");
            monto = Leer.nextDouble();

            if (monto > (saldoActual * 0.2)) {
                System.out.println("Excede el límite de extracción. Intente nuevamente.");

            } else {
                System.out.println("Transacción exitosa.");
            }

        } while (monto > (saldoActual * 0.2));

        return (saldoActual - monto);

    }

    public double saldo(double saldoActual) {

        return saldoActual;

    }

    public String datos(int DNI, long cuenta) {

        return (" N° Cuenta= " + cuenta + ", DNI= " + DNI);

    }

}
