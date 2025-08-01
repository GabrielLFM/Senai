package Problemas_Lopal;

import java.util.Scanner;

public class Problema_Altura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double h1, h2, hm;
		String n1, n2;
		
		System.out.println("Dados da Primeira pessoa:");
		System.out.println("Digite o Nome:");
		n1 = sc.nextLine();
		System.out.println("Digite a altura:");
		h1 = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.println("Dados da Segunda pessoa:");
		System.out.println("Digite o Nome:");
		n2 = sc.nextLine();
		System.out.println("Digite a Altura:");
		h2 = sc.nextDouble();
		
		hm = (h1 + h2) / 2.0;
		System.out.printf("A altura media entre "+n1+" e "+n2+" é: %.2f %n",hm);
		sc.close();

	}

}
