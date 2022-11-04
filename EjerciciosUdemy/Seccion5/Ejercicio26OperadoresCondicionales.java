package com.maoruiz.EjerciciosUdemy.Seccion5;

public class Ejercicio26OperadoresCondicionales {
    public static void main(String[] args) {
        int a = 3;
        int valorMinimo = 1;
        int valorMaximo = 2;
        Boolean res = a >= valorMinimo && a <= valorMaximo;//si cualquiera de los dos valores es falso el resultado es falso
        System.out.println("res = " + res);

        Boolean res2 = a >= valorMinimo || a <= valorMaximo;//si uno de los dos valores es verdadero el resultado es verdadero
        System.out.println("res2 = " + res2);

    }
}
