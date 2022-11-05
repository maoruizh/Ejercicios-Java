package nivel.basico.ejercicios;

public class B12Ciclos {
public static void main(String args []){
		
		int i = 0;
		System.out.println("");
		
		System.out.println("Serie con metodo for");
		for (i = 1; i <= 10; i++){
			if(i <10){
				System.out.print(i + ",");
			}else{
				System.out.println(i);
			}
		}
		i = 1;
		System.out.println("");
		
		
		System.out.println("Serie con metodo while");
		while (i <=10){
			if(i <10){
				System.out.print(i + ",");
			}else{
				System.out.println(i);
			}
			i ++;
		}		
		i = 1;
		System.out.println("");
		
		System.out.println("Serie con metodo Do-while");
		do {
			if(i <10){
				System.out.print(i + ",");
			}else{
				System.out.println (i);
			}
			i ++;
		}while (i <=10);
	}	

}
