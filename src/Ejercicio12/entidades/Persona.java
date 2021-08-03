package Ejercicio12.entidades;

import java.util.Date;

/**
 *
 * @author d.andresperalta
 */
public class Persona {

    private String nombre;
    private int dia;
    private int mes;
    private int anio;
    private Date fechaDeNacimiento;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int dia, int mes, int anio, Date fechaDeNacimiento) {
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Persona(String nombre, int dia, int mes, int anio) {
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public int getEdad() {
        return edad;
    }

}
