//Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
//una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
//tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
//iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
package ejercicios;

import java.util.Scanner;

public class ejer2extra {

    public static void main(String[] args) {
      
        int A = 2;
        int B = 4;
        int C = 6;
        int D = 8; 
        
        System.out.println(" los valores de las variables son a=" + A + "- b:" + B  + " -c:"+ C + " -d:" + D );
     
          int Aux = A;
          A = D;
          D = B;
          B = C;
          C = Aux;
           
  
System.out.println(" los valores de las variables son a=" + A + "- b:" + B  + "- c:"+ C + "- d:" + D );
    }
    
}
