package SeteFev;

import java.util.Scanner;

public class ExercicoH {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double c,l,a,volume;
		
		System.out.println("Digite o comprimento:");
		c = sc.nextDouble();
		
		System.out.println("Digite a largura:");
		l= sc.nextDouble();
		
		System.out.println("Digite a altura:");
		a= sc.nextDouble();
		
		volume = c*l*a;
		System.out.println("O volume da caixa é:"+ volume);
		sc.close();


	}

}
