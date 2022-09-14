///Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
////de n números (n>0). El valor de n se solicitará al principio del programa y los números
////serán introducidos por el usuario. Realice dos versiones del programa, una usando el
//////bucle “while” y otra con el bucle “do - while”.
////package ejercicios;
//
import java.util.Scanner;

public class ejerc7extra {
//
//    public static void main(String[] args) {
//
//        Scanner leer = new Scanner(System.in);
//        int valorMaximo = 0;
//        int valorMinimo = 0;
//        int contador = 1;
//        int suma = 0;
//
//        System.out.println("¿cuantos numeros va a cargar? ");
//        int num = leer.nextInt();
//
//        System.out.println("ingrese un valor ");
//        int valor = leer.nextInt();
//        valorMaximo = valor;
//        valorMinimo = valor;
//        suma = valor;
//        
//        while (contador < num) {
//
//            System.out.println("ingrese un valor ");
//            valor = leer.nextInt();
//            contador++;
//            suma += valor;
//            if (valor > valorMaximo) {
//                valorMaximo = valor;
//
//            } else if (valor < valorMinimo) {
//                valorMinimo = valor;
//            }
//        }
//
//        System.out.println(" el valor maximo es : " + valorMaximo);
//        System.out.println(" el valor minimo es : " + valorMinimo);
//        System.out.println(" el promedio de los valores es : " + (suma / num));
//
//    }
//
//}
//    public static void main(String[] args) {
//
//        Scanner leer = new Scanner(System.in);
//        int valorMaximo = 0;
//        int valorMinimo = 0;
//        int contador = 0;
//        int suma = 0;
//
//        System.out.println("¿cuantos numeros va a cargar? ");
//        int num = leer.nextInt();
//
//        
//        while (contador < num) {
//
//            System.out.println("ingrese un valor ");
//            valor = leer.nextInt();
//            if (contador == 0) {
//                valorMaximo = valor;
//                valorMinimo = valor;
//            }
//            contador++;
//            suma += valor;
//            if (valor > valorMaximo) {
//                valorMaximo = valor;
//
//            } else if (valor < valorMinimo) {
//                valorMinimo = valor;
//            }
//        }
//
//        System.out.println(" el valor maximo es : " + valorMaximo);
//        System.out.println(" el valor minimo es : " + valorMinimo);
//        System.out.println(" el promedio de los valores es : " + (suma / num));
//
//    }
//
//}



  public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int valorMaximo = 0;
        int valorMinimo = 0;
        int contador = 0;
        int suma = 0;

        System.out.println("¿cuantos numeros va a cargar? ");
        int num = leer.nextInt();

        
        do {

            System.out.println("ingrese un valor ");
           int valor = leer.nextInt();
            if (contador == 0) {
                valorMaximo = valor;
                valorMinimo = valor;
            }
            contador++;
            suma += valor;
            if (valor > valorMaximo) {
                valorMaximo = valor;

            } else if (valor < valorMinimo) {
                valorMinimo = valor;
            }
        }while (contador < num);

        System.out.println(" el valor maximo es : " + valorMaximo);
        System.out.println(" el valor minimo es : " + valorMinimo);
        System.out.println(" el promedio de los valores es : " + (suma / num));

    }

}