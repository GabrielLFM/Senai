package SeteFev;

import java.util.Scanner;

public class ExercicioF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A, B, C, D;
		
		System.out.println("Digite o valor de A:");
		A = sc.nextDouble();
		
		System.out.println("Digite o valor de B:");
		B = sc.nextDouble();
		
		C = B;
		System.out.println("A:"+C);
		
		D = A;
		System.out.println("B:"+D);
		sc.close();

	}

}
