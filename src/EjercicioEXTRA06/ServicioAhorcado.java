package EjercicioEXTRA06;

import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class ServicioAhorcado {
    
    private Scanner Leer = new Scanner(System.in).useDelimiter("\n");
    
    public Ahorcado crearJuego() {
        
        Ahorcado J = new Ahorcado();
        
        String[] vectorPalabra;
        int contador = 0;
        
        System.out.println("Ingrese la palabra secreta.");
        String palabra = Leer.next();
        
        System.out.println("Ingrese la cantidad de intentos máximos.");
        int intentosMaximos = Leer.nextInt();
        
        vectorPalabra = new String[palabra.length()];
        
        for (int i = 0; i < palabra.length(); i++) {
            contador++;
            
            vectorPalabra[i] = palabra.substring(contador - 1, contador);
            
            J.setVectorPalabra(vectorPalabra);
            
        }
        
        J.setJugadaMaxima(intentosMaximos);
        J.setLetrasEncontradas(0);
        J.setLongitud(palabra.length());
        
        return J;
        
    }
    
    public void longitud(Ahorcado j) {
        
        System.out.println("La palabra tiene: " + j.getLongitud() + " letras.");
        
    }
    
    public void buscarLetra(Ahorcado j, String letra) {
        
        int contador = 0;
        
        for (int i = 0; i < j.getLongitud(); i++) {
            
            if (j.getVectorPalabra()[i].equals(letra)) {
                contador++;
                
            }
            
        }
        if (contador > 0) {
            System.out.println("La letra pertenece a la palabra.");
        } else {
            System.out.println("La letra no se encuentra en la palabra.");
        }
        
    }
    
    public boolean encontradas(Ahorcado j, String letra) {
        
        int contador = 0;
        boolean bandera;
        
        for (int i = 0; i < j.getLongitud(); i++) {
            
            if (j.getVectorPalabra()[i].equals(letra)) {
                contador++;
                
            }
            
        }
        
        bandera = contador > 0;
        
        return bandera;
        
    }
    
    public void intentos(Ahorcado j) {
        
        int intentos = j.getJugadaMaxima();
        
        j.setJugadaMaxima(intentos - 1);
        
        System.out.println("Número de oportunidades restantes: " + j.getJugadaMaxima());
        
    }
    
    public void mostrarPalabra(Ahorcado j) {
        
        for (int i = 0; i < j.getLongitud(); i++) {
            
            System.out.print(j.getVectorPalabra()[i]);
            
        }
        
    }
    
    public void juego() {
        
        String letra;
        int contadorEnc = 0;
        
        Ahorcado J1 = crearJuego();
        
        System.out.println("Pista.");
        longitud(J1);
        
        System.out.println();
        
        do {
            
            System.out.println("Ingrese una letra.");
            letra = Leer.next();
            
            System.out.println();
            
            buscarLetra(J1, letra);
            
            if (encontradas(J1, letra) == true) {
                contadorEnc++;
            }
            
            System.out.println("Número de letras (encontradas, faltantes): " + "(" + contadorEnc + ";" + (J1.getLongitud() - contadorEnc + ")"));
            
            intentos(J1);
            
            if (contadorEnc == J1.getLongitud()) {
                System.out.println();
                System.out.println("GANASTES.");
                System.out.print("La palabra es: ");
                mostrarPalabra(J1);
                System.out.println();
            }
            
            if (J1.getJugadaMaxima() >= 0) {
                System.out.println("Se han acabado los intentos.");
                System.out.println();
                
            }
            
        } while (J1.getJugadaMaxima() != 0 && contadorEnc != J1.getLongitud());
    }
    
}
