
import java.util.Scanner;

//Escribir un programa que lea un número entero por teclado y muestre por pantalla el
//doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
//package /*ejercicios*/;
public class ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;

        System.out.println("ingrese un numero");
        num1 = leer.nextInt();

        System.out.println("la raiz cuadrada es " + Math.sqrt(num1));
        System.out.println("el doble del numero es " + (num1 * 2));
        System.out.println("el doble del numero es " + (num1 * 3));
    }

}
