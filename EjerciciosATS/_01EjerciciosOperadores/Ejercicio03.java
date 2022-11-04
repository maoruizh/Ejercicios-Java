package com.maoruiz.EjerciciosATS._01EjerciciosOperadores;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {

        //Guillermo tiene N dolares. Luis tiene la mitad de lo que posee guilermo.
        //juan tiene la mitad de lo que posee luis y guillermo juntos.
        //hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los 3.

        float Guillermo, Luis, Juan, Resultado;

        System.out.print("¿Con Cuantos dolares inicia Guillermo? ");
        Scanner Entrada = new Scanner(System.in);
        Guillermo = Entrada.nextFloat();

        Luis = Guillermo/2;
        System.out.println("Luis tiene "+Luis);

        Juan = (Guillermo+Luis)/2;
        System.out.println("Juan tiene "+Juan);

        Resultado = Guillermo + Luis + Juan;

        System.out.println("Entre los 3 tienen un total de: "+ Resultado +" dolares");





    }
}
