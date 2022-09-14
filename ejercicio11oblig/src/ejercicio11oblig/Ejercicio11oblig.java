package ejercicio11oblig;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ejercicio11oblig {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        

        System.out.println(" ingrese dia");
        int dia = leer.nextInt();

        System.out.println(" ingrese mes");
        int mes = leer.nextInt();

        System.out.println(" ingrese anio");

        int anio = leer.nextInt();
        
        LocalDate fecha =  LocalDate.of(anio,mes,dia);
        System.out.println(ChronoUnit.YEARS.between(fecha, LocalDate.now()));

        
        
    }

   
}
