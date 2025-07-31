package Aula04;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n1, n2;
		
		System.out.println("Digite o primeiro número:");
		n1 = sc.nextDouble();
		
		System.out.println("Digite o segundo número:");
		n2 = sc.nextDouble();
		
		if(n1 > n2) {
			System.out.println("O Primeiro número é maior");
			
		}else if(n1 < n2) {
			System.out.println("O Segundo número é maior");
		}
		
		sc.close();
	}

}
