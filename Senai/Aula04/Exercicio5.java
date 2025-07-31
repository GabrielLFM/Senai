package Aula04;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double numero;
		
		System.out.println("Digite o número:");
		numero = sc.nextDouble();
		
		if (numero > 0) {
		System.out.println("Ele é positivo");
		
		}else if (numero < 0) {
			System.out.println("Ele é negativo");
			
		}else if (numero == 0) {
			System.out.println("Ele é igual a zero");
		}
		
		sc.close();
		
	}

}
