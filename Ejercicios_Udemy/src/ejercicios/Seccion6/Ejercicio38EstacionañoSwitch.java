package ejercicios.Seccion6;

import java.util.Scanner;

public class Ejercicio38EstacionañoSwitch {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String estacion;

        System.out.println("Escribe el número del mes del año");
        int mes = Integer.parseInt(entrada.nextLine());

        switch (mes){
            case 1: case 2: case 12:
                estacion = "Invierno";
                break;

            case 3: case 4: case 5:
                estacion = "Primavera";
                break;

            case 6: case 7: case 8:
                estacion = "Verano";
                break;

            case 9: case 10: case 11:
                estacion = "Otoño";
                break;

            default:
                estacion = "Mes incorrecto";
        }

        System.out.println("estacion = " + estacion);
    }
}
