package Ejercicio06.entidades;

/**
 *
 * @author d.andresperalta
 */
public class Cafetera {

    private double capacidadMaxima;
    private double capacidadActual;
    private double tazaVacia;
    private int respuesta;

    public Cafetera() {
    }

    public Cafetera(double capacidadMaxima, double capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }

    public Cafetera(double tazaVacia) {
        this.tazaVacia = tazaVacia;
    }

    public Cafetera(int respuesta) {
        this.respuesta = respuesta;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCapacidadActual(double capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public void setTazaVacia(double tazaVacia) {
        this.tazaVacia = tazaVacia;
    }

    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public double getCapacidadActual() {
        return capacidadActual;
    }

    public double getTazaVacia() {
        return tazaVacia;
    }

    public int getRespuesta() {
        return respuesta;
    }



}
