//Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
//debajo de 1.60 mts. y el promedio de estaturas en general.
package ejercicios;

import java.util.Scanner;

public class ejerc6extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese la cantidad de personas ");
        int cantidadPersonas = leer.nextInt();
        double alturaTotal = 0;
        double alturaBaja = 0;
        double altura;
        int contadorAltBajas = 0;

        for (int i = 0; i < cantidadPersonas; i++) {

            System.out.println(" ingrese la altura de " + (i+1));
            altura = leer.nextDouble();

            alturaTotal += altura;

            if (altura <= 1.60) {
                contadorAltBajas++;
                alturaBaja += altura;
            }

        }

        System.out.println("el promedio total de las alturas ingresadas es de " + (alturaTotal / cantidadPersonas));
        System.out.println(" el promedio de altura de baja estatura es de : " + (alturaBaja / contadorAltBajas));
    }

}
