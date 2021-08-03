package Ejercicio08;

import Ejercicio08.Service.cuentaService;
import Ejercicio08.entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class Ejercicio08 {

    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in).useDelimiter("\n");

        cuentaService Sc1 = new cuentaService();

        Cadena C1 = Sc1.crearCadena();

        System.out.println("Ingrese una frase");

        C1.setFrase(Leer.next());

        C1.setLongitud(C1.getFrase().length());

        System.out.println(Sc1.mostrarVocales(C1, C1.getFrase(), C1.getLongitud()));

        System.out.println("Ingrese una letra");

        C1.setLetra(Leer.next().charAt(0));

        System.out.println("El caracter se repite: " + Sc1.vecesRepetidos(C1, C1.getFrase(), C1.getLongitud(), C1.getLetra()) + " veces.");

        System.out.println("Ingrese una frase para comparar su longitud.");

        C1.setFrase2(Leer.next());

        Sc1.compararLongitud(C1, C1.getFrase(), C1.getLongitud(), C1.getFrase2());

        System.out.println("Ingrese una frase.");

        C1.setFrase2(Leer.next());

        Sc1.unirFrases(C1, C1.getFrase(), C1.getFrase2());

        System.out.println("Ingrese un caracter para suplantar por a.");

        C1.setLetra(Leer.next().charAt(0));

        Sc1.reemplazar(C1, C1.getFrase(), C1.getLetra());

        System.out.println("Ingrese una letra para saber si la frase la contiene.");

        C1.setLetra(Leer.next().charAt(0));

        if (Sc1.contiene(C1, C1.getFrase(), C1.getLetra()) == true) {
            System.out.println("La letra " + C1.getLetra() + " esta presente en la frase.");
        } else {
            System.out.println("La letra " + C1.getLetra() + " no esta presente.");
        }

        Sc1.invertirFrase(C1, C1.getFrase());

    }

}
