package atividaderepetição;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     int i, num;
	     
	     System.out.println("Digite um número:");
	     num = sc.nextInt();
	     
	     for(i=1; i<=num; i++) {
	    	 
	    	 if(i % 2 == 0) {
	    		 
	    		 System.out.println("Os numeros pares são: " + i);
	    	 }
	    	 sc.close();
	    	 
	     }

	}

}
