//Crear un programa que dado un numero determine si es par o impar.
package ejercicios;

import java.util.Scanner;


public class ejercicio6 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;

        System.out.println("ingrese numero");
        num1 = leer.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("el numero es par");

        } else {
            System.out.println("el numero es impar");

        }

    }

}
