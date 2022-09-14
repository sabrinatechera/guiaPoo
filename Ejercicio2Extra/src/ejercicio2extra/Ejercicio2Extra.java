
package ejercicio2extra;

import Entidad.Puntos;
import Servicio.ServicePuntos;

public class Ejercicio2Extra {

    
    public static void main(String[] args) {

      ServicePuntos servicio = new ServicePuntos();
      
      Puntos punto1 = servicio.crearPuntos();
      
        System.out.println(punto1);
       
        System.out.println("la distancia entre los puntos es "+ servicio.CalcularDistancia(punto1)) ;

    }
    
}
