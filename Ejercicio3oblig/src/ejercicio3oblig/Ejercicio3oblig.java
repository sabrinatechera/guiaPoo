package ejercicio3oblig;

import entidad.Operacion;
import service.ServiceOperacion;

public class Ejercicio3oblig {

    public static void main(String[] args) {

        Operacion oper1 = new Operacion();

        ServiceOperacion service = new ServiceOperacion();

        service.crearOperacion(oper1, oper1);
        
        System.out.println("--------------");
        
        service.sumar(oper1, oper1);
        
        System.out.println("--------------");
       
        service.restar(oper1, oper1);
       
        System.out.println("--------------");
        
        service.multiplicar(oper1, oper1);
        
        System.out.println("--------------");
        
        service.dividir(oper1, oper1);

    }

}
