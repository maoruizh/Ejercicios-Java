package nivel.basico.ejercicios;

public class B03Operaciones {
	public static void main(String args[]){
		
	    int numero_uno = 4;
	    int numero_dos = 4;
	    int resultado  = 0;
	
	    resultado = (numero_uno + numero_dos) / 2;
	    System.out.println("El resultado con paréntesis es " + resultado);
	
	    resultado = numero_uno + numero_dos / 2 * 2 - 1;
	    System.out.println("El resultado sin paréntesis es " + resultado);
   
    }

}
