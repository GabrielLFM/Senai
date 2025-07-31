package Aula04;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		
		double n1, n2, n3;
		
		System.out.println("Digite o primeiro número:");
		n1 = sc.nextDouble();
		
		System.out.println("Digite o segundo número:");
		n2 = sc.nextDouble();
		
		System.out.println("Digite o terceiro número:");
		n3 = sc.nextDouble();
		
		if (n1<n2 && n1<n3 && n2<n3) {
			System.out.println(n1 + " " + n2 + " " + n3);
		
		}else if (n1>n2 && n1<n3 && n2<n3) {
			System.out.println(n2 + " " + n1 + " " + n3);
		
		}else if (n1>n2 && n1>n3 && n2>n3) {
			System.out.println(n3 + " " + n2 + " " + n1);
		
		}else if (n1<n2 && n1<n3 && n2>n3 ) {
			System.out.println(n1 + " " + n3 + " " + n2);
		
		}else if (n1<n2 && n1>n3 && n2>n3) {
			System.out.println(n3 + " " + n1 + " " + n2);
		
		}else if (n1>n2 && n1>n3 && n2<n3) {
			System.out.println(n2 + " " + n3 + " " + n1);
		}
		
		sc.close();

	}

}
