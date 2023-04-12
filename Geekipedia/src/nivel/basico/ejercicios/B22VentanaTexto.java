package nivel.basico.ejercicios;

import javax.swing.*;

public class B22VentanaTexto extends JFrame{
	
	public static void main (String Args []){
		B22VentanaTexto Saludo = new B22VentanaTexto ();
		Saludo.setBounds (0, 0, 250, 150);
		Saludo.setVisible (true);
		Saludo.setLocationRelativeTo(null);
	}
	
	private JLabel Saludo;
	
	public B22VentanaTexto(){
		setLayout(null);
		Saludo = new JLabel("Hola mi amor, te amo mucho!!");
		Saludo.setBounds (30, 0, 300, 100);
		add(Saludo);
	}
}
