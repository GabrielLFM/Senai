package atividadeMiguel;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, resto;
		
		num = 1;
		
		resto = num % 2;
		
		while(num != 0) {
			
		System.out.println("Digite um número:");
			num = sc.nextInt();
		
			resto = num % 2;

			
		if(resto == 0) {
			System.out.println("O número " +num+ " é par");
		}else if (resto != 0) {
			System.out.println("O número " +num+ " é impar");
			
		  }
		
		}
		
       sc.close();

	}

}
