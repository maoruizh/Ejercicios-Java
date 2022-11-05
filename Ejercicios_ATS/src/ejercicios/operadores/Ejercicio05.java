package ejercicios.operadores;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {

        /*La calificacion final de un estudiante se calcula con base a 4 aspectos:
          participacion con un valor de 10%
          parcial 1 con un valor de 25%
          parcial 2 con un valor de 25%
          final con un valor de 40%
          hacer un programa que calcule e imprima la calificacion final del estudiante.
        */

        float participacion, parcial1, parcial2, examenfinal, resultado;
        String nombre;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Cual es el nombre del estudiante? :");
        nombre = entrada.nextLine();

        System.out.print("Cual es la nota de participacion? :");
        participacion = entrada.nextFloat();

        System.out.print("Cual es la nota del primer examen parcial? :");
        parcial1 = entrada.nextFloat();

        System.out.print("Cual es la nota del segundo examen parcial? :");
        parcial2 = entrada.nextFloat();

        System.out.print("Cual es la nota del examen final? :");
        examenfinal = entrada.nextFloat();

        participacion = participacion *0.10f;
        parcial1 = parcial1 * 0.25f;
        parcial2 = parcial2 * 0.25f;
        examenfinal = examenfinal * 0.40f;

        resultado = participacion+parcial1+parcial2+examenfinal;

        System.out.println("\nla nota fial de "+ nombre + " es de "+ resultado);



    }
}
