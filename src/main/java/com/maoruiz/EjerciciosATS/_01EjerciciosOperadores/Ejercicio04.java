package com.maoruiz.EjerciciosATS._01EjerciciosOperadores;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {

        //Una compañia de venta de carros usados, paga a su personal de ventas un salario de $1.000 mensuales.
        //mas una comision de $150 por  cada carro vendido, mas el 5% del valor de la venta por carro
        //hacer un programa que calcule e imprima el salario mensual de un vendedor.

        float salarioMensual = 1000;
        float SalarioTotal;

        float CarrosVendidos,ValorCarros, Comision1, Comision2;

        float ComisionCarro = 150;
        float ComisionValor = 0.05f;
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.getDefault());


        System.out.print("Cuantos carros vendio el asesor? :");
        Scanner entrada = new Scanner(System.in);
        CarrosVendidos = entrada.nextInt();

        System.out.print("Cuanto es el valor total de los carros vendios por el asesor? :");
        Scanner entrada1 = new Scanner(System.in);
        ValorCarros = entrada1.nextInt();

        Comision1 = ComisionCarro * CarrosVendidos;
        System.out.println("\nLa comision por carros vendidos es de :"+ nf.format(Comision1)+" dolares");

        Comision2 = ValorCarros * ComisionValor;
        System.out.println("La comision por el valor de los carros vendidos es de :"+ nf.format(Comision2)+" dolares");

        SalarioTotal = salarioMensual + Comision1+ Comision2;
        System.out.println("\nEl salario total mensual del asesor es de : "+ nf.format(SalarioTotal)+" dolares");
    }
}
