package service;

import entidad.Operacion;
import java.util.Scanner;

public class ServiceOperacion {

    public void crearOperacion(Operacion num1, Operacion num2) {
        Scanner leer = new Scanner(System.in);

        System.out.println(" ingrese num1");
        num1.setNum1(leer.nextInt());
        
        System.out.println(" ingrese num2");
        num2.setNum2(leer.nextInt());

    }

    public void sumar(Operacion num1, Operacion num2) {

        int sumar = num1.getNum1() + num2.getNum2();
        System.out.println(" la suma de los numeros dados es : " + sumar);

    }

    public void restar(Operacion num1, Operacion num2) {

        int restar = num1.getNum1() - num2.getNum2();
        System.out.println(" la resta de los numeros dados es : " + restar);

    }

    public void multiplicar(Operacion num1, Operacion num2) {
       
        if (num1.getNum1() == 0 || num2.getNum2() == 0) {
            System.out.println("es un error ya que el resultado es cero.");
           
        } else {
         int   multiplicar = num1.getNum1() * num2.getNum2();
            System.out.println("la division es : " + multiplicar);
        }
        
        
    }

    public void dividir(Operacion num1, Operacion num2) {
        
       if (num1.getNum1() == 0 || num2.getNum2() == 0) {
            System.out.println("es un error ya que el resultado es cero.");
           
        } else {
         int   dividir = num1.getNum1() / num2.getNum2();
         System.out.println("la division es : " + dividir);

        }
    }
    
    
    
}
