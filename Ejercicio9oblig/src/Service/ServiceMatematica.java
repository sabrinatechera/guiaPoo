package Service;

import Entidad.Matematica;
import java.util.Scanner;

public class ServiceMatematica {

    Scanner leer = new Scanner(System.in);

    public double devolverMayor(Matematica matematica) {

        double numMayor;

        if (matematica.getNum1() > matematica.getNum2()) {
            numMayor = matematica.getNum1();
        } else {
            numMayor = matematica.getNum2();
        }

        return numMayor;

    }

    public int calcularPotencia(Matematica matematica) {

       int numa=  (int) Math.round(Math.max(matematica.getNum1(), matematica.getNum2()));
       int numb = (int) Math.round(Math.min(matematica.getNum1(), matematica.getNum2()));
       int potencia;

     return potencia= (int) Math.pow(numa, numb);
     
         
    }

    
    public void calculaRaiz(Matematica matematica){
      
              
       double numb = Math.abs(Math.min(matematica.getNum1(), matematica.getNum2()));
       double raiz;

       raiz = Math.sqrt(numb);
        System.out.println(" la raiz es "+ raiz);
    }
    
    
    
}
