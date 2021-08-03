package Ejercicio05Reloaded;

/**
 *
 * @author d.andresperalta
 */
public class Cuenta {

    private String titular;
    private long dni;
    private double saldoActual;

    public Cuenta() {
    }

    public Cuenta(String titular, long dni, double saldoActual) {
        this.titular = titular;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public String getTitular() {
        return titular;
    }

    public long getDni() {
        return dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

}
