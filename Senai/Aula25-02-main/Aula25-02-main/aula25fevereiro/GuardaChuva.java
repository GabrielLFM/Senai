package aula25fevereiro;

import java.util.Scanner;

public class GuardaChuva {

	public static void main(String[] args) {
		// Tabela-verdade do operador OR
				System.out.println("Tabela-verdade do Operador AND");
				System.out.println("Chovendo    | Previsão Chuva | Levar Guarda-chuva?");
				System.out.println("true        | true           | " + (true || true));
				System.out.println("true        | false          | " + (true || false));
				System.out.println("false       | true           | " + (false || true));
				System.out.println("false       | false          | " + (false || false));
				System.out.println();
				
				// Entrada do usuario
				Scanner sc = new Scanner(System.in);
				System.out.println("Está Chovendo agora? (true/false): ");
				boolean chovendo = sc.nextBoolean();
				System.out.println("A previsão indica chuva? (true/false): ");
				boolean previsaoChuva = sc.nextBoolean();
				
				// Processamento
				
				boolean levarGuardaChuva = chovendo || previsaoChuva;  // Condição de atravessar o semáforo
				
				// Saída
				System.out.println("Devo levar o Guarda-Chuva?  " + levarGuardaChuva);
				sc.close();



	}

}
