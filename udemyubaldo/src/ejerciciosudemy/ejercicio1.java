/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosudemy;

import java.util.Scanner;

/**
 *
 * @author sabri
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
        int lado;
        int superficie;
        System.out.print("Ingrese el valor del lado del cuadrado:");
        lado=teclado.nextInt();
        superficie=lado * lado;
        System.out.print("La superficie del cuadrado es:");
        System.out.print(superficie);
    }
}