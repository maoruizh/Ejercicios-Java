package com.maoruiz.EjerciciosATS._01EjerciciosOperadores;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {

        //Hacer un programa que dado un numero total de horas, devuelva el numero total de semanas, dias y horas equivalentes.
        //Numero de horas 1.000. Debe mostrar 5 semanas, 6 dias y 16 horas

        int numerohoras, semanas, dias, horasequiv, resultado;
        Scanner entrada= new Scanner(System.in);

        System.out.print("Dame el numero de horas:");
        numerohoras= entrada.nextInt();


        semanas = numerohoras/168;
        dias= numerohoras%168 /24;
        horasequiv = numerohoras%24;

        System.out.println("El numero de semanas es: "+ semanas + " \nEl numero de dias es: "+ dias +" \nEl numero de horas equivalentes es: "+ horasequiv);


    }
}
