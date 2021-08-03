package Ejercicio08.entidades;

/**
 *
 * @author d.andresperalta
 */
public class Cadena {

    private String frase;
    private int longitud;
    private char letra;
    private String frase2;

    public Cadena() {
    }

    public Cadena(String frase, int longitud, char letra, String frase2) {
        this.frase = frase;
        this.longitud = longitud;
        this.letra = letra;
        this.frase2 = frase2;
    }

    public String getFrase() {
        return frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public char getLetra() {
        return letra;
    }

    public String getFrase2() {
        return frase2;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public void setFrase2(String frase2) {
        this.frase2 = frase2;
    }

}
