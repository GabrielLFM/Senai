package SeteFev;

import java.util.Scanner;

public class ExercicioC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double A, R, V;
        
        System.out.println("Digite o Raio:");
        R = sc.nextDouble();
        
        System.out.println("Digite a Altura:");
        A = sc.nextDouble();
        
        V = (3.14159*(R*R))*A;
        System.out.printf("O volume é: %.2f%n", V);
        sc.close();
	}

}
