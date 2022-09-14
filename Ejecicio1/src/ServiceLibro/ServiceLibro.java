
package ServiceLibro;

import Entidad.Libro;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ServiceLibro {
    
   
    public void CargarLibro( Libro libro){// Libro con mayuscula es la clase y con minuscula hace referencia al objeto creado a la mail . 
    Scanner leer = new Scanner( System.in);
        System.out.println(" numero de isbn ");   
       libro.setISBN(leer.nextInt());
       leer.nextLine();
       System.out.println(" nombre de titulo ");   
       libro.setTítulo(leer.nextLine());
       System.out.println(" nombre de autor ");   
       libro.setAutor(leer.nextLine());
        System.out.println(" numero de pagina ");   
       
}
    
    
    public void MostrarLibro(Libro libro){
        
System.out.println("codigo es " + libro.getISBN()+ "  titulo es  "+ libro.getTítulo() + "  autor es   " + libro.getAutor()+ "   pagina es   "+  libro.getNúmPag());        
        
    }
    
    
    
}
