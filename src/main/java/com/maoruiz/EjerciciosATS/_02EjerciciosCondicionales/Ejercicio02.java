package com.maoruiz.EjerciciosATS._02EjerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {

        //Hacer un programa que pida dos numeros y diga cual es mayor o si son iguales

        int numero1, numero2;
        Scanner entrada =new Scanner(System.in);

        System.out.print("Dame el primer numero: ");
        numero1= entrada.nextInt();

        System.out.print("Dame el segundo numero: ");
        numero2= entrada.nextInt();

        if (numero1>numero2){
            System.out.println("\nEl numero mayor es "+numero1);

        }else if (numero1<numero2){
            System.out.println("\nEl numero mayor es "+numero2);

        }else System.out.println("\nLos numeros son iguales");



    }
}
