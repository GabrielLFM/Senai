package Aula02;

import java.util.Scanner;

public class Dividir {

	public static void main(String[] args) {
		System.out.println("Digite dois numeros");
		Scanner sc = new Scanner(System.in);

		int x, y;
		x = sc.nextInt();
		y = sc.nextInt();
		
		int resultado;
		
		resultado = x / y;
		
		System.out.println("R:"+resultado);
		sc.close();

	}

}
