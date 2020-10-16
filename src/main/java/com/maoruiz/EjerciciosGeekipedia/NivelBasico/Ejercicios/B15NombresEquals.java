package com.maoruiz.EjerciciosGeekipedia.NivelBasico.Ejercicios;
import java.util.Scanner;
public class B15NombresEquals {
	  public static void main(String args[]){

	  String nombre_uno = "", nombre_dos = "";
	  Scanner entrada = new Scanner(System.in);

	  System.out.println("Porfavor ingresa el primer nombre: ");
	  nombre_uno = entrada.nextLine();

	  System.out.println("Porfavor dame el segundo nombre: ");
	  nombre_dos = entrada.nextLine();

	  if(nombre_uno.equalsIgnoreCase(nombre_dos)){
	   System.out.println("Los nombres son iguales");
	  } else {
	   System.out.println("Los nombres son diferentes");
	  }
	 }
	}
