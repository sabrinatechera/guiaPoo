package ejercicio5oblig;

import entidad.Cuenta;
import serviceCuenta.ServiceCuenta;

public class Ejercicio5oblig {

    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta();

        ServiceCuenta service = new ServiceCuenta();

        service.crearCuenta(cuenta1);
        service.Menu(cuenta1);

    }

}
