package poo1;

import javax.swing.*;

public class Profesor extends Persona{
    public String materia;

    public Profesor(String cedula, String nombre, String apellido, int edad, String genero) {
        super(cedula, nombre, apellido, edad, genero);
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null, "Profesor \nNombre: "+getNombre()+"\nApellido: " +
                ""+getApellido()+"\nEdad: "+getEdad()+"\nGenero: "+getGenero()+"\nCedula: "+getCedula()+"\nMateria dictada: "+getMateria());
    }
}
