package com.maoruiz.Ejercicios_Semillero_QA;

import java.util.Scanner;
public class Pruebas {
    public static void main(String[] args) {

        //11)Imprimir la posición de todos los elementos mayores a cinco de un vector.
        System.out.println("\nEste es el resultado del ejercicio # 11");
        int vector1 [] = {1, 3, 5, 9, 15, 26, 45, 8, 44, 10};
        for (int i = 0; i < vector1.length; i++) {
            if (vector1[i] > 5) {
                System.out.println("El numero " + vector1[i] + " esta en la posición " + i);
            }
        }
    }
}

