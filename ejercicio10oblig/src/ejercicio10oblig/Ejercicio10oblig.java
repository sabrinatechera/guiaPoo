package ejercicio10oblig;

import java.util.Arrays;

public class Ejercicio10oblig {

    public static void main(String[] args) {

        double[] arreglo1 = new double[50];
        double[] arreglo2 = new double[20];

        for (int i = 0; i < 50; i++) {

            arreglo1[i] = Math.random()*1000 + 1;

        }
        System.out.println("el vector ingresado es " + Arrays.toString(arreglo1));
         System.out.println("--------------------");
         
        Arrays.sort(arreglo1);

        System.out.println("el vector ordenado es " + Arrays.toString(arreglo1));

        System.arraycopy(arreglo1, 0, arreglo2, 0, 10);
        double var1 = 0.5;
        Arrays.fill(arreglo2, 10, 20, var1);

     
        System.out.println("--------------------");
        
        System.out.println(Arrays.toString(arreglo2));

    }

}
