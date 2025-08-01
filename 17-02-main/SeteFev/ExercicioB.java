package SeteFev;

import java.util.Scanner;

public class ExercicioB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double f, c;
		
		System.out.println("Digite a temperatura em Fahrenheit:");
		f = sc.nextDouble();
		
		c = ((f-32)*5) / 9;
		
		System.out.printf("Convertendo em Celsius fica: %.2f%n",c);
		sc.close();
		

	}

}
