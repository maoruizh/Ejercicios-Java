package nivel.intermedio.ejercicios;
import java.util.Scanner;


public class I06Lavadora_Uno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("¿La ropa es blanca o de color?");
        System.out.println("Presiona 1 - ropa blanca / 2 - ropa color ");
        int TipoDeRopa = entrada.nextInt();
        
        System.out.println("¿Cuantos kilos de ropa?");
        int kilos = entrada.nextInt();
        
        I06LLFunciones mensajero = new I06LLFunciones(kilos, TipoDeRopa);
        mensajero.CicloFinalizado();
    }
}
