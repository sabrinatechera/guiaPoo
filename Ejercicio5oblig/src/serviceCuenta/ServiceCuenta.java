package serviceCuenta;

import entidad.Cuenta;
import java.util.Scanner;

public class ServiceCuenta {

    public void crearCuenta(Cuenta numeroCuenta) {
        Scanner leer = new Scanner(System.in);

        System.out.println(" ingrese numero de cuenta ");
        numeroCuenta.setNumeroCuenta(leer.nextInt());
        System.out.println(" ingrese numero de dni ");
        numeroCuenta.setDni(leer.nextLong());
    }

    public int ingresarSaldo(Cuenta saldoActual) {
        Scanner leer = new Scanner(System.in);

        System.out.println(" ingrese saldo a depositar ");
        int ingreso = leer.nextInt();
        int suma = ingreso + saldoActual.getSaldoActual();
        saldoActual.setSaldoActual(suma);
        return suma;
    }

    public void retirarSaldo(Cuenta saldoActual) {
        Scanner leer = new Scanner(System.in);

        System.out.println(" ingrese saldo a retirar ");
        int extraccion = leer.nextInt();

        if (saldoActual.getSaldoActual() < extraccion) {
            saldoActual.setSaldoActual(0);
        } else {
            int resta = saldoActual.getSaldoActual() - extraccion;
            saldoActual.setSaldoActual(resta);
            System.out.println(" el saldo actual es " + saldoActual.getSaldoActual());
        }
    }

    public void extraccionRapida(Cuenta saldoActual) {
        Scanner leer = new Scanner(System.in);

        System.out.println(" ingrese saldo a retirar ene extraccion rapida ");
        int auxiliar = leer.nextInt();

        if (auxiliar > (saldoActual.getSaldoActual() * 0.2)) {
            System.out.println("usted solo puede sacar hasta el 20% de su saldo, un maximo de " + saldoActual.getSaldoActual() * 0.2);

        } else {
            int extraccion = saldoActual.getSaldoActual() - auxiliar;
            saldoActual.setSaldoActual(extraccion);

            System.out.println(" el saldo actual es " + extraccion);
        }

    }

    public void consultarSaldo(Cuenta saldoActual) {

        System.out.println("el Saldo de su cuenta es de:" + saldoActual.getSaldoActual());
    }

    public void consultarDatos(Cuenta saldoActual) {

        System.out.println("Sus datos son, NUMERO DE CUENTA:" + saldoActual.getNumeroCuenta() + " DNI :" + saldoActual.getDni() + " el saldo actual es :" + saldoActual.getSaldoActual());
    }

    public void Menu(Cuenta saldoActual) {

        Scanner leer = new Scanner(System.in);
        String aux = "";

        do {

            System.out.println(" ingrese una opcion 1(ingresar saldo),2(retirar saldo),3(extraccion rapida),4(consultar saldo), 5(consultar datos) o 6 (S/N si desea salir del sistema)");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    ingresarSaldo(saldoActual);
                    break;
                case 2:
                    retirarSaldo(saldoActual);
                    break;
                case 3:
                    extraccionRapida(saldoActual);
                    break;
                case 4:
                    consultarSaldo(saldoActual);
                    break;
                case 5:
                    consultarDatos(saldoActual);
                    break;
                case 6:
                    System.out.println(" desea salir s/n ");
                    aux = leer.nextLine();
                    break;
            }

        } while (!"s".equalsIgnoreCase(aux));

    }

}
