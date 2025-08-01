package Problemas_Lopal;

import java.util.Scanner;

public class Problema_piso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double l, c, p, a, cost;
		
		System.out.println("Digite a largura:");
		l = sc.nextDouble();
		
		System.out.println("Digite o comprimento:");
		c = sc.nextDouble();
		
		System.out.println("Digite o preço:");
		p = sc.nextDouble();
		
		a = l * c;
		System.out.printf("A área é: %.2f %n",a);
		
		cost = a * p;
		System.out.printf("O valor total é: %.2f %n",cost);
		
		sc.close();
		

	}

}
