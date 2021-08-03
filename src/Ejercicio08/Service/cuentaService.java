package Ejercicio08.Service;

import Ejercicio08.entidades.Cadena;

/**
 *
 * @author d.andresperalta
 */
public class cuentaService {

    public Cadena crearCadena() {

        return new Cadena();

    }

    public int mostrarVocales(Cadena C1, String frase, int longitud) {

        int contador = 0;

        for (int i = 0; i < C1.getLongitud(); i++) {

            if (C1.getFrase().charAt(i) == 'a' || C1.getFrase().charAt(i) == 'e' || C1.getFrase().charAt(i) == 'i' || C1.getFrase().charAt(i) == 'o' || C1.getFrase().charAt(i) == 'u') {

                contador++;
            }

        }
        return contador;

    }

    public int vecesRepetidos(Cadena C1, String frase, int longitud, char letra) {

        int contador = 0;

        for (int i = 0; i < C1.getLongitud(); i++) {

            if (C1.getFrase().charAt(i) == C1.getLetra()) {
                contador++;

            }

        }
        return contador;

    }

    public void compararLongitud(Cadena C1, String frase, int longitud, String frase2) {

        if (C1.getLongitud() == C1.getFrase2().length()) {
            System.out.println("Ambas frases tienen la misma longitud.");

        } else if (C1.getLongitud() > C1.getFrase2().length()) {
            System.out.println("La primer frase es mayor que la segunda.");

        } else {
            System.out.println("La segunda frase es mayor que la primera.");
        }

    }

    public void unirFrases(Cadena C1, String frase, String frase2) {

        System.out.println(C1.getFrase() + " " + C1.getFrase2());

    }

    public void reemplazar(Cadena C1, String frase, char letra) {

        System.out.println(C1.getFrase().replace('a', C1.getLetra()));

    }

    public boolean contiene(Cadena C1, String frase, char letra) {

        boolean resp = false;

        for (int i = 0; i < C1.getFrase().length(); i++) {

            if (C1.getFrase().charAt(i) == C1.getLetra()) {
                resp = true;
            } else {
                resp = false;
            }

        }
        return resp;
    } /*No funciona este inciso*/

    public void invertirFrase(Cadena C1, String frase) {

        char aux;
        String resp = "";

        for (int i = C1.getFrase().length() - 1; i >= 0; i--) {

            aux = C1.getFrase().charAt(i);
            resp = resp + aux;

        }
        System.out.println(resp);

    }

}
