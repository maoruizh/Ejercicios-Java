package com.maoruiz.EjerciciosGeekipedia.NivelBasico.Ejercicios;

import javax.swing.*;
import java.awt.event.*;
public class B26CajaDeTexto extends JFrame implements ActionListener{
	
	public static void main (String Args []){
		B26CajaDeTexto Formulario = new B26CajaDeTexto ();
		Formulario.setBounds (0, 0, 500, 150);
		Formulario.setVisible (true);
		Formulario.setLocationRelativeTo(null);
		Formulario.setResizable(false);
	}
	private JButton boton;
	private JButton boton2;
	private JTextField caja;
	
	private JLabel etiqueta;
	
	public B26CajaDeTexto (){
		setLayout (null);
		
		etiqueta = new JLabel("Usuario:");
		etiqueta.setBounds (10, 10, 100, 30);
		add(etiqueta);
		
		caja = new JTextField (); 
		caja.setBounds (170, 17, 150, 20); 
		add(caja);
		
		boton = new JButton ("Aceptar"); 
		boton.setBounds (10, 70, 100, 20); 
		add(boton);
		boton.addActionListener (this);
		
		boton2 = new JButton ("Cerrar"); 
		boton2.setBounds (380, 70, 100, 20); 
		add(boton2);
		boton2.addActionListener (this);
	}
	
	public void actionPerformed (ActionEvent e){
		if (e.getSource() == boton){
			String texto = caja.getText (); 
			setTitle (texto);
		}	
		if (e.getSource() == boton2){
			System.exit (0);
		}	
	}
}