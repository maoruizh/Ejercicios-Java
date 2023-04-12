package Taller_Avanzado.Ejercicio_Cajero;

import java.util.Scanner;

public class MainCuenta {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int option = 0;
        boolean continuar = true;

        Cuenta cuenta1 = new Cuenta("Pedro");

        do {
            System.out.println("\nMENU");
            System.out.println("1 (Ingresar)");
            System.out.println("2 (Retirar)");
            System.out.println("3 (Salir)");
            System.out.println("Seleccione una opción");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Tu saldo actual es: "+cuenta1.getCantidad());
                    System.out.println("Digite la cantidad que deseas ingresar: ");
                    double cantidadIngresar = scanner.nextDouble();
                    cuenta1.ingresar(cantidadIngresar);
                    System.out.println(cuenta1.toString());
                    break;
                case 2:
                    System.out.println("Tu nuevo saldo es: "+cuenta1.getCantidad());
                    if(cuenta1.getCantidad() == 0){
                        System.out.println("No tienes saldo para retirar");
                        break;
                    }
                    System.out.println("Digita la cantidad que deseas retirar: ");
                    double cantidadRetirar = scanner.nextDouble();
                    cuenta1.retirar(cantidadRetirar);
                    System.out.println(cuenta1.toString());
                    break;
                case 3:
                    continuar = false;
                    System.out.println("Bancolombia le pone el alma, hasta luego.");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (continuar);

        //Cuenta cuenta1 = new Cuenta("Juan Felipe", 5000);
        //Cuenta cuenta2 = new Cuenta("Javier", 1000);

    }
}
