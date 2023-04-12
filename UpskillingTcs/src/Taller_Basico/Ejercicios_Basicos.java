package Taller_Basico;

import java.util.StringTokenizer;

public class Ejercicios_Basicos {
    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
        ejercicio8();
        ejercicio9();
        ejercicio10();
        ejercicio11();
        ejercicio12();
        ejercicio13();
        ejercicio14();
        ejercicio15();
        ejercicio16();
        ejercicio17();
        ejercicio18();
    }

    //1)Segun este Codigo, en lugar de XXXXX que deberia ir
    // public class MyFirstProgram{
    // public static void XXXXX (String)[]args}{
    // System.out.println("*Hello World*")
    // }
    public static void ejercicio1() {
        System.out.println("\nEste es el resultado del ejercicio # 1 ");
        System.out.println("*las XXXXX se deben reemplazar por la palabra main, ya que esta es la sintaxis correcta del metodo principal de la clase");
        System.out.println("*Hello World*");
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    //2)Declara un String que contenga tu nombre, después, escribe el código necesario para mostrar un mensaje de bienvenida por consola. Por ejemplo:
    //si el nombre asignado a la variable fue “Juan Alvaro”, aparezca “Bienvenido Juan Alvaro.”
    public static void ejercicio2() {
        System.out.println("\nEste es el resultado del ejercicio # 2 ");
        String nombre = "Mao";
        System.out.println("Bienvenido " + nombre);
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    //3)Escriba el código en Java que realice lo siguiente:
    //declarar una variable numero1 de tipo int,
    //declarar una variable numero2 de tipo double
    //declarar una variable numero3 de tipo int
    //declarar una variable numero4 de tipo int
    //A cada una de las variables asígnale un valor cualquiera. A continuación, muestra por pantalla:
    //El valor de cada variable.
    //La suma de: numero1 más numero2
    //La resta de: numero2 menos numero1
    //La multiplicación de: numero4 por numero3
    //La división de: numero1 por numero2
    //El residuo de la división de: numero4 por numero3
    public static void ejercicio3() {
        System.out.println("\nEste es el resultado del ejercicio # 3 ");
        int numero1 = 1, numero3 = 3, numero4 = 4;
        int numero2 = 2;
        System.out.println("Estos son los valores de cada una de las variables: " + numero1 + "," + numero2 + "," + numero3 + "," + numero4);
        System.out.println("El resultado de la suma entre " + numero1 + " y " + numero2 + " es: " + "[" + (numero1 + numero2) + "]");
        System.out.println("El resultado de la resta entre " + numero2 + " y " + numero1 + " es: " + "[" + (numero2 - numero1) + "]");
        System.out.println("El resultado de la multiplicación entre " + numero4 + " y " + numero3 + " es: " + "[" + (numero4 * numero3) + "]");
        System.out.println("El resultado de la división entre " + numero1 + " y " + numero2 + " es: " + "[" + (numero1 / numero2) + "]");
        System.out.println("El resultado del residuo de la división entre " + numero4 + " y " + numero3 + " es: " + "[" + (numero1 % numero2) + "]");
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    //4)Escriba un programa en java que lea dos caracteres cualquiera y compruebe si son iguales. Escribir en consola el resultado de dicha comparación “Son iguales” o “Son diferentes”
    public static void ejercicio4() {
        System.out.println("\nEste es el resultado del ejercicio # 4 ");
        String nombre1 = "Mao";
        char char1 = nombre1.charAt(0);
        System.out.println("El carácter de la posición 0 de la palabra " + "[" + nombre1 + "]" + " es: " + char1);
        char char2 = nombre1.charAt(1);
        System.out.println("El carácter de la posición 1 de la palabra " + "[" + nombre1 + "]" + " es: " + char2);
        if (char1 == char2) {
            System.out.println("Los caracteres Son iguales");
        } else System.out.println("Los caracteres Son diferentes");
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    //5)Realizar un programa en Java que muestre en consola los números del 1 al 100 utilizando la instrucción (for).
    public static void ejercicio5() {
        System.out.println("\nEste es el resultado del ejercicio # 5 ");
        System.out.println("Estos son los numero ordenados del 1 al 100 utilizando un ciclo For");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + ",");
        }
        System.out.println("\n-----------------------------------------------------------------------------------------");
    }

    //6)Realizar un programa en Java que muestre en consola los números del 100 al 1 utilizando la instrucción (while).
    public static void ejercicio6() {
        System.out.println("\nEste es el resultado del ejercicio # 6 ");
        int num = 1;
        System.out.println("Estos son los numero ordenados del 1 al 100 utilizando un ciclo While");
        while (num <= 100) {
            System.out.print(num + ",");
            num++;
        }
        System.out.println("\n-----------------------------------------------------------------------------------------");
    }

    //7)Realizar un programa en Java que muestre en consola los números del 100 al 1 utilizando la instrucción (do.while).
    public static void ejercicio7() {
        System.out.println("\nEste es el resultado del ejercicio # 7 ");
        int num1 = 100;
        System.out.println("Estos son los numero ordenados del 1 al 100 utilizando un ciclo Do.While");
        do {
            System.out.print(num1 + ",");
            num1--;
        } while (num1 >= 1);
        System.out.println("\n-----------------------------------------------------------------------------------------");
    }

    //8)Escriba un programa en Java para contar el número de palabras que contiene una frase. Mostrar por consola el número de palabras que contiene la frase
    public static void ejercicio8() {
        System.out.println("\nEste es el resultado del ejercicio # 8 ");
        //cree una variable de tipo StringTokenizer para poder utilizar la de CountTokens y asi contar las frases
        StringTokenizer nombre2 = new StringTokenizer("Mauricio Ruiz Herrera");
        System.out.println("El String Mauricio Ruiz Herrera contiene :" + nombre2.countTokens() + " frases");
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    //9)Escriba el código en Java que me permita validar si un número es positivo o negativo. Imprimir en la consola si el número ingresado es: “Positivo” o “Negativo”
    public static void ejercicio9() {
        System.out.println("\nEste es el resultado del ejercicio # 9 ");
        int num2 = -1;
        if (num2 < 0) {
            System.out.println("Después de validar observamos que el numero " + num2 + " es: Negativo");
        } else System.out.println("Después de validar observamos que el numero " + num2 + " es: Positivo");
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    //10)En Java declare una variable de tipo entero que contenga un valor entre 0 y 3. Escribir el código que me muestre en consola el valor de dicha nota en letras.
    //Ejemplo: el valor de mi variable entera es 3, en consola me imprime: “Tres”

    //Esta fue una forma que quice hacer, pero no me salió
    // String cadena = Integer.toString(num3);
    // System.out.println("El valor de mi variable entera es " + num3 + " y en letras es " + cadena);
    public static void ejercicio10() {
        System.out.println("\nEste es el resultado del ejercicio # 10 ");
        int num3 = 3;
        switch (num3) {
            case 0:
                System.out.println("El valor de mi variable entera es " + num3 + " y en letras es Cero");
                break;
            case 1:
                System.out.println("El valor de mi variable entera es " + num3 + " y en letras es Uno");
                break;
            case 2:
                System.out.println("El valor de mi variable entera es " + num3 + " y en letras es Dos");
                break;
            case 3:
                System.out.println("El valor de mi variable entera es " + num3 + " y en letras es Tres");
                break;
        }
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    //11)Modificar el siguiente programa para hacer que compile y funcione:
    //     public static void main(String[] args) {
    //      int n1 = 50,
    //      string  n2 = 30,
    //      boolean suma = 0;
    //      suma = n1 + n2;
    //      systen.out.println(La suma es: " + suma)
    //      }
    public static void ejercicio11() {
        System.out.println("\nEste es el resultado del ejercicio # 11 ");
        int n1 = 50, n2 = 30;
        boolean suma1 = true; // esta variable no se necesito.
        int suma = n1 + n2;
        System.out.println("La suma entre " + n1 + " y " + n2 + " es: " + suma);
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    //12)Corrige los 4 fallos del siguiente programa para que funcione:
    //  public static void main(String[] args) {
    //  int numero = 2,
    //         cuadrado = numero * número;
    //  System.out.println("El cuadrado de " + NUMERO + "es: " + cuadrado);
    //  }
    public static void ejercicio12() {
        System.out.println("\nEste es el resultado del ejercicio # 12 ");
        int numero = 2,
                cuadrado = numero * numero;
        System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    //13)Escriba el código en Java que declare cuatro variables enteras A, B, C, D y asígnale un valor a cada una. A continuación, realiza las instrucciones necesarias para que:
    //B tome el valor de C
    //C tome el valor de A
    //A tome el valor de D
    //D tome el valor de B
    public static void ejercicio13() {
        System.out.println("\nEste es el resultado del ejercicio # 13 ");
        int A = 1, B = 2, C = 3, D = 4;
        System.out.println("A que es 1 toma el valor de D quedando en: " + D);
        System.out.println("B que es 2 toma el valor de C quedando en: " + C);
        System.out.println("C que es 3 toma el valor de A quedando en: " + A);
        System.out.println("D que es 4 toma el valor de B quedando en: " + B);
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    //14)Escriba un programa en java que después de declarar dos variables las concatene y las muestre en consola
    public static void ejercicio14() {
        System.out.println("\nEste es el resultado del ejercicio # 14 ");
        int numero5 = 1, numero6 = 2;
        System.out.println("El resultado de concatenar las variables numero5 y numero6 es= " + (numero5 + numero6));
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    //15)Realizar un programa en java que: convierta todos los caracteres de una cadena de caracteres en mayúscula. Mostrar por consola la prueba de que funciona.
    public static void ejercicio15() {
        System.out.println("\nEste es el resultado del ejercicio # 15 ");
        String cadena2 = "hola mundo";
        System.out.println("convertimos la frase " + cadena2 + " en MAYUSCULA: " + cadena2.toUpperCase());
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    //16)Realizar un programa en java que: convierta todos los caracteres de una cadena de caracteres en minúscula. Mostrar por consola la prueba de que funciona.
    public static void ejercicio16() {
        System.out.println("\nEste es el resultado del ejercicio # 16 ");
        String cadena3 = "HOLA MUNDO";
        System.out.println("convertimos la frase " + cadena3 + " en minuscule: " + cadena3.toLowerCase());
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    //17)Algoritmo que lea 4 números, calculando y escribiendo el valor de su suma, resta, multiplicación.
    public static void ejercicio17() {
        System.out.println("\nEste es el resultado del ejercicio # 17 ");
        int numero1 = 10, numero2 = 20, numero3 = 30, numero4 = 40;
        System.out.println("El número 1 es = " + numero1);
        System.out.println("El número 2 es = " + numero2);
        System.out.println("El número 3 es = " + numero3);
        System.out.println("El número 4 es = " + numero4);
        System.out.println("El resultado de la suma de todos los números es = " + (numero1 + numero2 + numero3 + numero4));
        System.out.println("El resultado de la resta entre el (número 2 y el número 1) y luego el (número 4 y el número 3) es = " + ((numero2 - numero1) - (numero4 - numero3)));
        System.out.println("El resultado de la multiplicación de todos los números es = " + (numero1 * numero2 * numero3 * numero4));
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    //18)Mostrar la longitud de una cadena.
    public static void ejercicio18() {
        System.out.println("\nEste es el resultado del ejercicio # 18");
        String cadena = "Mauricio";
        System.out.println("La cadena [" + cadena + "] contiene " + cadena.length() + " caracteres");
        System.out.println("-----------------------------------------------------------------------------------------");
    }

}
