package com.maoruiz.EjerciciosGeekipedia.NivelBasico.Ejercicios;
import java.util.Scanner;
public class B07Sistema {
public static void main(String args[]){
		
		Scanner entrada = new Scanner(System.in);
        String  nombre  = "";
        int     clave   = 0, antiguedad = 0;

        System.out.println("");  
        System.out.println("*********************************************************");
        System.out.println("* Bienvenido al sistema vacacional de Coca-Cola Company *");
        System.out.println("*********************************************************");
        System.out.println("");
   
        System.out.println("¿Cual es el nombre del empleado?: ");
        nombre = entrada.nextLine();
        System.out.println("");

        System.out.println("¿Cual es la antiguedad en meses del empleado?: ");
        antiguedad = entrada.nextInt();
        System.out.println("");

        System.out.println("¿Cual es la clave del departamento del empleado?: ");
        clave = entrada.nextInt();
        System.out.println("");
 

        if (clave == 1){
			
            if (antiguedad == 12){
				System.out.println("El trabajador " + nombre + " Tiene derecho a 6 días de vacaciones");
			}else if(antiguedad >=13 && antiguedad <=72){
				System.out.println("El trabajador " + nombre + " Tiene derecho a 14 días de vacaciones");
			}else if(antiguedad >=84){
				System.out.println("El trabajador " + nombre + " Tiene derecho a 20 días de vacaciones");
			}

		}else if (clave == 2){
			if (antiguedad == 12){
				System.out.println("El trabajador " + nombre + " Tiene derecho a 7 días de vacaciones");
			}else if(antiguedad >=13 && antiguedad <=72){
				System.out.println("El trabajador " + nombre + " Tiene derecho a 15 días de vacaciones");
			}else if(antiguedad >=84) {
				System.out.println("El trabajador " + nombre + " Tiene derecho a 22 días de vacaciones");
			}				
     
		}else if (clave == 3){ 
			if (antiguedad == 12){
				System.out.println("El trabajador " + nombre + " Tiene derecho a 10 días de vacaciones");
			}else if(antiguedad >=13 && antiguedad <=72){
				System.out.println("El trabajador " + nombre + " Tiene derecho a 20 días de vacaciones");
			}else if(antiguedad >=84) {
				System.out.println("El trabajador " + nombre + " Tiene derecho a 30 días de vacaciones");
			}else {
				System.out.println("El trabajador " + nombre + " Aun no tiene derecho a vacaciones");
			}
		}	
    }   

}
