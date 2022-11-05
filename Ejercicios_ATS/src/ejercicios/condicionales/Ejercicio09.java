package ejercicios.condicionales;

import javax.swing.*;

public class Ejercicio09 {
    public static void main(String[] args) {

        //Hacer un programa que pida el dia, mes y año de una fecha e indicar si la fecha es correcta
        //suponiendo que todos los meses son de 30 dias.

        int dia, mes, año;

        JOptionPane.showMessageDialog(null,"!!Vamos a calcular si tu fecha de nacimineto es correcta!!");


        dia = Integer.parseInt(JOptionPane.showInputDialog("Dame el Día: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Dame el Mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Dame el Año: "));


        if (dia>=1 && dia <=31){
            if (mes >=1 && mes <=12){
                if (año >0 && año <= 2019){
                    JOptionPane.showMessageDialog(null,"La fecha es correcta :)");

                }else {
                    JOptionPane.showMessageDialog (null,"La fecha esta mal porque el año es incorrecto");
                }

            }else {
                JOptionPane.showMessageDialog (null,"La fecha esta mal porque el mes es incorrecto");
            }

        }else {
            JOptionPane.showMessageDialog(null,"La fecha esta mal porque el día es incorrecta");
        }
    }
}
