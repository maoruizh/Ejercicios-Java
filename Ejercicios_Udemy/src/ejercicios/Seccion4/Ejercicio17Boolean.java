package ejercicios.Seccion4;

public class Ejercicio17Boolean {
    public static void main(String[] args) {

        //boolean

        System.out.println("true tipo boolean:" + Boolean.TRUE);
        System.out.println("false maximo tipo boolean:" + Boolean.FALSE);

        boolean booleanVar = true;
        if(booleanVar)
            System.out.println("La variable contiene un valor verdadero");
        else
            System.out.println("La variable contiene un valor falso");

        System.out.println();

        int edad = 23;
        boolean adulto = edad >= 18;
        if(adulto)
            System.out.println("Eres mayor de edad, puedes pasar");
        else
            System.out.println("Eres menor de edad, no puedes pasar");
    }
}
