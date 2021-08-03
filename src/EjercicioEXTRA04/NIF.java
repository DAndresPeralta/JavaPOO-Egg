package EjercicioEXTRA04;

/**
 *
 * @author d.andresperalta
 */
public class NIF {

    private long dni;
    private Character letra;

    public NIF() {
    }

    public NIF(long dni, Character letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setLetra(Character letra) {
        this.letra = letra;
    }

    public long getDni() {
        return dni;
    }

    public Character getLetra() {
        return letra;
    }

}
