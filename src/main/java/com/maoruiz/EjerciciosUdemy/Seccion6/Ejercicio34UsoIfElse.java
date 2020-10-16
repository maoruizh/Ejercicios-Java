package com.maoruiz.EjerciciosUdemy.Seccion6;

public class Ejercicio34UsoIfElse {
    public static void main(String[] args) {

        int numero = 2;
        String texto = "numero desconocido";

        if (numero == 1)
            System.out.println("Condicion verdadera");
        else
            System.out.println("Condicion falsa");


        if (numero == 1)
            System.out.println("numero uno");
        else if (numero == 2)
            System.out.println("numero dos");
        else if (numero == 3)
            System.out.println("numero tres");
        else
            System.out.println("numero desconocido");


        if (numero == 1)
            texto ="numero uno";
        else if (numero == 2)
            texto ="numero dos";
        else if (numero == 3)
            texto = "numero tres";
        else
            texto = "numero desconocido";
        System.out.println("texto = " + texto);

    }
}
