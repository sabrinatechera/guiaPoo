//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
//pantalla.
package ejercicios;

import java.util.Scanner;


public class ejercicio1 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
       System.out.println("ingrese su nombre");
    String nombre= leer.nextLine();
        System.out.println(nombre); // de esta manera me muestra lo que tengo dentro de la variable nombre minetras la que sigue muestra el nombre de la variable y tambien lo que dice dentro
        System.out.println("nombre = " + nombre);
        
    }
    
}
