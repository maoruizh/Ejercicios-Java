package nivel.basico.ejercicios;
import java.util.Scanner;
public class B07SistemaVacaciones {
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

        System.out.println("¿Cual es la antigüedad en años del empleado?: ");
        antiguedad = entrada.nextInt();
        System.out.println("");

        System.out.println("¿Cual es la clave del departamento del empleado?: ");
        clave = entrada.nextInt();
        System.out.println("");
 

        if (clave == 1){
			
            if (antiguedad == 1){
				System.out.println("El trabajador " + nombre + " Tiene derecho a 6 días de vacaciones");
			}else if(antiguedad >=2 && antiguedad <=6){
				System.out.println("El trabajador " + nombre + " Tiene derecho a 14 días de vacaciones");
			}else if(antiguedad >=7){
				System.out.println("El trabajador " + nombre + " Tiene derecho a 20 días de vacaciones");
			}

		}else if (clave == 2){
			if (antiguedad == 1){
				System.out.println("El trabajador " + nombre + " Tiene derecho a 7 días de vacaciones");
			}else if(antiguedad >=2 && antiguedad <=6){
				System.out.println("El trabajador " + nombre + " Tiene derecho a 15 días de vacaciones");
			}else if(antiguedad >=7) {
				System.out.println("El trabajador " + nombre + " Tiene derecho a 22 días de vacaciones");
			}				
     
		}else if (clave == 3){ 
			if (antiguedad == 1){
				System.out.println("El trabajador " + nombre + " Tiene derecho a 10 días de vacaciones");
			}else if(antiguedad >=2 && antiguedad <=6){
				System.out.println("El trabajador " + nombre + " Tiene derecho a 20 días de vacaciones");
			}else if(antiguedad >=7) {
				System.out.println("El trabajador " + nombre + " Tiene derecho a 30 días de vacaciones");
			}else {
				System.out.println("El trabajador " + nombre + " Aun no tiene derecho a vacaciones");
			}
		}	else{
			System.out.println("La clave del departamento no existe. Debe ser entre 1 y 3");
		}
    }   

}
