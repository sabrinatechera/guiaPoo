
package service;

import Entidad.Circunferencia;
import java.util.Scanner;

public class ServiceCircun {
    
    public void crearCircunferencia(Circunferencia radio){
        Scanner leer = new Scanner (System.in);
        System.out.println(" ingrese el radio de la circunferencia");
        radio.setRadio(leer.nextDouble());
        
    }
    
    public void area (Circunferencia radio){
        
        double area = Math.PI *  radio.getRadio()* radio.getRadio();
        System.out.println(" el area es "+ area);
    }
    
    public void perimetro (Circunferencia radio){
        
        double perimetro = 2* Math.PI *  radio.getRadio();
        System.out.println(" el perimetro es "+ perimetro);
    }
    
    
}
