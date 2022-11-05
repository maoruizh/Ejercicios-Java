package ejercicios.Seccion3;

import java.util.Scanner;

public class Ejercicio11Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cual es el titulo del libro?");
        String titulo = scanner.nextLine();

        System.out.println("¿Cual es el autor?");
        String autor = scanner.nextLine();

        System.out.println(titulo + " fue escrito por " + autor);
    }
}
