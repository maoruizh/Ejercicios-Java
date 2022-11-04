package com.maoruiz.EjerciciosGeekipedia.NivelBasico.Ejercicios;
import java.util.Scanner;

public class B06SumaScanner {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
        String nombre   = "";
        int num_uno = 0, num_dos = 0, resultado = 0;
	
        System.out.println("¿Cual es tu nombre?");
        nombre = entrada.nextLine();
	
        System.out.println("¿Cual es el primer valor para tu suma?");
        num_uno = entrada.nextInt();

        System.out.println("¿Cual es el segundo valor para tu suma?");
        num_dos = entrada.nextInt();

        resultado = num_dos + num_uno;
	
        System.out.println("Hola " + nombre + " el resultado de tu suma es: " + resultado);

	}

}
