package ejercicio9oblig;

import Entidad.Matematica;
import Service.ServiceMatematica;
import java.util.Scanner;

public class Ejercicio9oblig {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Matematica mat1 = new Matematica();

        mat1.setNum1(Math.random() * 10 + 1);

        mat1.setNum2(Math.random() * 10 + 1);

        System.out.println("num1   = " + mat1.getNum1());
        System.out.println("num2    =" + mat1.getNum2());

        ServiceMatematica service = new ServiceMatematica();
        
        System.out.println(" el numero mayor es " + service.devolverMayor(mat1)); 
        System.out.println(" la potencia es   "+ service.calcularPotencia(mat1));
        
        service.calculaRaiz(mat1);
    }

}
