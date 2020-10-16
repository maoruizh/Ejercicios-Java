package com.maoruiz.EjerciciosGeekipedia.NivelBasico.Ejercicios;

import javax.swing.*;
import java.awt.event.*;
public class B27AreaTexto extends JFrame implements ActionListener{
	
	public static void main (String Args []){
		B27AreaTexto Formulario = new B27AreaTexto ();
		Formulario.setBounds (0, 0, 500, 500);
		Formulario.setVisible (true);
		Formulario.setLocationRelativeTo(null);
		Formulario.setResizable(false);
	}
	private JButton boton;
	private JTextField caja;
	private JLabel etiqueta;
	private JTextArea notas;
	
	private JScrollPane scroll;
	
	public B27AreaTexto(){
		setLayout (null);
		
		etiqueta = new JLabel("Usuario");
		etiqueta.setBounds (10, 10, 100, 30);
		add(etiqueta);
		
		caja = new JTextField (); 
		caja.setBounds (170, 10, 300, 30); 
		add(caja);
		caja.addActionListener (this);
		
		notas = new JTextArea ("Escribe aca......"); 
		scroll = new JScrollPane (notas);
		scroll.setBounds (10, 50, 470, 350); 
		add(scroll);
		
		boton = new JButton ("Cerrar"); 
		boton.setBounds (10, 410, 120, 30); 
		add(boton);
		boton.addActionListener (this);
	}
	
	public void actionPerformed (ActionEvent e){
		if (e.getSource() == caja){
			String texto = caja.getText (); 
			setTitle (texto);
		}	
		if (e.getSource() == boton){
			System.exit (0);
		}	
	}
}