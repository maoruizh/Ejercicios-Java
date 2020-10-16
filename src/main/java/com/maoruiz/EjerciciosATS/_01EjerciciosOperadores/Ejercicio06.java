package com.maoruiz.EjerciciosATS._01EjerciciosOperadores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        //hacer un programa que calcule el cuadrado de una suma
        //(a+b)2 = a2 + b2 + 2ab

        int a, b, resultado;
        Scanner entrada = new Scanner(System.in);
        DecimalFormat formatea = new DecimalFormat("###,###.##");

        System.out.print("Dame el valor de a: ");
        a = entrada.nextInt();

        System.out.print("Dame el valor de b: ");
        b = entrada.nextInt();

        resultado= (int) (Math.pow(a,2)+Math.pow(b,2)+(2*a*b));

        System.out.println("\nEl resultado del cuadrado de la suma es: "+formatea.format(resultado));


    }
}
