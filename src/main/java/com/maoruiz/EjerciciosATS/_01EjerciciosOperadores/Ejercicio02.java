package com.maoruiz.EjerciciosATS._01EjerciciosOperadores;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {

        //hacer un programa que calcule e imprima el salario semanal de un empleado.
        //apartir de sus horas semanales trabajadas y de su salario por hora.

        int salarioSemanal;
        int salariohora;
        int horas;
        String empleado;
        //DecimalFormat formatea = new DecimalFormat ("###,###.##"); este es solo para colocar los puntos decimales
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.getDefault());
        System.out.print("Cual es tu nombre?: ");
        Scanner entrada1 = new Scanner(System.in);
        empleado = entrada1.nextLine();

        System.out.print("Cual es el valor de tu hora de trabajo?: ");
        Scanner entrada2 = new Scanner(System.in);
        salariohora = entrada2.nextInt();

        System.out.print("Cuantas horas trabajas por semana?: ");
        Scanner entrada3 = new Scanner(System.in);
        horas = entrada3.nextInt();

        salarioSemanal = salariohora*horas;

        System.out.println(empleado +" tu salario semanal es de: " + nf.format (salarioSemanal));




    }
}
