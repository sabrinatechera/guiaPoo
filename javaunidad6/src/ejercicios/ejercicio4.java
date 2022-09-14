//Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
//Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
package ejercicios;

import java.util.Scanner;

public class ejercicio4 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int grados;

        System.out.println("ingrese los grados");
        grados = leer.nextInt();
        System.out.println("los grados farenheit son :"+ (32 + (9 * grados / 5)));
        
        
        
        
        
        
    }
    
}
