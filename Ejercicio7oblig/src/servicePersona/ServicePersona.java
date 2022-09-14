package servicePersona;

import entidad.Persona;
import java.util.Scanner;

public class ServicePersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    ;

    public void crearPersona(Persona persona) {
        System.out.println(" ingrese nombre");
        persona.setNombre(leer.next());
        System.out.println(" ingrese edad");
        persona.setEdad(leer.nextInt());

        do {
            System.out.println(" ingrese sexo, H:hombre, M:mujer, O:otro");
            persona.setSexo(leer.next());

        } while (!"H".equalsIgnoreCase(persona.getSexo()) && !"M".equalsIgnoreCase(persona.getSexo()) && !"O".equalsIgnoreCase(persona.getSexo()));

        System.out.println(" ingrese peso");
        persona.setPeso(leer.nextDouble());
        System.out.println(" ingrese altura");
        persona.setAltura(leer.nextDouble());
    }

    public int calcularIMC(Persona persona) {//clase y objeto

        double imc = persona.getPeso() / (Math.pow(persona.getAltura(), 2));

        int indice;

        if (imc < 20) {
            return -1;

        } else if (imc >= 20 && imc <= 25) {

            return 0;
        } else {
            return 1;

        }

    }

    public boolean mayorEdad(Persona persona) {
        return persona.getEdad() >= 18;
    }
}
