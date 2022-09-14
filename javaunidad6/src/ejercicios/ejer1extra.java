//Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
//usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
package ejercicios;

import java.util.Scanner;

public class ejer1extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println(" ingrese tiempo en minutos para calcular dias y horas");
        int minutos = leer.nextInt();
        
        double dias = Math.round(minutos/1440);
        double horas = ((minutos/60)- (dias*24))- ((minutos/60)%1);
        double horas2= Math.round(horas);
        System.out.println(" los dias son " + dias + " y las horas son "+ horas2);

    }

}
