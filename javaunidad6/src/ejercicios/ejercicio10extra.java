/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sabri
 */
public class ejercicio10extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int num1, num2, respuesta;
        double resultado;

        num1 = aleatorio.nextInt(10) + 1;
        num2 = aleatorio.nextInt(10) + 1;
        Scanner leer = new Scanner(System.in);
        
     
        
        do {

            System.out.println(" adivine el resultado de la multiplicacion ");
            respuesta = leer.nextInt();
            resultado = num1 * num2;

        }while(resultado!=respuesta);

    
    }

}
