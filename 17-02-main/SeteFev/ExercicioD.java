package SeteFev;

import java.util.Scanner;

public class ExercicioD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double V, T, D, LU;
		
		System.out.println("Digite a velocidade:");
		V = sc.nextDouble();
		
		System.out.println("Digite o tempo gasto:");
		T = sc.nextDouble();
		
		D = T * V;
		System.out.printf("Distancia: %.2f%n",D);
		
		LU = D / 12;
		System.out.printf("Foram usados: %.2f%n",LU,"Litros");
		sc.close();

	}

}
