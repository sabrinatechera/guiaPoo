package ejercicios;

import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String frase;

        System.out.println("ingrese frase");
        frase = leer.nextLine();

        if ("eureka".equalsIgnoreCase(frase)) {
            System.out.println("es correcto");

        } else {
            System.out.println("es incorrecto");
        }

    }

}
