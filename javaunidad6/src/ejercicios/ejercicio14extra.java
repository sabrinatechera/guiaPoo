//Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
//hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
//de hijos para averiguar la media de edad de los hijos de todas las familias.
package ejercicios;

import java.util.Scanner;

public class ejercicio14extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int familias;
        int hijos,edad=0, conthijos=0;

        System.out.println(" ingrese la cantidad de familias");
        familias = leer.nextInt();

        for (int i = 0; i < familias; i++) {

            System.out.println(" ingrese la cantidad de hijos de la familia "+(i+1));
            hijos = leer.nextInt();

            for (int j = 0; j < hijos; j++) {
                System.out.println(" ingrese la edad del hijo" + (j + 1));
                edad = edad + leer.nextInt();
                conthijos++;
            }

        }
        System.out.println(" el promedio de las edades de los hijos de las familias ingresadas es : " + (edad/conthijos));
    }

}
