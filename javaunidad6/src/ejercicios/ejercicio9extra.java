//Simular la división usando solamente restas. Dados dos números enteros mayores que
//uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
//Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
//resultado es el residuo, y el número de restas realizadas es el cociente.
//Por ejemplo: 50 / 13:
//50 – 13 = 37 una resta realizada
//37 – 13 = 24 dos restas realizadas
//24 – 13 = 11 tres restas realizadas
//dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
//¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 
package ejercicios;

import java.util.Scanner;



public class ejercicio9extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        int cont=0;
        
        System.out.println("ingresar numero 1");
        num1 = leer.nextInt();
        System.out.println("ingrese numero 2");
        num2= leer.nextInt();
        
        while (num1>=num2) {

         num1=num1-num2;
         cont++;   
         
        }
        
        System.out.println("el cociente es : "+ cont +  " \n el resto es "+ num1);
        
    }

}
