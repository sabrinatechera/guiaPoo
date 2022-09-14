
package ejercicio4extra;

import EntidadNif.Nif;
import ServiceNif.ServiceNif;



public class Ejercicio4extra {

   
    public static void main(String[] args) {

        ServiceNif service = new ServiceNif();
     
        Nif nif1= service.CrearNif();
        
        service.MostrarNif(nif1);




    }
    
}
