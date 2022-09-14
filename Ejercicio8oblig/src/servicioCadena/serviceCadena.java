package servicioCadena;

import Entidad.Cadena;
import java.util.Scanner;

public class serviceCadena {

//    Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
//ingresada.
    Scanner leer = new Scanner(System.in);

    public void mostrarVocales(Cadena frase) {
        int cont = 0;
        String f1 = frase.getFrase().toLowerCase();
        int l1 = frase.getLongit();

        for (int i = 0; i < l1; i++) {

            switch (f1.substring(i, i + 1)) {
                case "a":
                    cont++;
                    break;
                case "e":
                    cont++;
                    break;
                case "i":
                    cont++;
                    break;
                case "o":
                    cont++;
                    break;
                case "u":
                    cont++;
                    break;

            }

        }
        System.out.println(" la cantidad de vocales que tiene la frase es de :" + cont);

    }

    public void invertirFrase(Cadena frase) {
        String f1 = frase.getFrase().toLowerCase();
        int l1 = frase.getLongit();

        System.out.println(" la frase invertida es :");
        for (int i = l1 - 1; i >= 0; i--) {

            System.out.print(f1.substring(i, i + 1));

        }
        // esta es otra opcion que recorre la frase y va concatenando cada caracter , lo guarda en una variable y luego la imprime . 
//String f2="";
//        for (int i = l1-1; i >= 0; i--) {
//            
//            f2+=f1.substring(i, i+1);
//        }
//        System.out.println(f2);
        System.out.println(" ");
    }

    public void vecesRepetido(Cadena frase) {

        System.out.println(" ingrese una letra a buscar en la frase ");
        String letra = leer.nextLine();
        String f1 = frase.getFrase().toLowerCase();
        int l1 = frase.getLongit();
        int cont=0;
        for (int i = 0; i < l1; i++) {

            if(f1.substring(i, i+1).equals(letra)){
                cont++;
            }
        }
        System.out.println(" la cantidad de veces que se repite la letra es : "+ cont);
    }

    public boolean  compararLongitud( Cadena frase){
        
        int l1 = frase.getLongit();
        System.out.println(" ingrese una nueva frase");
        String f2= leer.nextLine();
        int l2;
        l2 = f2.length();
        
        
        return (l1==l2);
        
    }
    
    public void unirFrases(Cadena frase){
        
        String f1 = frase.getFrase().toLowerCase(); 
        
        System.out.println(" ingrese una frase para que sea concatenada a la anterior ");
        String f2= leer.nextLine();
        
        System.out.println(" la frase concatenada es "+ f1+" "+ f2);
    }
    
    public void reemplazarletra(Cadena frase){
        
        String f1 = frase.getFrase().toLowerCase();
        int l1 = frase.getLongit();
        
        
        System.out.println(" ingrese un caracter de reemplazo por la letra A");
        String carac1= leer.nextLine();

        for (int i = 0; i < l1; i++) {
     
             System.out.print(f1.substring(i, i+1).replace("a", carac1));   
   
        }
        System.out.println(" " );
       
   }

   
    
    
    
}
