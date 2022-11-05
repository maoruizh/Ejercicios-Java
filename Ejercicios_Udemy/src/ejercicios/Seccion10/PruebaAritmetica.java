package ejercicios.Seccion10;

public class PruebaAritmetica {
    public static void main(String[] args) {
        //creamos un objeto de la clase aritmetica
        Aritmetica aritmetica1 = new Aritmetica();

        //Lllamamos al metodo sumar y recibimos el valor devuelto

        int resultado = aritmetica1.sumar(5,3);
        System.out.println("resultado = " + resultado);
    }
}
