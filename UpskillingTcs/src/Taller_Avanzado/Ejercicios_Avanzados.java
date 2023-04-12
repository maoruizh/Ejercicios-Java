package Taller_Avanzado;

public class Ejercicios_Avanzados {
    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
    }

    //1. Crear un vector de 20 elementos con valores numéricos diferentes generados aleatoriamente.
    // Hallar el mayor valor y su posición y calcular el promedio
    public static void ejercicio1() {
        int[] vector = new int[20];
        int mayor = 0;
        int posicion = 0;
        int suma = 0;
        double promedio = 0;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100);
            System.out.println("Posicion: " + i + " : " + vector[i]);
            suma = suma + vector[i];
            if (vector[i] > mayor) {
                mayor = vector[i];
                posicion = i;
            }
        }
        promedio = (double) suma / vector.length;
        System.out.println("El mayor valor es: " + mayor + " y esta en la posicion: " + posicion);
        System.out.println("Promedio: " + promedio);

    }

    //2. Crear una matriz nxm, llenarla utilizando el método Math.rnadom y ordénela de manera descendente

    public static void ejercicio2() {
        int n = 3;
        int m = 4;
        int[][] matriz = new int[n][m];

        //Llenar matriz
        System.out.println("Antes de ordenar");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        matriz = matrizDescendingSort(matriz, n, m);

        System.out.println("\nOrdenada descendentemente");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] matrizDescendingSort(int[][] matriz, int n, int m) {
        int aux = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < m; l++) {
                        if (matriz[i][j] > matriz[k][l]) {
                            aux = matriz[i][j];
                            matriz[i][j] = matriz[k][l];
                            matriz[k][l] = aux;
                        }
                    }
                }
            }
        }
        return matriz;
    }

    public static void descendingSort(int[] vector) {
        for (int i = vector.length; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (vector[j] > vector[j + 1]) {
                    change(vector, j, j + 1);
                }
            }
        }
    }

    public static void change(int[] vector, int i, int j) {
        int aux;
        aux = vector[i];
        vector[i] = vector[j];
        vector[j] = aux;
    }

//3.

}