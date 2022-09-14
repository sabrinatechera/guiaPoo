
package serviceRectangulo;

import Entidad.Rectangulo;
import java.util.Scanner;

public class serviceRectangulo {
    
    public void crearRectangulo(Rectangulo rectangulo){
        Scanner leer = new Scanner ( System.in);
        
        System.out.println(" ingrese base");
        rectangulo.setBase(leer.nextDouble());
        System.out.println(" ingrese altura");
        rectangulo.setAltura(leer.nextDouble());
        
    }
    
    public void superficie(Rectangulo rectangulo){
        
      double superficie = rectangulo.getBase() * rectangulo.getAltura();
        System.out.println(" la superficie del rectangulo es :"+ superficie);
        
    }
    
     public void perimetro(Rectangulo rectangulo){
        
      double perimetro = (rectangulo.getBase() + rectangulo.getAltura())*2;
      
        System.out.println(" el perimetro del rectangulo es :"+ perimetro);
        
    }
     
     public void dibujarRectangulo(Rectangulo rectangulo){
         
         for (int i = 0; i < rectangulo.getAltura(); i++) {
             for (int j = 0; j < rectangulo.getBase(); j++) {
               
                 if(i==0 || i== (rectangulo.getAltura()-1) ||  j==0 || j==(rectangulo.getBase()-1)){
                     System.out.print(" * ");
                    
                 }else{
                     System.out.print("   ");
                 }
                 
              }
             System.out.println(" ");
         }
       
     }
}
