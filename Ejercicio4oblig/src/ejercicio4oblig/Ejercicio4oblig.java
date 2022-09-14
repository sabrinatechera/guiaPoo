package ejercicio4oblig;

import Entidad.Rectangulo;
import serviceRectangulo.serviceRectangulo;

public class Ejercicio4oblig {

    public static void main(String[] args) {

        Rectangulo rect1 = new Rectangulo();

        serviceRectangulo service = new serviceRectangulo();

        service.crearRectangulo(rect1);
        service.superficie(rect1);
        service.perimetro(rect1);
        System.out.println("     ");
        service.dibujarRectangulo(rect1);

    }

}
