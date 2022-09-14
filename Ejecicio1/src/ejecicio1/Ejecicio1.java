
package ejecicio1;

import Entidad.Libro;
import ServiceLibro.ServiceLibro;


public class Ejecicio1 {

    public static void main(String[] args) {

 Libro libro1= new Libro();
 
 // aca luego de crear el objeto instancio el servicio .
 
 ServiceLibro servicio= new ServiceLibro();
 
 servicio.CargarLibro(libro1);
 servicio.MostrarLibro(libro1);
 
 
 
    }
    
}
