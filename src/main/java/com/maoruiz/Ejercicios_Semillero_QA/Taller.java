package com.maoruiz.Ejercicios_Semillero_QA;
import javax.swing.*;
import java.util.Scanner;

public class Taller {
    public static void main(String[] args) {

/*
//1)Algoritmo que lea 4 números, calculando y escribiendo el valor de su suma, resta, multiplicación.
        System.out.println("\nEste es el resultado del ejercicio # 1");
        int numero1 = 10, numero2 = 20, numero3 = 30, numero4 = 40;
        System.out.println("El número 1 es = " + numero1);
        System.out.println("El número 2 es = " + numero2);
        System.out.println("El número 3 es = " + numero3);
        System.out.println("El número 4 es = " + numero4);
        System.out.println("El resultado de la suma de todos los números es = " + (numero1 + numero2 + numero3 + numero4));
        System.out.println("El resultado de la resta entre el (número 2 y el número 1) y luego el (número 4 y el número 3) es = " + ((numero2 - numero1) - (numero4-numero3)));
        System.out.println("El resultado de la multiplicación de todos los números es = " + (numero1 * numero2 * numero3 * numero4));
        System.out.println("-----------------------------------------------------------------------------------------");

//2)Convertir una frase a mayúsculas o minúsculas, que daremos opción a que el usuario lo pida y mostraremos el resultado por pantalla.
        System.out.println("\nEste es el resultado del ejercicio # 2");
        String frase = "Que taller tan bueno";
        Scanner tipoDeLetra = new Scanner(System.in);
        System.out.println("Quieres ver la frase en MAYUSCULA o minuscula?");
        String busqueda = tipoDeLetra.next();
        if (busqueda.equals("minuscula")) {
            System.out.println(frase.toLowerCase());
        } else System.out.println(frase.toUpperCase());
        System.out.println("-----------------------------------------------------------------------------------------");

//3)Mostrar la longitud de una cadena.
        System.out.println("\nEste es el resultado del ejercicio # 3");
        String cadena = "Mauricio";
        System.out.println("La cadena contiene " + cadena.length() + " caracteres");
        System.out.println("-----------------------------------------------------------------------------------------");

//4)Pedir dos palabras por teclado, indicar si son iguales.
        System.out.println("\nEste es el resultado del ejercicio # 4");
        String nombre1 = JOptionPane.showInputDialog("Introduce el primer nombre");
        String nombre2 = JOptionPane.showInputDialog("Introduce el segundo nombre");
        System.out.println("El primer nombre es " + nombre1 + " y el segundo nombre es " + nombre2);
        if (nombre1.equals(nombre2)){
            System.out.println("Los dos nombres son diferentes"); //No está funcionando bien
        } else System.out.println("Los nombres son iguales");
        System.out.println("-----------------------------------------------------------------------------------------");

//5)Dada una cadena, extraer la cuarta y quinta letra usando el método substring.
        System.out.println("\nEste es el resultado del ejercicio # 5");
        String cadena1 = "Mauricio";
        System.out.println("la cuarta y quinta letra de la palabra son: "+ cadena1.substring(3,5));// no sé por qué con el 4 no muestra la i pero con el 5 si
        System.out.println("-----------------------------------------------------------------------------------------");
*/
//6)Crea un vector con un tamaño de 5, asígnale los valores numéricos manualmente (los que tú quieras) y muéstralos por pantalla.
        System.out.println("\nEste es el resultado del ejercicio # 6");
        int numerosEnteros[] = {40, 35, 28, 25, 37};
        for (int i = 0; i < numerosEnteros.length; i++) {
            System.out.println("Los valores del arreglo son: " + numerosEnteros[i]);
        }
        System.out.println("-----------------------------------------------------------------------------------------");

//7)Modifica el ejercicio anterior para que insertes los valores numéricos con leer mediante un para y los muestre por pantalla.
/*
//8)Crea un vector con un tamaño de 10, inserta los valores numéricos que desees de la manera que quieras y súmalos. Luego muestra por pantalla los valores.
        System.out.println("\nEste es el resultado del ejercicio # 8");
        int arreglo [] = {40, 35, 28, 25, 37, 22, 54, 98,12,23};
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++){
            suma = suma + arreglo [i];
        }
        System.out.println("El resultado de la suma de todos los números del arreglo es = "+ suma);
        System.out.println("-----------------------------------------------------------------------------------------");

//9)Buscar un elemento dentro de un vector que nosotros le pedimos por teclado. Indicar las posiciones donde se encuentra.
        //Y si no se encuentra, imprimir el mensaje ”no se encuentra en valor ingresado”
        System.out.println("\nEste es el resultado del ejercicio # 9");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un elemento a buscar: ");
        int busqueda;
        busqueda = sc.nextInt();
        int vector[] = new int[]{3, 25, 39, 54};
        boolean encontro = false;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == (busqueda)) {
                System.out.println("Se encontró el elemento en la posición: " + i);
                encontro = true;
            }
        }
        if (encontro == false) {
            System.out.println("No se encontró");
        }
        System.out.println("-----------------------------------------------------------------------------------------");
*/
//10)Crea dos vectores que tengan el mismo tamaño (lo pedirá por teclado), en uno de ellos almacenaras nombres de personas como cadenas, en el otro vector ira almacenando la longitud de los nombres.
        //Muestra por pantalla el nombre y la longitud que tiene. Puedes usar funciones si lo deseas.
        //(Una función es un subprograma que acepta parámetros y devuelve un único resultado Los parámetros serán los datos de entrada para realizar la función.
        //En la cabecera de la función se debe indicar los parámetros formales, indicando su tipo, y el tipo de valor que devolverá la función.
        //También debemos declarar las variables que se vayan a usar y devolver un valor, que corresponda al tipo de variable).

//11)Imprimir la posición de todos los elementos mayores a cinco de un vector.

//12)llenar un vector con los primeros 50 números impares.

//13)Pedir por teclado el tamaño de un vector de números y pedir los valores numéricos con los que se rellena. Los valores no se pueden repetir. Mostrar el vector con los valores al final.

//14)Suponga un vector con N números enteros generados aleatoriamente y mostrados en pantalla, N debe ser un número impar, mostrar en pantalla el valor que ocupa el centro del vector.

//16)Suponga un vector con N notas de 0 a 20, calcule el promedio de aprobados y el promedio de los desaprobados e indique la cantidad de aprobados y desaprobados.
    }
}
