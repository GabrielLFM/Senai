package Problemas_Lopal;

import java.util.Scanner;

public class Problema_quadro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double l, h, a, p, d;
		
		System.out.println("Digite a largura:");
		l = sc.nextDouble();
		
		System.out.println("Digite a altura:");
		h = sc.nextDouble();
		
		a = l * h;
		System.out.printf("A área é: %.4f %n",a);
		
		p = (l*2.0) + (h*2.0);
		System.out.printf("O perímetro é: %.4f %n",p);
		
		d = Math.sqrt(l*l+h*h);
		System.out.printf("A diagonal é: %.4f %n", d);
		
		sc.close();
		

	}

}
