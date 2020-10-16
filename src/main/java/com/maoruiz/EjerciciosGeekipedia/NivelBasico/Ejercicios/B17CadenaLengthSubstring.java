package com.maoruiz.EjerciciosGeekipedia.NivelBasico.Ejercicios;
import java.util.Scanner;

public class B17CadenaLengthSubstring {
public static void main(String Args []){
		
		String cadena_original = "";
		String cadena_substraccion = "";
		int num_caracteres = 0;
		int desde = 0;
		int hasta = 0;
		Scanner in = new Scanner (System.in);
		
		System.out.println ("introduce una palabra.");
		cadena_original = in.nextLine ();
		System.out.println ("");
		
		num_caracteres = cadena_original.length ();
		System.out.println ("Tu palabra tiene " + num_caracteres + " caracteres.");
	
		System.out.println ("¿Desde cual numero de caracter deseas cortar la palabra?. (Cada letra es un caracter)");
		desde = in.nextInt ();
		
		System.out.println ("¿Hasta cual numero de caracter deseas cortar la palabra?.");
		hasta = in.nextInt ();
		
		cadena_substraccion = cadena_original.substring (desde, hasta);
		
		System.out.println ("Tu nueva palabra de caracteres es " + cadena_substraccion);
	}

}
