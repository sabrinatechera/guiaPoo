//Una obra social tiene tres clases de socios:
//o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
//todos los tipos de tratamientos.
//o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
//los mismos tratamientos que los socios del tipo A.
//o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
//tratamientos.
//o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
//real que represente el costo del tratamiento (previo al descuento) y determine el
//importe en efectivo a pagar por dicho socio.
package ejercicios;

import java.util.Scanner;

public class ejerc5extra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        System.out.println(" ingrese una letra segun tipo de socio A, B, C");
        String letra = leer.nextLine();

        System.out.println(" valor del tratamiento");
        double costo = leer.nextInt();

        switch (letra) {
            case "A":
                System.out.println(" el valor del tratimiento es :" + (costo- (costo*0.5)) );
                break;
            case "B":
                System.out.println(" el valor del tratimiento es :" + (costo- (costo*0.35)) );

                break;
            case "C":
                System.out.println(" el valor del tratimiento es :" + costo);

                break;
      
        }

    }

}
