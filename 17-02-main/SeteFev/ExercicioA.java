package SeteFev;

import java.util.Scanner;

public class ExercicioA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 double C, F;
		 
		 System.out.println("Digite a temperatura em Celsius:");
		 C = sc.nextDouble();
		 
		 F = (C*9/5) + 32;
		 
		 System.out.printf("Convertendo em Fahrenheit fica: %.2f%n", F);
		 sc.close();
		 

	}

}
