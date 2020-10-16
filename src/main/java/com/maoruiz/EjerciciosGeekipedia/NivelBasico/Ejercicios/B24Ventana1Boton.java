package com.maoruiz.EjerciciosGeekipedia.NivelBasico.Ejercicios;

import javax.swing.*; // librerias para las interfaces graficas, lleva el asterisco para incluirlas todas
import java.awt.event.*; // librerias para eventos o acciones a ejecutar.
public class B24Ventana1Boton extends JFrame implements ActionListener{
	
	public static void main (String Args []){ // Sirve para programar el diseño de la interfaz grafica
		B24Ventana1Boton SI = new B24Ventana1Boton ();
		SI.setBounds (0, 0, 300, 300);
		SI.setVisible (true);
		SI.setLocationRelativeTo(null);
		SI.setResizable(false);
	}
		
	private JButton SI; //Declarar el componente que deseamos ver en la interfaz grafica 
	
	public B24Ventana1Boton(){ // Este es el cosntructor para darle un diseño a la interfaz grafica, debe tener el mismo nombre de la clase
		setLayout(null); // Permite poner componentes por medio de coordenadas
		
		SI = new JButton ("Cerrar"); // Objeto con el texto del boton
		SI.setBounds (100, 20, 100, 20); // Son las coordenadas
		add(SI); // Sirve para agregar contenido al boton, sin el  no se veria el boton
		SI.addActionListener (this); // Esta es la funcionalidad o evento del boton.
	}
	
	public void actionPerformed (ActionEvent e){ // Esto es para poder capturar el evento
		if (e.getSource() == SI){
			System.exit (0); // Esto sirve para cerrar la interfaz grafica cuando se presione el boton
		}
	}
}