package Ejercicio05Reloaded;

import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class cuentaServicio {

    private Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    private Cuenta crearCuenta() {

        Cuenta c = new Cuenta();

        System.out.println("Ingrese su nombre y apellido.");
        String nombre = Leer.next();

        System.out.println("Ingrese su DNI.");
        long documento = Leer.nextLong();

        System.out.println("Ingrese su saldo actual.");
        double saldo = Leer.nextDouble();

        c.setTitular(nombre);
        c.setDni(documento);
        c.setSaldoActual(saldo);

        return c;

    }

    private void mostraMenu() {

        System.out.println();

        System.out.println("Ingrese una opción:");
        System.out.println();
        System.out.println("1: Depósito.");
        System.out.println("2: Extracción.");
        System.out.println("3: Extracción Express.");
        System.out.println("4: Consulta Saldo.");
        System.out.println("5: Consulta Datos.");
        System.out.println("6: Salir.");

    }

    private int respuesta() {

        int respuesta = 0;

        do {

            respuesta = Leer.nextInt();

            if (respuesta < 1 || respuesta > 6) {

                System.out.println("Opción incorrecta. Intente nuevamente.");

            }

        } while (respuesta < 1 || respuesta > 6);

        return respuesta;

    }

    private void ingresar(Cuenta c, double saldoActual) {

        System.out.println("*** DEPOSITO ***");
        System.out.println();

        System.out.println("Ingrese el monto a depositar.");
        double depostito = Leer.nextDouble();

        c.setSaldoActual(saldoActual + depostito);

        System.out.println("Su saldo es: " + c.getSaldoActual());

    }

    private void retirar(Cuenta c, double saldoActual) {

        System.out.println("*** EXTRACCION ***");
        System.out.println();

        double retiro;

        do {

            System.out.println("Ingrese el monto a retirar.");
            retiro = Leer.nextDouble();

            if (saldoActual < retiro) {
                System.out.println("Fondos insuficientes.");
            }

        } while (saldoActual < retiro);

        c.setSaldoActual(saldoActual - retiro);

        System.out.println("Su saldo es: " + c.getSaldoActual());

    }

    private void retiroExpress(Cuenta c, double saldoActual) {

        System.out.println("*** RETIRO EXPRESS ***");
        System.out.println();

        double retiro = (c.getSaldoActual() * 0.2);
        double importe;

        do {

            System.out.println("Ingrese el importe a extraer.");
            importe = Leer.nextDouble();

            if (importe > retiro) {

                System.out.println("El importe supera el límite permitido. Intente nuevamente.");

            }

        } while (importe > retiro);

        c.setSaldoActual(saldoActual - importe);

        System.out.println("Su saldo es: " + c.getSaldoActual());

    }

    private void consultarSaldo(Cuenta c) {

        System.out.println("*** CONSULTA SALDO ***");
        System.out.println();

        System.out.println("Su saldo es: " + c.getSaldoActual());

    }

    private void consultarDatos(Cuenta c) {

        System.out.println("*** CONSULTA DATOS ***");
        System.out.println();

        System.out.println("Titular: " + c.getTitular() + "\n"
                + "DNI: " + c.getDni() + "\n"
                + "Fondos: " + c.getSaldoActual());

    }

    public void ejecutarMenu() {

        Cuenta c1 = crearCuenta();

        int sel = 0;

        System.out.println("BIENVENIDO A EGGBANK.");
        System.out.println();
        System.out.println("-------------------------------");

        do {

            mostraMenu();

            sel = respuesta();

            switch (sel) {

                case 1:

                    ingresar(c1, c1.getSaldoActual());
                    break;

                case 2:

                    retirar(c1, c1.getSaldoActual());
                    break;

                case 3:

                    retiroExpress(c1, c1.getSaldoActual());
                    break;

                case 4:

                    consultarSaldo(c1);
                    break;

                case 5:

                    consultarDatos(c1);
                    break;

                case 6:

                    System.out.println("*** MUCHAS GRACIAS POR OPERAR CON EGGBANK ***");
                    break;

            }

        } while (sel != 6);

    }

}
