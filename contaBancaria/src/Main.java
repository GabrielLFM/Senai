import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria();

         while(conta.getOpc()!= 4) {

            System.out.printf("Bem Vindo ao Banco!! %n 1-Depositar %n 2-Sacar %n 3-Ver Saldo %n 4-Sair %n Sua escolha:");
            conta.setOpc(sc.nextInt());

            if (conta.getOpc() == 1) {
                System.out.printf("Você escolheu depositar %n Quanto vai depositar?");
                conta.setDeposito(sc.nextDouble());
                conta.setSaldo(conta.getSaldo() + conta.getDeposito());
            }
            if (conta.getOpc() == 2) {
                System.out.printf("Você escolheu sacar %n Quanto vai sacar?");
                conta.setSaque(sc.nextDouble());
                if (conta.getSaldo() < conta.getSaque()) {
                    System.out.println("Você não pode sacar mais do que tem");
                }
                else {
                    System.out.println("Saque realizado com sucesso!");
                    conta.setSaldo(conta.getSaldo() - conta.getSaque());
                }
            }

            if (conta.getOpc() == 3) {
                System.out.printf("Você escolheu ver se saldo %n Seu saldo é: " + conta.getSaldo() + "%n");

            }

            if (conta.getOpc() == 4) {
                System.out.println("Saindo...");
                break;
            }

        }

    }
}