package nivel.basico.ejercicios;

public class B13Ciclos2 {
public static void main (String args []){
		
		int i = 1, j =99;
		
		System.out.println("Serie con metodo for");
		for(i = 1; i <= 5; i++){
			if(i < 5){
				System.out.print (i + ",");
				System.out.print (j + ",");
			}else{
				System.out.print (i + ",");
				System.out.println (j);
			}
			j --;
	
		}System.out.println("");
		
		i = 1;
		j =99;
		System.out.println("Serie con metodo while");
		while (i <= 5){
			if (i <5){
				System.out.print (i + ",");
				System.out.print (j + ",");
			}else{
				System.out.print (i + ",");
				System.out.println (j);	
			}
			j --;
			i ++;
			
		}System.out.println("");
		
		i = 1;
		j =99;
		System.out.println("Serie con metodo Do-while");
		do{
			if (i <5){
				System.out.print (i + ",");
				System.out.print (j + ",");
			}else{
				System.out.print (i + ",");
				System.out.println (j);	
			}
			j --;
			i ++;
			
		}while(i <= 5);
	}

}
