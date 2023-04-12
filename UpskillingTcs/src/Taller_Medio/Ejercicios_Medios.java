package Taller_Medio;

import java.util.Scanner;

public class Ejercicios_Medios {
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
    }

    //1)Convertir una frase a mayúsculas o minúsculas, que daremos opción a que el usuario lo pida y mostraremos el resultado por pantalla.
    public static void ejercicio1() {
        System.out.println("\nEste es el resultado del ejercicio # 1");
        String frase = "\"Que taller tan carnudo y bueno para aprender\"";
        Scanner tipoDeLetra = new Scanner(System.in);
        System.out.print("Quieres ver la frase en MAYUSCULA o minuscula?: ");
        String busqueda = tipoDeLetra.nextLine();
        if (busqueda.equals("minuscula")) {
            System.out.println(frase.toLowerCase());
        } else System.out.println(frase.toUpperCase());
        // este ejercicio está medio bueno porque si se coloca una letra o frase diferente a las que estable no funciona bien.
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    //2)Pedir dos palabras por teclado, indicar si son iguales.
    public static void ejercicio2() {
        System.out.println("\nEste es el resultado del ejercicio # 2");
        Scanner sc = new Scanner(System.in);
        System.out.print("Vamos a comparar dos nombres, por favor introduce el primer nombre: ");
        String nombre1;
        nombre1 = sc.nextLine();
        System.out.print("Por favor introduce el segundo nombre: ");
        String nombre2;
        nombre2 = sc.nextLine();

        System.out.println("El primer nombre es [" + nombre1 + "] y el segundo nombre es [" + nombre2 + "]");
        if (nombre1.equals(nombre2)) {
            System.out.println("Entonces los dos nombres son iguales"); //No está funcionando bien
        } else System.out.println("Entonces los dos nombres son diferentes");
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    //3)Dada una cadena, extraer la cuarta y quinta letra usando el método substring.
    public static void ejercicio3() {
        System.out.println("\nEste es el resultado del ejercicio # 3");
        Scanner pedirNombre = new Scanner(System.in);
        System.out.print("Por favor digita un nombre que contenga 5 o mas letras: ");
        String cadena1 = pedirNombre.nextLine();
        System.out.println("la cuarta y quinta letra del nombre [" + cadena1 + "] son: " + cadena1.substring(3, 5));// no sé por qué con el 4 no muestra la i pero con el 5 si
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    //4)Crea un vector con un tamaño de 5, asígnale los valores numéricos manualmente (los que tú quieras) y muéstralos por pantalla.
    public static void ejercicio4() {
        System.out.println("\nEste es el resultado del ejercicio # 4");
        int numerosEnteros[] = {40, 35, 28, 25, 37};
        for (int i = 0; i < numerosEnteros.length; i++) {
            System.out.println("Después de crear un arreglo con 5 posiciones, los valores del arreglo son: " + numerosEnteros[i]);
        }
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    //5)Modifica el ejercicio anterior para que insertes los valores numéricos con leer mediante un for y los muestre por pantalla.
    public static void ejercicio5() {
        System.out.println("\nEste es el resultado del ejercicio # 5");
        int numbers[] = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        for (int x : numbers) {
            System.out.print("[" + x + "]");
        }
        System.out.println("\n-----------------------------------------------------------------------------------------");
    }

    //6)Crea un vector con un tamaño de 10, inserta los valores numéricos que desees de la manera que quieras y súmalos. Luego muestra por pantalla los valores.
    public static void ejercicio6() {
        System.out.println("\nEste es el resultado del ejercicio # 6");
        int arreglo[] = {40, 35, 28, 25, 37, 22, 54, 98, 12, 23};
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        }
        System.out.println("El resultado de la suma de todos los números del arreglo es = " + suma);
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    //7)Buscar un elemento dentro de un vector que nosotros le pedimos por teclado. Indicar las posiciones donde se encuentra.
    //Y si no se encuentra, imprimir el mensaje ”no se encuentra en valor ingresado”
    public static void ejercicio7() {
        System.out.println("\nEste es el resultado del ejercicio # 7");
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Por favor ingresa un numero para buscarlo en el arreglo: ");
        int busqueda1;
        busqueda1 = sc1.nextInt();

        int vector[] = new int[]{3, 25, 39, 54};
        boolean encontro = false;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == (busqueda1)) {
                System.out.println("Se encontró el numero ingresado dentro del arreglo y esta en la posición: " + i);
                encontro = true;
            }
        }
        if (encontro == false) {
            System.out.println("No se encontró el numero ingresado dentro del arreglo");
        }
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    //8)Crea dos vectores que tengan el mismo tamaño (lo pedirá por teclado), en uno de ellos almacenaras nombres de personas como cadenas, en el otro vector ira almacenando la longitud de los nombres.
    //Muestra por pantalla el nombre y la longitud que tiene. Puedes usar funciones si lo deseas.
    //(Una función es un subprograma que acepta parámetros y devuelve un único resultado Los parámetros serán los datos de entrada para realizar la función.
    //En la cabecera de la función se debe indicar los parámetros formales, indicando su tipo, y el tipo de valor que devolverá la función.
    //También debemos declarar las variables que se vayan a usar y devolver un valor, que corresponda al tipo de variable).
    public static void ejercicio8() {
        System.out.println("\nEste es el resultado del ejercicio # 9");
        Scanner leer = new Scanner(System.in);
        System.out.print("Por favor introduce el tamaño con el que quisieras crear dos vectores: ");
        int tam = leer.nextInt();
        String[] nombres = new String[tam];
        int[] longitudes = new int[tam];
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Por favor dame el nombre #" + (i + 1) + " :");
            nombres[i] = leer.next();
            longitudes[i] = nombres[i].length();
        }
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("El Nombre es: " + nombres[i] + " y su Longitud es: " + longitudes[i]);
        }
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    //9)Imprimir la posición de todos los elementos mayores a cinco de un vector.
    public static void ejercicio9() {
        System.out.println("\nEste es el resultado del ejercicio # 9");
        int vector1[] = {1, 3, 5, 9, 15, 26, 45, 4, 44, 10};
        System.out.println("Después de leer todos los valores del arreglo, solo imprimiremos los valores mayores a 5");
        for (int i = 0; i < vector1.length; i++) {
            if (vector1[i] > 5) {
                System.out.println("El numero " + vector1[i] + " esta en la posición " + i);
            }
        }
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    //10)llenar un vector con los primeros 50 números impares.
    public static void ejercicio10() {
        System.out.println("\nEste es el resultado del ejercicio # 10");
        int impares[] = new int[25];
        int num = 1;
        System.out.println("Los números impares del 1 al 50 son: ");
        for (int i = 0; i < impares.length; i++) {
            impares[i] = num;
            num += 2;
            System.out.print("[" + impares[i] + "]");
        }
        System.out.println("\n-----------------------------------------------------------------------------------------");
    }

    //11)Pedir por teclado el tamaño de un vector de números y pedir los valores numéricos con los que se rellena. Los valores no se pueden repetir.
    //Mostrar el vector con los valores al final.
    public static void ejercicio11() {
        System.out.println("\nEste es el resultado del ejercicio # 11");
        Scanner leer1 = new Scanner(System.in);
        System.out.print("\"Por favor introduce el tamaño con el que quisieras crear un vector: ");
        int tam1 = leer1.nextInt();
        int[] tamaño = new int[tam1];
        for (int i = 0; i < tamaño.length; i++) {
            System.out.print("Por favor dame el valor #" + (i + 1) + " :");
            tamaño[i] = leer1.nextInt();
            for (int j = 0; j < i; j++) {
                if (tamaño[i] == tamaño[j]) {
                    System.out.println("El numero ya existe, ingresa uno diferente: ");
                    i--;
                }
            }
        }
        System.out.println("Los valores ingresados son: ");
        for (int i = 0; i < tamaño.length; i++) {
            System.out.print("[" + tamaño[i] + "]");
        }
        System.out.println("\n-----------------------------------------------------------------------------------------");
    }

    //12)Suponga un vector con N números enteros generados aleatoriamente y mostrados en pantalla, N debe ser un número impar,
    //mostrar en pantalla el valor que ocupa el centro del vector.
    public static void ejercicio12() {
        System.out.println("\nEste es el resultado del ejercicio # 12");
        Scanner leer2 = new Scanner(System.in);
        System.out.print("Por favor digita el tamaño que deseas para crear el arreglo, este debe ser un numero impar: ");
        int tamaño1 = leer2.nextInt();
        int Arreglo[] = new int[tamaño1];// ¿como hacer para que solo acepte números impares?

        for (int i = 0; i < Arreglo.length; i++) {
            Arreglo[i] = (int) (Math.random() * 10); //Ingresas datos aleatorios
            if (Arreglo[i] % 2 == 0) { //Preguntamos si el número en esa posición nos da residuo 0 quiere decir que es par
                int numeropos = Arreglo[i] + 1; // Como no queremos pares agregamos +1 y resulta un número impar
                Arreglo[i] = numeropos; // Devolvemos el valor cambiado al arreglo
            }
            System.out.print(+Arreglo[i] + " , "); //Imprimimos el arreglo
        }

        int numero = Arreglo[tamaño1 / 2]; // Nos devuelve el número en la posición en el centro del arreglo para eso se divide el tamaño entre 2
        System.out.print("\nEl número en el centro del arreglo es el: " + numero);
        System.out.println("\n-----------------------------------------------------------------------------------------");
    }

    //13)Suponga un vector con N notas de 0 a 20, calcule el promedio de aprobados y el promedio de los desaprobados e indique la cantidad de aprobados y desaprobados.
    public static void ejercicio13() {
        System.out.println("\nEste es el resultado del ejercicio # 13");
        int[] vector2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int aprobados = 0;
        int desaprobados = 0;
        int sumaAprobados = 0;
        int sumaDesaprobados = 0;
        for (int i = 0; i < vector2.length; i++) {
            if (vector2[i] >= 10) {
                aprobados++;
                sumaAprobados += vector2[i];
            } else {
                desaprobados++;
                sumaDesaprobados += vector2[i];
            }
        }
        System.out.println("El promedio de aprobados es: " + sumaAprobados / aprobados);
        System.out.println("El promedio de desaprobados es: " + sumaDesaprobados / desaprobados);
        System.out.println("La cantidad de aprobados es: " + aprobados);
        System.out.println("La cantidad de desaprobados es: " + desaprobados);
        System.out.println("\n-----------------------------------------------------------------------------------------");
    }

    //14)Teniendo la siguiente lista de números {2,5,8,10,12,25,3,7} escriba un programa en Java que me indique el valor del número mayor y su posición en la lista
    public static void ejercicio14() {
        System.out.println("\nEste es el resultado del ejercicio # 14 ");
        int numeros[] = {2, 5, 8, 10, 12, 25, 3, 7};
        // Asumir que el mayor es el primero
        int indiceDelMayor = 0;
        // Recorrer arreglo y ver si no es así
        // (comenzar desde el 1 porque el 0 ya lo tenemos contemplado arriba)
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > numeros[indiceDelMayor]) {
                indiceDelMayor = i;
            }
        }
        // Ahora podemos obtener el mayor usando la posición
        int mayor = numeros[indiceDelMayor];
        System.out.println("El numero mayor encontrado en el arregle es: " + mayor + " y se encuentra en la posición " + indiceDelMayor);
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    //15)Cree dos Arrays en Java, el primero con una lista de 5 nombres y el segundo con una lista de 5 números enteros.
    //Escriba el código que imprima en consola el valor de los 5 nombres acompañado de los 5 números así:
    //“primer nombre en lista tiene primer número en lista años
    public static void ejercicio15() {
        System.out.println("\nEste es el resultado del ejercicio # 15 ");
        String nombres[] = {"Mao", "Camilo", "Andres", "Laura", "Cata"};
        int numerosEnteros[] = {42, 35, 28, 25, 37};
        System.out.println(nombres[0] + " tiene " + numerosEnteros[0] + " años");
        System.out.println(nombres[1] + " tiene " + numerosEnteros[1] + " años");
        System.out.println(nombres[2] + " tiene " + numerosEnteros[2] + " años");
        System.out.println(nombres[3] + " tiene " + numerosEnteros[3] + " años");
        System.out.println(nombres[4] + " tiene " + numerosEnteros[4] + " años");
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
