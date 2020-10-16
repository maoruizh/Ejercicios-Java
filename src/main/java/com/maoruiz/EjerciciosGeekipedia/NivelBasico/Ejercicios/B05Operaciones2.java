package com.maoruiz.EjerciciosGeekipedia.NivelBasico.Ejercicios;

public class B05Operaciones2 {
	public static void main(String[] args) {
		
		int operacion = 3, numero_uno = 8, numero_dos = 4, resultado = 0;
		
		if (operacion == 1 ){
			resultado = numero_uno + numero_dos;
			System.out.println ("El resultado de la suma es: " + resultado);
			
		}else if (operacion == 2 ){
			
			resultado = numero_uno - numero_dos;
		    System.out.println ("El resultado de la resta es: " + resultado);
			
		}else if (operacion == 3 ){
			resultado = numero_uno * numero_dos;
			System.out.println ("El resultado de la multiplicacion es: " + resultado);
			
		}else if (operacion == 4 ){
			resultado = numero_uno / numero_dos;
			System.out.println ("El resultado de la divicion es: " + resultado);
		
		}else {
			System.out.println ("La opcion que elegiste no existe");
		}

	}

}
