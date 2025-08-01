package SeteFev;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 double altura, peso, imc;
		 
		System.out.println("Digite a altura:");
		altura = sc.nextDouble();
		
		System.out.println("Digite o peso:");
		peso = sc.nextDouble();
		
		imc = peso/(altura*altura);
		System.out.printf("O IMC é: %.2f%n",imc," Kg/m²");
		
		
		if(imc>=32.4) {
			System.out.println("Obesidade Mórbida");
			return;
		}
		
		if(imc>=27.4) {
			System.out.println("Obesidade Moderada");
			return;
		}
		
		if(imc>=25.9) {
			System.out.println("Acima do peso");
			return;
		}
		
		if(imc>=19.1) {
			System.out.println("Peso Ideal");
			return;
		}
		
		if(imc<=19.1) {
			System.out.println("Abaixo do peso");
			return;
		}	
		
					
		}

	}


