package Aula04;

import java.util.Scanner;

public class Estrutura_condicionais {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade;
		System.out.println("Digite sua Idade:");
		idade = sc.nextInt();
		 
		if(idade > 59) {
			
			System.out.println("Idoso(a)");
	
		} else if (idade >= 18 && idade < 60) {
			
			System.out.println("Adulto(a)");
		
		} else if (idade >= 12 && idade < 18) {
			
			System.out.println("Adolescente");
			
		} else if (idade < 12) {
			System.out.println("Criança");
		}
		
		sc.close();

	}

}
