
package ServiceAño;

import Anio.Anio;
import java.util.Scanner;


public class ServiceAño {
    
   Scanner leer= new Scanner(System.in); 
   
   public Anio CrearAnio(){
       
       
        Anio anio= new Anio();
        String[] mesesaux = new String[]{"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

        anio.setMes(mesesaux);
        
        
        
        return anio;
   }
  
    
    
    
}
