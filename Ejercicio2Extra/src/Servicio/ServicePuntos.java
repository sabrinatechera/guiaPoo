
package Servicio;

import Entidad.Puntos;
import java.util.Scanner;


public class ServicePuntos {
    Scanner leer = new Scanner(System.in);
    
  public Puntos crearPuntos(){
      
      Puntos punto=new Puntos();
      
      System.out.println("ingrese el punto x1 e y1");
      punto.setX1(leer.nextInt());
      punto.setY1(leer.nextInt());
      System.out.println("ingrese el punto x2 e y2");
      punto.setX2(leer.nextInt());
      punto.setY2(leer.nextInt());
      
      return punto;
  }  
  

public double CalcularDistancia(Puntos punto){
    
    int x1= punto.getX1();
     int y1= punto.getY1();        
     int x2= punto.getX2();
     int y2= punto.getY2();
    double distancia;
        
    
    
    return  Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

    
    
    
}
  
    
  
  
  
  
  
  
  
  
  
}
