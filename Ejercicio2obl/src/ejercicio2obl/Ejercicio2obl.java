package ejercicio2obl;

import Entidad.Circunferencia;
import java.io.PrintStream;
import service.ServiceCircun;

public class Ejercicio2obl {

    public static void main(String[] args) {

        Circunferencia cir1 = new Circunferencia();

        ServiceCircun service = new ServiceCircun();

        service.crearCircunferencia(cir1);
        
      
        service.perimetro(cir1);
        
        System.out.println(" ");

        service.area(cir1);
        
        System.out.println(" fin");

    }

}
