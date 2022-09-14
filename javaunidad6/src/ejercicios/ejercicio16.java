//Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
//usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
//numero y si se encuentra repetido.

package ejercicios;

import java.util.Random;
import java.util.Scanner;


public class ejercicio16 {

       
    public static void main(String[] args) {
       
        Scanner leer= new Scanner(System.in);
        Random aleatorio= new Random();
        System.out.println(" tamaño del vector");
        int n= leer.nextInt();
        
        int[] vector= new int[n];
        
        for (int i = 0; i < n; i++) {
          
           vector[i] = aleatorio.nextInt(n)+1;
            
        }
        
        for (int i = 0; i < n; i++) {
            
            System.out.print( vector[i]+ "/");
                      
        }
        System.out.println("");  
 
        System.out.println("ingrese un numero a buscar");
        int num= leer.nextInt();
        
        for (int i = 0; i < n; i++) {
            
            if( vector[i]== num ){
                System.out.println("el numero ingresado se encuentra en la posicion " + i);
            }
             
            }
        }
        
    }
    

