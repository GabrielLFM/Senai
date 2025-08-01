package SeteFev;

import java.util.Scanner;

public class ExercicioE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valor, taxa, P;
		int tempo;
		 
		System.out.println("Digite o valor do bem:");
		 valor = sc.nextDouble();
		 
		 System.out.println("Digite a taxa:");
		  taxa =  sc.nextDouble();
		  
		  System.out.println("Digite o tempo:");
		  tempo = sc.nextInt();
		  
		  P = valor+(valor*(taxa/100)*tempo);
		  
		  System.out.printf("O valor final fica: %.2f%n",P);
		  sc.close();
		  
			
		}

	}


