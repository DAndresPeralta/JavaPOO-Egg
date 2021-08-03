package Ejercicio01Private;

import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class Ejercicio01Private {

    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in).useDelimiter("\n");

        Libro L1 = new Libro(0, "", 0, "");

        System.out.println("Ingrese el ISBN.");
        L1.setISBN(Leer.nextLong());

        System.out.println("Ingrese el nombre del autor.");
        L1.setAutor(Leer.next());

        System.out.println("Ingrese la cantidad de paginas del libro.");
        L1.setPag(Leer.nextInt());

        System.out.println("Ingrese el título del libro.");
        L1.setTitulo(Leer.next());

        System.out.println("El ISBN del libro es: " + L1.getISBN());

        System.out.println("Escrito por: " + L1.getAutor());

        System.out.println("Tiene " + L1.getPag() + " páginas.");

        System.out.println("El libro se llama: " + L1.getTitulo());

        System.out.println("-----------------------------------------------");

        System.out.println(L1);

    }

}
