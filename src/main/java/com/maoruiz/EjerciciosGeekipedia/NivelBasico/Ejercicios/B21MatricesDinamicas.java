package com.maoruiz.EjerciciosGeekipedia.NivelBasico.Ejercicios;

import java.util.Scanner;
public class B21MatricesDinamicas{
	public static void main (String Args []){
		
		int filas    = 0;
		int columnas = 0;
		int contador = 1;
		
		Scanner Entrada = new Scanner(System.in);
		
		System.out.println("Cuantas filas deseas ingresar");
		filas = Entrada.nextInt();
		
		System.out.println("Cuantas columnas deseas ingresar");
		columnas = Entrada.nextInt();
		
		int Numeros [][] = new int [filas][columnas];
		
		for (int j = 0; j < filas; j++){
			for (int i = 0; i < columnas; i ++){
				Numeros [j] [i] = contador;
				contador ++;
				
				System.out.print("[" + Numeros [j][i] + "]");
			}
			System.out.println("");
		}
	}
}