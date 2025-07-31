package Aula04;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 double nota;
		 
		 System.out.println("Digite a Nota:");
		 nota = sc.nextDouble();
		 
		 if (nota >= 7) {	
			 System.out.println("Aprovado!!");
			 
		 }else if (nota < 7) ;
		 System.out.println("Reprovado");
		 
		sc.close();
		
	}

}
