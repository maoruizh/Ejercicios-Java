package Ejercicios_Semillero_QA;

import java.util.Scanner;

public class Pruebas {
    public static void main(String[] args) {
        System.out.println("\nEste es el resultado del ejercicio # 9");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un elemento a buscar: ");
        int busqueda;
        busqueda = sc.nextInt();
        int vector[] = new int[]{3, 25, 39, 54};
        boolean encontro = false;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == (busqueda)) {
                System.out.println("Se encontro el elemento en la posición: " + i);
                encontro = true;
            }
        }
        if (encontro == false) {
            System.out.println("No se encontro");
        }
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
/*

Scanner
    int codigo;
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce");
    codigo=sc.nextInt();


Con JOptionPane
    int codigo;
    String texto=JOptionPane.showInputDialog("Introduce");
    codigo=Integer.parseInt(texto);

*/
