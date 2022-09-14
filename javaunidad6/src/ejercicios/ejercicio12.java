//Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
//dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
//fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
//X y el último tiene que ser una O.
//Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
//especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
//de FDE, que no respete el formato se considera incorrecta.
//Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
//incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
//siguientes funciones de Java Substring(), Length(), equals().
package ejercicios;

import java.util.Scanner;


public class ejercicio12 {

   
    public static void main(String[] args) {
        
        Scanner leer= new Scanner (System.in);
        String clave ;
        int longitud, contadorCorrecto, contadorIncorrecto;
       contadorCorrecto=0;
       contadorIncorrecto=0;
                
        do {
                
        System.out.println("ingrese un clave que comience con X y finalice con O");
        
        
       clave = leer.nextLine();
       
       
       if (clave.length()<=5 && clave.startsWith("X")&& clave.endsWith("O")){
           
           contadorCorrecto++;
           
       }else if ( clave.equalsIgnoreCase("&&&&&")){
           break;
                    
       }else{
           contadorIncorrecto++;
       }
        
        } while (!clave.equalsIgnoreCase("&&&&&"));
       
        System.out.println("la cantidad de claves correctas ingresadas es : "+ contadorCorrecto);
        System.out.println("la cantidad de claves correctas ingresadas es : "+ contadorIncorrecto);
        
    }
    
}
