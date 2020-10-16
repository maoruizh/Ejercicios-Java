package com.maoruiz.EjerciciosATS._01EjerciciosOperadores;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {

        //hacer un programa que le pida al usuario 3 calificaciones
        // luego que las sume y muestre el resultado
        // y al final que las promedie y muestre si el alumno aprobo o reprobo la materia.

        float calificacion1, calificacion2, calificacion3, resultado, promedio;


        System.out.print("Dame el valor de la primera calificacion :");
        Scanner entrada1 = new Scanner(System.in);
        calificacion1 = entrada1.nextFloat();

        System.out.print("Dame el valor de la segunda calificacion :");
        Scanner entrada2 = new Scanner(System.in);
        calificacion2 = entrada2.nextFloat();

        System.out.print("Dame el valor de la tercera calificacion :");
        Scanner entrada3 = new Scanner(System.in);
        calificacion3 = entrada3.nextFloat();

        resultado = calificacion1+calificacion2+calificacion3;
        promedio = resultado/3;

        System.out.println("\nla suma de las tres calificaciones es de :" + resultado);
        System.out.println( "\nel promedio de las tres calificaciones es de :" + promedio);

        if (promedio >= 3){
            System.out.println("\nEl alumno aprobó la materia ");

        }else{
            System.out.println("\nEl alumno reprobó la materia ");

        }
    }
}
