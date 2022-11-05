package ejercicios.Seccion5;

public class Ejercicio23OperadoresAsignacion {
    public static void main(String[] args) {
        //operador de asignacion
        int a = 3, b = 2;
        int c =a;
        System.out.println("c = " + c);

        //operador de composicion

        a += 1; // a = a + 1
        System.out.println("a = " + a);

        a += 3; // a = a + 3
        System.out.println("a = " + a);

        b -= 1;
        System.out.println("b = " + b);

        a *= 3;
        System.out.println("a = " + a);

        a /= 3;
        System.out.println("a = " + a);

        a %= 2;
        System.out.println("a = " + a);


    }
}
