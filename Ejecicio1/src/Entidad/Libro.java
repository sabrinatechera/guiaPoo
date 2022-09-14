
package Entidad;

public class Libro {
    
    private int ISBN;
    private String Título;
    private String Autor;
    private int NúmPag;

    public Libro() {
    }

    public Libro(int ISBN, String Título, String Autor, int NúmPag) {
        this.ISBN = ISBN;
        this.Título = Título;
        this.Autor = Autor;
        this.NúmPag = NúmPag;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTítulo() {
        return Título;
    }

    public void setTítulo(String Título) {
        this.Título = Título;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNúmPag() {
        return NúmPag;
    }

    public void setNúmPag(int NúmPag) {
        this.NúmPag = NúmPag;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", T\u00edtulo=" + Título + ", Autor=" + Autor + ", N\u00famPag=" + NúmPag + '}';
    }
    
    
    
}
