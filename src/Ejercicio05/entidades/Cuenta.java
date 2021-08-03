package Ejercicio05.entidades;

/**
 *
 * @author d.andresperalta
 */
public class Cuenta {

    private int cuenta;
    private long DNI;
    private double saldoActual;
    private double ingreso;
    private double egreso;
    private int respuesta;

    public Cuenta() {

    }

    public Cuenta(int respuesta) {
        this.respuesta = respuesta;
    }

    public Cuenta(int cuenta, long DNI, double saldoActual) {
        this.cuenta = cuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;

    }

    public Cuenta(double ingreso, double saldoActual) {
        this.ingreso = ingreso;
        this.saldoActual = saldoActual;
    }

    public Cuenta(double egreso) {
        this.egreso = egreso;
    }

    public void setCuenta(int cuenta, double saldoActual) {
        this.cuenta = cuenta;
        this.saldoActual = saldoActual;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setSaldoActual(long saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void setEgreso(double egreso) {
        this.egreso = egreso;
    }

    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }

    public int getCuenta() {
        return cuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public double getIngreso() {
        return ingreso;
    }

    public double getEgreso() {
        return egreso;
    }

    public int getRespuesta() {
        return respuesta;
    }

}
