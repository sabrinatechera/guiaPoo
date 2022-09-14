//Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
//0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
//Ejemplo:
//0-0-0
//0-0-1
//0-0-2
//0-0-E
//0-0-4
//0-1-2
//0-1-E
//Nota: investigar función equals() y como convertir números a String.
package ejercicios;

public class ejercicio12extra {

    public static void main(String[] args) {
        int num;
        String letra = "";

        for (int i = 0; i < 1000; i++) {

            if (i < 10) {
                letra = "00" + i;
            } else if (i < 100) {
                letra = "0" + i;
            } else {
                letra = "" + i;
            }
            
           String letra2= letra.replace("3", "E");
           System.out.println(letra2);
        }
        
        
 
    }

}
