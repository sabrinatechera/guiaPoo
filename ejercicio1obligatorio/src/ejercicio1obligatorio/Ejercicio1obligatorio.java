
package ejercicio1obligatorio;

import entidad.Libros;

public class Ejercicio1obligatorio {

 
    public static void main(String[] args) {
       
        Libros L1= new Libros();
        Libros L2 = new Libros(1223,  "caperucita", "Ocampo",18);
        
//    CrearLibro(L1);
   System.out.println("codigo es " + L2.getISBN()+ "  titulo es  "+ L2.getTítulo() + "  autor es   " + L2.getAutor()+ "   pagina es   "+  L2.getNúmPag());
    
    
    }
    
}
