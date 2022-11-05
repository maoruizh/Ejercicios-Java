package ejercicios.Seccion5;

public class Ejercicio25OperadoresRelacionalesIgualdad {
    public static void main(String[] args) {
        int a= 3, b=3;
        boolean c = a == b;
        System.out.println("c = " + c);

        boolean d = a != b;
        System.out.println("d = " + d);

        //Para las cadenas no se usa el operador == por que es un objeto y no un tipo primitivo, para esto se usa
        //equals.
        String e = "Hola", f = "casa";
        boolean g = e.equals(f);
        System.out.println("g = " + g);

        //operadores relacionales
        boolean h = a < b;
        System.out.println("h = " + h);
        boolean i = a <= b;
        System.out.println("i = " + i);

        boolean j = a > b;
        System.out.println("j = " + j);
        boolean k = a >= b;
        System.out.println("k = " + k);

        if (a % 2 == 0)
        System.out.println("El numero es par");
        else
        System.out.println("El numero es impar");

        if (b % 2 != 0)
            System.out.println("El numero es impar");
        else
            System.out.println("El numero es par");

        int edad = 14;
        int adulto = 18;
        if (edad >= adulto)
            System.out.println("La persona es mayor de edad");
        else
            System.out.println("La persona es menor de edad");


    }
}
