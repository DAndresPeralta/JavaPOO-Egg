package EjercicioEXTRA05;

/**
 *
 * @author d.andresperalta
 */
public class Mes {

    private String[] vectorMes;
    private String mesSecreto;

    public Mes() {
    }

    public Mes(String[] vectorMes, String mesSecreto) {
        this.vectorMes = vectorMes;
        this.mesSecreto = mesSecreto;
    }

    public void setVectorMes(String[] vectorMes) {
        this.vectorMes = vectorMes;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public String[] getVectorMes() {
        return vectorMes;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

}
