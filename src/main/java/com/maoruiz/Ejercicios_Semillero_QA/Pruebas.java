package com.maoruiz.Ejercicios_Semillero_QA;

import java.util.Scanner;

public class Pruebas {
    public static void main(String[] args) {
//Suponga un vector con N notas de 0 a 20, calcule el promedio de aprobados y el promedio de los desaprobados e
// indique la cantidad de aprobados y desaprobados.


        int[] vector = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int aprobados = 0;
        int desaprobados = 0;
        int sumaAprobados = 0;
        int sumaDesaprobados = 0;
        for (int i = 0; i < vector.length; i++) {
            if(vector[i] >= 10){
                aprobados++;
                sumaAprobados += vector[i];
            }else{
                desaprobados++;
                sumaDesaprobados += vector[i];
            }
        }
        System.out.println("El promedio de aprobados es: " + sumaAprobados/aprobados);
        System.out.println("El promedio de desaprobados es: " + sumaDesaprobados/desaprobados);
        System.out.println("La cantidad de aprobados es: " + aprobados);
        System.out.println("La cantidad de desaprobados es: " + desaprobados);
    }
}
