package aula25fevereiro;

public class OperadorLogicoOu {

	public static void main(String[] args) {
		// Entrada
		
		int salario = 900; // declarar a variavel salário
		int idade = 19; // declarar a variavel idade
		boolean resultado; // declarar a variavel resultado

		// Processamento

		boolean emp_aprovado = (salario > 1000) || (idade > 18);

		resultado = (salario > 1000 || idade > 18)?true:false;

		// Saída

		System.out.println(emp_aprovado);
		System.out.println(resultado);

	}

}
