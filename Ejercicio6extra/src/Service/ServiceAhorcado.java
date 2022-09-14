package Service;

import Entidad.Ahorcado;
import java.util.Scanner;

public class ServiceAhorcado {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearJuego(Ahorcado ahorcado) {

        System.out.println("ingrese una palabra");
        String palabra = leer.next();

        System.out.println("ingrese una cantidad de jugadas maximas");
        ahorcado.setIntentos(leer.nextInt());
        ahorcado.setEncontradas(0);

        String[] buscar = new String[palabra.length()];
        String[] frase = new String[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {

            buscar[i] = palabra.substring(i, i + 1);
            frase[i] = "-";
        }

        ahorcado.setBuscar(buscar);
        ahorcado.setErrados(0);
        ahorcado.setEncontradas(0);

    }

    public void longitud(Ahorcado ahorcado) {

        System.out.println("la longitud de la palabra es " + ahorcado.getBuscar().length);

    }

    public void buscarletra(Ahorcado ahorcado) {
        System.out.println(" ingrese una letra a buscar en la palabra");
        String letra1 = leer.next();
        boolean encontrado = false;
        for (int i = 0; i < ahorcado.getBuscar().length; i++) {

            if (letra1.equalsIgnoreCase(ahorcado.getBuscar()[i])) {
                ahorcado.setEncontradas(ahorcado.getEncontradas() + 1);
                System.out.println("la letra ingresa pertenece a la palabra");
                encontrado = true;
                System.out.println(" numero de letras(encontradas, faltantes): "
                        + ahorcado.getEncontradas() + " , " + (ahorcado.getBuscar().length - ahorcado.getEncontradas()));
                System.out.println(" el numero de oportunidades restantes es : " + (ahorcado.getIntentos() - ahorcado.getErrados()));
            }

        }
        if (encontrado == false) {
            ahorcado.setErrados(ahorcado.getErrados() + 1);
            System.out.println(" numero de letras(encontradas, faltantes): "
                    + ahorcado.getEncontradas() + " , " + (ahorcado.getBuscar().length - ahorcado.getEncontradas()));
            System.out.println(" la letra ingresada no pertenece a la palabra");
            System.out.println(" el numero de oportunidades restantes es : " + (ahorcado.getIntentos() - ahorcado.getErrados()));
        }

    }

    public void juego(Ahorcado ahorcado) {
             crearJuego(ahorcado);
        do {
           
            longitud(ahorcado);
            buscarletra(ahorcado);
        } while (ahorcado.getErrados() < ahorcado.getIntentos() && ahorcado.getEncontradas() < ahorcado.getBuscar().length);

        if (ahorcado.getErrados() == ahorcado.getIntentos()) {

            System.out.println("Lo sentimos, no hay más oportunidades");
        } else {
            System.out.println(" usted ha descubierto la palabra");
        }
    }

}
