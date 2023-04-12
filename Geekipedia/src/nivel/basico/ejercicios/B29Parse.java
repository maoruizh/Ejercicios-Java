package nivel.basico.ejercicios;
import javax.swing.*;
import java.awt.event.*;
public class B29Parse extends JFrame implements ActionListener{
	
	public static void main (String Args []){
		B29Parse Formulario = new B29Parse ();
		Formulario.setBounds (0, 0, 350, 200);
		Formulario.setVisible (true);
		Formulario.setLocationRelativeTo(null);
		Formulario.setResizable(false);
	}
	private JButton boton1;
	private JButton boton2;
	private JTextField caja1;
	private JTextField caja2;
	private JLabel etiqueta1;
	private JLabel etiqueta2;
	
	private JLabel etiqueta3;
	
public B29Parse(){
	setLayout (null);
	
	etiqueta1 = new JLabel("Valor 1:");
	etiqueta1.setBounds (50, 5, 100, 30);
	add(etiqueta1);
	
	etiqueta2 = new JLabel("Valor 2:");
	etiqueta2.setBounds (50, 35, 100, 30);
	add(etiqueta2);
	
	etiqueta3 = new JLabel("Resultado:");
	etiqueta3.setBounds (120, 80, 250, 30);
	add(etiqueta3); 	
	
	caja1 = new JTextField (); 
	caja1.setBounds (120, 10, 150, 20); 
	add(caja1);
	
	caja2 = new JTextField (); 
	caja2.setBounds (120, 40, 150, 20); 
	add(caja2);

	boton1 = new JButton("Sumar");
	boton1.setBounds (10, 80, 100, 30);
	add(boton1);
	boton1.addActionListener (this);
	
	boton2 = new JButton("Cerrar");
	boton2.setBounds (10, 120, 100, 30);
	add(boton2);
	boton2.addActionListener (this);
}
	
	public void actionPerformed (ActionEvent e){
			if (e.getSource() == boton1){
				
				int valor1 = 0; 
				int valor2 = 0; 
				int resultado = 0;
				
				valor1 = Integer.parseInt (caja1.getText());
				valor2 = Integer.parseInt (caja2.getText());
				resultado = valor1 + valor2;
				etiqueta3.setText("El resultado es:   " + resultado);
			}
			
			if (e.getSource() == boton2){
				System.exit (0);
			}	
		}
}
