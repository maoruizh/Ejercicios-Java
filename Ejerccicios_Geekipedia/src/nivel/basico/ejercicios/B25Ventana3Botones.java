package nivel.basico.ejercicios;

import javax.swing.*;
import java.awt.event.*;
public class B25Ventana3Botones extends JFrame implements ActionListener {
	
	public static void main (String Args []){
		B25Ventana3Botones Formulario = new B25Ventana3Botones ();
		Formulario.setBounds (0, 0, 500, 300);
		Formulario.setVisible (true);
		Formulario.setLocationRelativeTo(null);
		Formulario.setResizable(false);
	}
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	private JButton boton4;
		
	private JLabel etiqueta;
	
	public B25Ventana3Botones (){
		setLayout (null);
		
		etiqueta = new JLabel("QUE DICE LA SUERTE PARA TI");
		etiqueta.setBounds (150, 20, 400, 20);
		add(etiqueta);
		
		boton1 = new JButton ("1"); 
		boton1.setBounds (100, 50, 100, 20); 
		add(boton1);
		boton1.addActionListener (this);
		
		boton2 = new JButton ("2"); 
		boton2.setBounds (200, 50, 100, 20); 
		add(boton2);
		boton2.addActionListener (this);
		
		boton3 = new JButton ("3"); 
		boton3.setBounds (300, 50, 100, 20); 
		add(boton3);
		boton3.addActionListener (this);
		
		boton4 = new JButton ("cerrar"); 
		boton4.setBounds (175, 150, 150, 20); 
		add(boton4);
		boton4.addActionListener (this);
		
	}
	
	public void actionPerformed (ActionEvent e){
		if (e.getSource() == boton1){
			etiqueta.setText ("SI VAS A PASEAR A EUROPA");
			etiqueta.setBounds (170, 100, 500, 20);
		}
		if (e.getSource() == boton2){
			etiqueta.setText ("TENDRAS UNA BEBE EN DICIEMBRE DE 2019");
			etiqueta.setBounds (120, 100, 500, 20);
		}	
		if (e.getSource() == boton3){
			etiqueta.setText ("GANARAS LA LOTERIA");
			etiqueta.setBounds (185, 100, 500, 20);
		}
		if (e.getSource() == boton4){
			System.exit (0);
		}	
	}
}