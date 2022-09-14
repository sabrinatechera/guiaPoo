//Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
//de 2 dígitos, etcétera (hasta 5 dígitos).
package ejercicios;

import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;

public class ejercicio17obligatorio {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println(" ingrese el tamaño n ");
        int n = leer.nextInt();
        int[] vector = new int[n];

        for (int i = 0; i < 10; i++) {

            vector[i] = aleatorio.nextInt(500) + 1;
             System.out.print(vector[i] + "/");
        }

        
        System.out.println("");
        
        for (int i = 0; i < n; i++) {
             System.out.println("El número dentro de la posicion " + i + " tiene " + Integer.toString(vector[i]).length() + " dígitos");
//            if (vector[i] > 0 && vector[i] < 10) {
//                
//                System.out.println("la posicion " + i + " tiene 1 digito");
//            } else if (vector[i] >= 10 && (vector[i] < 100)) {
//                System.out.println("la posicion " + i + " tiene 2 digitos");
//            } else if (vector[i] >= 100 && (vector[i] < 1000)) {
//                System.out.println("la posicion " + i + " tiene 3 digitos");
//            } else if (vector[i] >= 1000 && (vector[i] < 10000)) {
//                System.out.println("la posicion " + i + " tiene 4 digitos");
//            } else {
//                System.out.println("la posicion " + i + " tiene 5 digitos");
//
//            }

        }
    }
}

    
