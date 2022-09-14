//Crea una aplicación que a través de una función nos convierta una cantidad de euros
//introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
//función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
//una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
//(void).
//El cambio de divisas es:
//* 0.86 libras es un 1 €
//* 1.28611 $ es un 1 €
//* 129.852 yenes es un 1 €
package ejercicios;

import java.util.Scanner;

public class ejercicio14 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String moneda="";
        double valor;
        int opcion;
        
        System.out.println(" ingrese la cantidad de euros a convertir en otra  moneda");
        valor = leer.nextDouble();
        
        System.out.println("1:libras,2:dolares,3 yenes");
        opcion = leer.nextInt();
        
        switch (opcion) {
            case 1:
                moneda = "libras";
                break;
            case 2:
                moneda = "dolares";
                break;
            case 3:
                moneda = "yenes";
                break;
            default:
                System.out.println("ingrese opcion correcta");
        }
       valorDeCambio(valor,moneda);
    }
    
    public static void valorDeCambio(double valor, String moneda) {
        switch (moneda) {
            case "libras":
                valor = valor*0.86;
                      
                break;
            case "dolares":
                valor = valor*1.28611;
                break;
            case "yenes":
                valor = valor*129.852;
                break;
            
                         
        }
        System.out.println("el valor de cambio es de :"+ valor);
    }
}
