package com.maoruiz.EjerciciosGeekipedia.NivelBasico.Ejercicios;
import javax.swing.*;
public class B23Ventana2Textos extends JFrame{

	public static void main (String Args []){
		B23Ventana2Textos Saludo = new B23Ventana2Textos ();
		Saludo.setBounds (0, 0, 300, 200);
		Saludo.setVisible (true);
		Saludo.setLocationRelativeTo(null);
		Saludo.setResizable(false);
	}
	private JLabel Saludo;
	
	private JLabel Saludo2;
	
	public B23Ventana2Textos(){
		setLayout(null);
		Saludo = new JLabel("Hola mi amor, te amo mucho!!");
		Saludo.setBounds (50, 20, 400, 20);
		add(Saludo);
		
		Saludo2 = new JLabel("Como me ves pues?? :)");
		Saludo2.setBounds (60, 40, 400, 20);
		add(Saludo2);
	}
}

