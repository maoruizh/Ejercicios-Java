package com.maoruiz.EjerciciosATS._02EjerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {

        //En un centro comercial se dara un 20% de descuento si las compras superan $300.
        //Hacer un programa que muestre si aplica al descuento y cuanto sera el valor a pagar.

        double descuento=0.20;
        double valorcompra;
        double valorapagar;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Dime el valor de tu compra: ");
        valorcompra = entrada.nextInt();
        valorapagar= valorcompra-(valorcompra*descuento);

        if (valorcompra>300){
            System.out.println("Tu compra es mayor a 300, por lo tanto si aplicas al descuento y tu valor a pagar es "+valorapagar);
        }
        else System.out.println("Tu compra no supera los 300, por lo tnato no aplicas a descuento");

    }
}
