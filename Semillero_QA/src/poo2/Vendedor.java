package poo2;

import javax.swing.*;

public class Vendedor extends Persona1 {
    public String concesionario;

    public Vendedor(String nombre, String apellido, int numCedula, int edad, int celular) {
        super(nombre, apellido, numCedula, edad, celular);
    }

    public String getConcesionario() {
        return concesionario;
    }

    public void setConcesionario(String concesionario) {
        this.concesionario = concesionario;
    }

    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "vendedor \nNombre: " + getNombre() + "\nApellido: " + getApellido() + "\nNumero de cedula: " + getNumCedula() + "\n Edad: " + getEdad() + "\nCelular: " + getCelular() +
                "\nConcesionario: " + getConcesionario());
    }
}
