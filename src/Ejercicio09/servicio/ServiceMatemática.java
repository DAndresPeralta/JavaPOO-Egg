package Ejercicio09.servicio;

import Ejercicio09.entidades.Matemática;

/**
 *
 * @author d.andresperalta
 */
public class ServiceMatemática {

    public Matemática crearObjeto() {

        return new Matemática();
    }

    public double devolverMayor(Matemática M1, double num1, double num2) {

        double mayor = 0.0;

        mayor = Math.max(M1.getNum1(), M1.getNum2());

        return mayor;
    }

    public double calcularPotencia(Matemática M1, double num1, double num2) {

        double pot = 0.0;

        pot = Math.pow(Math.round(Math.max(M1.getNum1(), M1.getNum2())), Math.round(Math.min(M1.getNum1(), M1.getNum2())));

        return pot;
    }

    public double calculaRaiz(Matemática M1, double num1, double num2) {

        double raiz = 0.0;

        raiz = Math.sqrt(Math.abs(Math.min(M1.getNum1(), M1.getNum2())));

        return raiz;
    }

}
