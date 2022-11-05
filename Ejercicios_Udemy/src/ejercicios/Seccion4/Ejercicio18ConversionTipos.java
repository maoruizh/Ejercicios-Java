package ejercicios.Seccion4;

import java.util.Scanner;

public class Ejercicio18ConversionTipos {
    public static void main(String[] args) {

        int edad = Integer.parseInt("20");
        System.out.println("Edad = " + edad);
        System.out.println();

        double valorPI = Double.parseDouble("3.1416");
        System.out.println("ValorPI = " + valorPI);

        //Esto se puede hacar con todos los tipos primitivos
        //parseLong, parseFloat, parseboolean etc...

        System.out.println();
        //Menos para char, pero si se puede convertir una cadena a un caracter pero usar solo un caracter de la cadena
        char Cha = "Hola".charAt(1);
        System.out.println("Cha = " + Cha);

        System.out.println();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Escribe tu edad");
        int edad1 = Integer.parseInt(scanner1.nextLine());
        System.out.println("edad1 = " + edad1);
        System.out.println();

        //Asi con cada uno de los tipos, podemos usar double, parsedouble, float, parsefloat
        // Para char como no tenemos un metodo que convierta a un tipo char, lo podemos hacer asi

        System.out.println("Escribe una frase");
        Scanner scanner2 = new Scanner(System.in);
        char caracter = scanner2.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
        System.out.println();

        //Para convertir un tipo primitivo a un tipo string se hace asi:
        String edadtexto = String.valueOf(25); // esto es un entero a un string
        System.out.println("edad texto = " + edadtexto);
        System.out.println();

        String valordepitexto = String.valueOf(valorPI);
        System.out.println("valor de pi texto = " + valordepitexto);
        System.out.println();

        //concepto de contexto string
        String valordepitexto2 = "" + valorPI;
        System.out.println("valor de pi texto = " + valordepitexto2);
        System.out.println();

        //conversion entre tipos primitivos
        byte b = 10;
        short s = b; // aca vemos que es correcto

        // cuando se desea convertir una tipo grande en un tipo pequeñ se debe de especificar el tipo al cual se desea convertir
        short s2 = 15;
        byte b2 = (byte) s2;

    }
}
