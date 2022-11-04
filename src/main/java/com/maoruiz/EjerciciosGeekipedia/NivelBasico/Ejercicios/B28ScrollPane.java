package com.maoruiz.EjerciciosGeekipedia.NivelBasico.Ejercicios;

import javax.swing.*;
import java.awt.event.*;
public class B28ScrollPane extends JFrame implements ActionListener{
	
	public static void main (String Args []){
		B28ScrollPane Formulario = new B28ScrollPane ();
		Formulario.setBounds (0, 0, 540, 500);
		Formulario.setVisible (true);
		Formulario.setLocationRelativeTo(null);
		Formulario.setResizable(false);
	}
	private JButton boton;
	private JButton boton1;
	private JTextField caja;
	private JTextArea notas;
	private JScrollPane scroll;
	
	String  texto = "";
	
	public B28ScrollPane(){
		setLayout (null);
		
		caja = new JTextField (); 
		caja.setBounds (10, 10, 200, 30); 
		add(caja);
	
		boton = new JButton("Agregar");
		boton.setBounds (250, 10, 100, 30);
		add(boton);
		boton.addActionListener (this);
		
		boton1 = new JButton("Cerrar");
		boton1.setBounds (10, 410, 120, 30);
		add(boton1);
		boton1.addActionListener (this);
	
		notas = new JTextArea (); 
		scroll = new JScrollPane (notas);
		scroll.setBounds (10, 50, 400, 300); 
		add(scroll);
	}
	
	public void actionPerformed (ActionEvent e){
		if (e.getSource() == boton){
			texto += caja.getText () + "\n"; 
			notas.setText (texto);
			caja.setText ("");
		}
		
		if (e.getSource() == boton1){
			System.exit (0);
		}	
	}
}
