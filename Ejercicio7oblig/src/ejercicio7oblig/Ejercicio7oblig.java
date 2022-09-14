package ejercicio7oblig;

import entidad.Persona;
import java.util.Scanner;
import servicePersona.ServicePersona;

public class Ejercicio7oblig {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Persona pers1 = new Persona();
        Persona pers2 = new Persona();
        Persona pers3 = new Persona();
        Persona pers4 = new Persona();

        int bajoPeso = 0;
        int pesoIdeal = 0;
        int sobrePeso = 0;
        int mayorEdad = 0;

        ServicePersona service = new ServicePersona();

        service.crearPersona(pers1);
        service.calcularIMC(pers1);
        System.out.println(" ¿es mayor de edad ? " + service.mayorEdad(pers1));

        switch (service.calcularIMC(pers1)) {
            case -1:
                bajoPeso++;
                break;
            case 0:
                pesoIdeal++;
                break;
            default:
                sobrePeso++;
                break;
        }
        if (true == service.mayorEdad(pers1)) {
            mayorEdad++;
        }

        service.crearPersona(pers2);
        service.calcularIMC(pers2);
        System.out.println(" ¿es mayor de edad ? " + service.mayorEdad(pers2));
        if (service.calcularIMC(pers2) == -1) {
            bajoPeso++;
        } else if (service.calcularIMC(pers2) == 0) {
            pesoIdeal++;
        } else {
            sobrePeso++;
        }
        if (true == service.mayorEdad(pers2)) {
            mayorEdad++;
        }

        service.crearPersona(pers3);
        service.calcularIMC(pers3);
        System.out.println(" ¿es mayor de edad ? " + service.mayorEdad(pers3));
        switch (service.calcularIMC(pers3)) {
            case -1:
                bajoPeso++;
                break;
            case 0:
                pesoIdeal++;
                break;
            default:
                sobrePeso++;
                break;
        }
        if (true == service.mayorEdad(pers3)) {
            mayorEdad++;
        }
        service.crearPersona(pers4);
        service.calcularIMC(pers4);
        System.out.println(" ¿es mayor de edad ? " + service.mayorEdad(pers4));
        switch (service.calcularIMC(pers4)) {
            case -1:
                bajoPeso++;
                break;
            case 0:
                pesoIdeal++;
                break;
            default:
                sobrePeso++;
                break;
        }
        if (true == service.mayorEdad(pers4)) {
            mayorEdad++;
        }
        //Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
//distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
//cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
//también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.

        System.out.println("el promedio de las personas con bajo peso son " + ((bajoPeso *100)/ 4)+ "%");
        System.out.println("el promedio de las personas peso ideal son " + ((pesoIdeal *100)/ 4)+ "%");
        System.out.println("el promedio de las personas con sobrepeso son " + ((sobrePeso *100)/ 4)+ "%");
        System.out.println("el promedio de las edad " + (mayorEdad *100)/ 4);

    }

}
