package com.maoruiz.EjerciciosATS._02EjerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {

        //Hacer un programa que lea un numero entero y muestre si es multiplo de 10

        int numero;

        Scanner entrada= new Scanner(System.in);
        System.out.print("Dame un numero: ");
        numero= entrada.nextInt();

        //el operador %mod divide el numero entre 10 y solo toma el residuo y ahi aplica la condicion
        if (numero%10 == 0){
            System.out.println("El numero "+ numero+ " SI es multiplo de 10");

        }else
            System.out.println("El numero "+ numero+ " NO es multiplo de 10");
    }
}
