//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
//números al usuario hasta que la suma de los números introducidos supere el límite inicial.
package ejercicios;

import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int limite, num;
        int acumulador = 0;

        System.out.println("ingrese valor limite");
        limite = leer.nextInt();

        while (acumulador <= limite) {
            System.out.println(" ingrese un numero");
            num = leer.nextInt();
            acumulador +=  num;
            
        }
        System.out.println(" la suma de los numeros ingresados es "+acumulador);
    }

}
