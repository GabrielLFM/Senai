package Aula02;

import java.util.Scanner;

public class Aula02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String texto = sc.next();
		
		int numero;
		numero = sc.nextInt();

		System.out.println(texto +" "+ numero);
		sc.close();

	}

}
