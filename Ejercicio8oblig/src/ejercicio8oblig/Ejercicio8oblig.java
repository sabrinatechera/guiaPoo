package ejercicio8oblig;

import Entidad.Cadena;
import java.util.Scanner;
import servicioCadena.serviceCadena;

public class Ejercicio8oblig {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cadena frase1 = new Cadena();

        System.out.println(" ingrese una frase");
         frase1.setFrase(leer.nextLine());
         frase1.setLongit(frase1.getFrase().length());
        
         
        serviceCadena service= new serviceCadena(); 
         
         service.mostrarVocales(frase1);
//         service.invertirFrase(frase1);
//         service.vecesRepetido(frase1);
//         System.out.println("¿las longitudes de las frases son iguales ?"+ service.compararLongitud(frase1));
//         System.out.println("  ");
//         service.unirFrases(frase1);
         service.reemplazarletra(frase1);
     }
    
   
   
    
    
    
    
    
    

}
