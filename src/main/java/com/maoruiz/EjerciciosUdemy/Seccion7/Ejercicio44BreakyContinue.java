package com.maoruiz.EjerciciosUdemy.Seccion7;

public class Ejercicio44BreakyContinue {
    public static void main(String[] args) {

        /*
        for (int i = 0; i < 3; i++) {
            if (i % 2 == 0);
            System.out.println("i = " + i);
            break; //colocamos el break solo para imprimir el primer numero par, es decir interrumpri el ciclo normal
        }
        */

        for (int i = 0; i < 3; i++) {
            if (i % 2 != 0)
            continue;//colocamos el continue para ir a la siguiente iteraccion del ciclo. No se rompe por completo
            System.out.println("i = " + i);
        }
    }
}
