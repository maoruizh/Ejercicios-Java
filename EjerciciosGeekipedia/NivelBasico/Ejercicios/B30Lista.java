package com.maoruiz.EjerciciosGeekipedia.NivelBasico.Ejercicios;

import javax.swing.*;
import java.awt.event.*;

public class B30Lista extends JFrame  implements ItemListener{
	
	public static void main (String Args []){
		B30Lista Formulario = new B30Lista ();
		Formulario.setBounds (0, 0, 300, 200);
		Formulario.setVisible (true);
		Formulario.setLocationRelativeTo(null);
		Formulario.setResizable(false);		
	}	
	private JButton boton1;
	
	private JComboBox combo1;

	public B30Lista (){
		setLayout (null);
		
		combo1 = new JComboBox();
		combo1.setBounds(10,10,80,20);
		add (combo1);
		
		boton1 = new JButton("Cerrar");
		boton1.setBounds (100,10,80,20);
		add (boton1);
		//Boton1.addActionListener (this); no logro activar que funcione el boton de cerrar porque es con action listener y no me deja tener los dos al mismo tiempo
		
		combo1.addItem("Rojo");
		combo1.addItem("Verde");
		combo1.addItem("Azul");
		combo1.addItem("Amarillo");
		combo1.addItem("Negro");
		
		combo1.addItemListener(this);
	}
	
	//programar el lugar donde vamos a crear el evento
	public void itemStateChanged(ItemEvent e){
		
		if (e.getSource () == combo1){
			String Seleccion = combo1.getSelectedItem().toString();
			setTitle (Seleccion);
		}
		
		if (e.getSource() == boton1){
			System.exit (0);
		}
	}	
}