//Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
//Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.

package ejercicios;

import java.util.Scanner;


public class ejerc3extra {

   
    public static void main(String[] args) {
       
        Scanner leer= new Scanner(System.in);
        
        System.out.println(" ingrese una letra");
        String letra = leer.nextLine();
        
        if (letra.equalsIgnoreCase("a")|| letra.equalsIgnoreCase("e")||letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")||letra.equalsIgnoreCase("u") ){
         System.out.println("es una vocal");
        } else {
            System.out.println("no es una vocal");
        }
        
        
        
    }
    
}
