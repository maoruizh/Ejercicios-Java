package nivel.intermedio;
import java.util.Scanner;


public class I07Lavadora_UnoGyS {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("¿La ropa es blanca o de color?");
        System.out.println("Presiona 1 - ropa blanca / 2 - ropa color ");
        int TipoDeRopa = entrada.nextInt();
        
        System.out.println("¿Cuantos kilos de ropa?");
        int kilos = entrada.nextInt();

        I07LLFuncionesGyS mensajero = new I07LLFuncionesGyS (kilos, TipoDeRopa);
        mensajero.setTipoDeRopa (2);
        System.out.println("El tipo de ropa es: " + mensajero.getTipoDeRopa());
        mensajero.CicloFinalizado();
    }
}
