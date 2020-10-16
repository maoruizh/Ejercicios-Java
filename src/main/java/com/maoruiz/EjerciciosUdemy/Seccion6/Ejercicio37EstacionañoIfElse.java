package com.maoruiz.EjerciciosUdemy.Seccion6;

import java.util.Scanner;

public class Ejercicio37EstacionañoIfElse {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String estacion;

        System.out.println("Escribe el número del mes del año");
        int mes = Integer.parseInt(entrada.nextLine());

        if (mes == 1 || mes == 2 || mes == 12)
            estacion = "Invierno";
        else if (mes == 3 || mes == 4 || mes == 5)
            estacion = "Primavera";
        else if (mes == 6 || mes == 7 || mes == 8)
            estacion = "Verano";
        else if (mes == 9 || mes == 10 || mes == 11)
            estacion = "Otoño";
        else
            estacion = "Mes incorrecto";

        System.out.println("estacion = " + estacion);

    }
}
