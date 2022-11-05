package ejercicios.Seccion4;

public class Ejercicio16Char {
    public static void main(String[] args) {
        //char
        System.out.println("bits tipo char:" + Character.SIZE);
        System.out.println("bytes tipo char:" + Character.BYTES);
        System.out.println("valor minimo tipo char:" + Character.MIN_VALUE);
        System.out.println("valor maximo tipo char:" + Character.MAX_VALUE);



        char c = '\u0021';
        //char c = 33;  esta es otra forma de expresar el mismo caracer
        //char c = '!'; esta es otra forma de expresar el mismo caracer
        System.out.println("c = " + c);

    }
}
