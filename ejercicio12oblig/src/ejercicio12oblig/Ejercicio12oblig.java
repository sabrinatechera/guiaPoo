package ejercicio12oblig;

import entidad.Persona;
import java.util.Scanner;
import servicio.ServicePersona;

public class Ejercicio12oblig {

    public static void main(String[] args) {
 Scanner leer = new Scanner(System.in);
        Persona pers1 = new Persona();
        ServicePersona service = new ServicePersona();

        service.crearPersona(pers1);
        service.calcularEdad(pers1);
         service.mostrarPersona(pers1);
        System.out.println("ingrese la edad de otra persona");
        int edad2= leer.nextInt();

        System.out.println("la edad ingresada es menor?"+ service.menorQue(edad2, pers1));  
       
        System.out.println(pers1);
    }

}
