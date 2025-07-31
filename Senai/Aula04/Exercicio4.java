package Aula04;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ano;
		
		System.out.println("Digite o ano:");
		ano = sc.nextInt();
		
		if (ano % 4 == 0) {
			System.out.println("Ele é bissexto");
			
		}else if (ano % 4 != 0) {
			System.out.println("Ele não é bissexto");
		}
		sc.close();

	}

}
