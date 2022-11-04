package com.maoruiz.EjerciciosGeekipedia.NivelBasico.Ejercicios;
import java.util.Scanner;

public class B19VectoresDinamicos {
	public static void main (String args []){
		
		int longitud = 0;
		Scanner Entrada = new Scanner(System.in);
		
		
		System.out.println("Cuantos numeros deseas ingresar");
		longitud = Entrada.nextInt();
		
		int Numeros [] = new int [longitud];
		
		for(int i = 0; i < Numeros.length; i ++){
			System.out.println("Porfavor dame el valor #" + (i + 1));
			Numeros[i] = Entrada.nextInt();
		}
		for(int i = 0; i < Numeros.length; i ++){
			System.out.print("[" + Numeros [i] + "]");
		}
	}

}
