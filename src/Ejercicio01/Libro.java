package Ejercicio01;

import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class Libro {

    Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    public long ISBN;
    public String autor;
    public int pag;
    public String titulo;

    public Libro() {
    }

    public Libro(long ISBN, String autor, int pag, String titulo) {
        this.ISBN = ISBN;
        this.autor = autor;
        this.pag = pag;
        this.titulo = titulo;
    }

    public void pedirDato() {

        System.out.println("Ingrese el título del libro.");
        titulo = Leer.next();

        System.out.println("Ingrese el nombre del autor.");
        autor = Leer.next();

        System.out.println("Ingrese la cantidad de paginas del libro.");
        pag = Leer.nextInt();

        System.out.println("Ingrese el ISBN.");
        ISBN = Leer.nextLong();

    }

    public void mostrarDato() {

        System.out.println("El título del libro es: " + titulo);

        System.out.println("Escrito por: " + autor);

        System.out.println("El libro tiene: " + pag + " páginas.");

        System.out.println("ISBN: " + ISBN);

    }

}
