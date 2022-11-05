package nivel.basico.ejercicios;
import java.util.Scanner;

public class B16Login {
public static void main (String Args []){
		
		String usuario = ""; 
		String password = "";
		Scanner entrada = new Scanner(System.in);
		
		System.out.println ("");
		System.out.println ("*******************************");
		System.out.println ("* Bienvenidos al Login de Mao *");
		System.out.println ("*******************************");
		System.out.println ("");
		
		System.out.println ("Ingresa tu Nombre de usuario");
		usuario = entrada.nextLine();
		
		if(usuario.equals("PEPE")){
			System.out.println ("El nombre de usuario es correcto");
		}else{
			System.out.println ("El nombre de usuario es incorrecto");
		}
		System.out.println ("");
		System.out.println ("Ingresa tu Password");
		password = entrada.nextLine();
		
		if(password.equals ("123")){
			System.out.println ("El password es correcto");
		}else{
			System.out.println ("El password es incorrecto");
		}
		System.out.println ("");
		
		if(usuario.equals("PEPE") && password.equals ("123")){
			System.out.println ("Bienvenido tus datos de registro son correctos");
		}else{
			System.out.println ("Intentalo de nuevo");
		}
	}

}
