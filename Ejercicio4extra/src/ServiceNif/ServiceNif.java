
package ServiceNif;

import EntidadNif.Nif;
import java.util.Scanner;


public class ServiceNif {
    
    Scanner leer = new Scanner(System.in);
    
    public Nif CrearNif(){
      
        Nif nif = new Nif();
        
        
        System.out.println(" ingrese el dni ");
        nif.setDni(leer.nextLong());
        
       int posicion = (int) (nif.getDni()%23);
        System.out.println("el resto es "+ posicion);
        String[] letras = new String[]{"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
           
    nif.setLetra(letras[posicion]);
       
    return nif;
            
    }

    public void MostrarNif( Nif nif){
        
        System.out.println(" el nif es : "+ nif.getDni()+ "-"+ nif.getLetra());
    
        
    }
    
    
    
    
    
    
}
