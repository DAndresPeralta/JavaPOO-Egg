package Ejercicio01Private;

/**
 *
 * @author d.andresperalta
 */
public class Libro {

    private long ISBN;
    private String autor;
    private int pag;
    private String titulo;

    public Libro() {
    }

    public Libro(long ISBN, String autor, int pag, String titulo) {
        this.ISBN = ISBN;
        this.autor = autor;
        this.pag = pag;
        this.titulo = titulo;
    }

    public void setISBN(long ISBN) {

        this.ISBN = ISBN;

    }

    public void setAutor(String autor) {

        this.autor = autor;

    }

    public void setPag(int pag) {

        this.pag = pag;
    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }

    public long getISBN() {
        return ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public int getPag() {
        return pag;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", autor=" + autor + ", pag=" + pag + ", titulo=" + titulo + '}';
    }
    

}
