package EjercicioEXTRA01;

import EjercicioEXTRA01.entidades.Cancion;
import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class EjercicioExtra01 {

    public static void main(String[] args) {
        
        Scanner Leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el título de la cación.");
        String cancion =Leer.next();
        
        System.out.println("Ingrese el autor de la canción.");
        String autor = Leer.next();
                
        Cancion C1 = new Cancion(cancion, autor);
        
        
        
    }
    
}
