package entidad;

import java.util.Scanner;

public class Libros {

    private int ISBN;
    private String Título;
    private String Autor;
    private int NúmPag;

    public Libros() {

    }

    public Libros(int ISBN, String Título, String Autor, int NúmPag) {
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

    public void CrearLibro() {
        
        Scanner leer = new Scanner(System.in);
        System.out.println(" ingrese isbn");
        setISBN(leer.nextInt());
        System.out.println(" ingrese titulo");
        setTítulo(leer.next());
        System.out.println(" ingrese autor");
        setAutor(leer.next());
        System.out.println(" ingrese numero de pagina ");
        setNúmPag(leer.nextInt());
         
    }
    
//    public void InformarLibro(int Isbn, String titulo,String autor,int pagina){
//        
// System.out.println("codigo es "+ Libros.getISBN()+ "titulo es "+ Libros.getTítulo() + "autor es " + Libros.getAutor()+ "pagina es "+  Libros.getNúmPag());
//        
//    }
    
    
    

}
