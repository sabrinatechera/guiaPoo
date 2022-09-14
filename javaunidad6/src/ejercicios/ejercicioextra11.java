//Escribir un programa que lea un número entero y devuelva el número de dígitos que
//componen ese número. Por ejemplo, si introducimos el número 12345, el programa
//deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
//de división. Nota: recordar que las variables de tipo entero truncan los números o
//resultados.
package ejercicios;

import java.util.Scanner;

public class ejercicioextra11 {

    public static void main(String[] args) {
        int num1, cont=0;
        Scanner leer = new Scanner(System.in);
        System.out.println(" escribir un numero ");
        num1 = leer.nextInt();
        
        while (num1 != 0){
            num1 = num1/10;
            cont++;
        }
        
        System.out.println(" los digitos que componen al numero es : " + cont);
    }
    
}
