package com.maoruiz.EjerciciosGeekipedia.NivelBasico.Ejercicios;

public class B04Promedio {
public static void main (String args []){
		
		float matematicas = 5, biologia = 3, quimica = 7;
		float promedio = 0;
		
		promedio = (matematicas + biologia + quimica)/ 3;
		if (promedio >= 6){
			System.out.println("El alumno aprobó " + promedio);
			
		}else{
			System.out.println("El alumno reprobó " + promedio);
			
		}
	}

}
