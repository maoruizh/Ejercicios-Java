package Taller_Avanzado.Ejercicio_Cajero;

// Crear una clase llamada Cuenta que tendra los siguientes atributos: titular y cantidad (puede tener decimales)
//A) El titular será obligatorio y la cantidad es opcional. Para esto crea dos constructores que cumplan con lo anterior.
//B) Crear sus metodos, Get, Set y ToString:
//C) Este tendra los metodos especiales:
    //Ingresar (double cantidad): se ingresa una cantidad a la cuenta, si la cantidad es negativa, debera devolver un mensaje informando que
        // "el valor introducido es incorrecto". Si el valor a ingresar es positivo, el valor de la cuenta se debe actualizar.
    //Retirar (double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es negativo,
        // se debera mostrar un mensaje "fondos insuficientes"
//D) Crear la clase principal donde por consola le permita ingresar el nombre del titular e ingresar o retirar cantidad.

public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Cuenta(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Tu saldo actual es de: " + cantidad;
    }

    public void ingresar(double cantidadIngresada){
        if(cantidadIngresada <= 0){
            System.out.println("El valor introducido " + cantidadIngresada +" es incorrecto");
        }else{
            cantidad = cantidad + cantidadIngresada;
        }
    }

    public void retirar(double cantidadRetirada){
        if((cantidad-cantidadRetirada) < 0){
            System.out.println("Fondos insuficientes, en tu cuenta: " + titular);
        } else if (cantidadRetirada < 0) {
            System.out.println("Ingresa valores positivos por favor");
        } else{
            cantidad = cantidad - cantidadRetirada;
        }
    }
}
