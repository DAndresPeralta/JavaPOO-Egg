package EjercicioEXTRA05;

import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class ServicioMes {

    private Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    private final String[] mesSecreto = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

    public Mes crearMesSecreto() {

        Mes M = new Mes();

        int numeroMes = (int) (Math.random() * 12);

        for (int i = numeroMes; i <= numeroMes; i++) {

            M.setMesSecreto(mesSecreto[i]);

        }

        M.setVectorMes(mesSecreto);

        return M;

    }

    public String adivinarMes(Mes m) {

        String mes;

        System.out.println("Ingrese un mes.");

        do {

            mes = Leer.next();
            mes = mes.toLowerCase();

            if (!"enero".equals(mes) && !"febrero".equals(mes) && !"marzo".equals(mes) && !"abril".equals(mes) && !"mayo".equals(mes) && !"junio".equals(mes) && !"julio".equals(mes) && !"agosto".equals(mes) && !"septiembre".equals(mes) && !"octubre".equals(mes) && !"noviembre".equals(mes) && !"diciembre".equals(mes)) {

                System.out.println("Mes inválido. Intente nuevamente.");

            }

        } while (!"enero".equals(mes) && !"febrero".equals(mes) && !"marzo".equals(mes) && !"abril".equals(mes) && !"mayo".equals(mes) && !"junio".equals(mes) && !"julio".equals(mes) && !"agosto".equals(mes) && !"septiembre".equals(mes) && !"octubre".equals(mes) && !"noviembre".equals(mes) && !"diciembre".equals(mes));

        return mes;

    }

    public void validarMes(Mes m) {

        String mesSecreto = m.getMesSecreto();

        while (!mesSecreto.equals(adivinarMes(m))) {

            System.out.println("INCORRECTO. INTENTE NUEVAMENTE.");

        }
        System.out.println("CORRECTO!");
    }

    public void ejecucion() {

        Mes M1 = crearMesSecreto();

        System.out.println("Bienvenido a Adivinar Mes.");
        System.out.println("***-------------------------***");

        validarMes(M1);

    }

}
