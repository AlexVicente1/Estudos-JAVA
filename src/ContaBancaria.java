import java.util.Scanner;

public class ContaBancaria {

    String titular;
    double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.printf("Depósito de R$ %.2f realizado.\n", valor);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor; // 👈 corrigido aqui!
            System.out.printf("Saque de R$ %.2f realizado.\n", valor);
        } else {
            System.out.println("Saldo Insuficiente.\n");
        }
    }

    public void exibirSaldo() {
        System.out.printf("Titular: %s\n", titular);
        System.out.printf("Saldo atual: R$ %.2f\n", saldo);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria("Leonardo");
        System.out.println("Bem-vindo, " + conta.titular + "!");

        boolean executando = true;

        while (executando) { // 👈 com chaves!
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Exibir saldo");
            System.out.println("0 - Sair");
            System.out.print("Opção: "); // 👈 print sem quebra de linha

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a ser depositado:");
                    double deposito = scanner.nextDouble();
                    conta.depositar(deposito);
                    break;
                case 2:
                    System.out.println("Digite o valor para sacar:");
                    double saque = scanner.nextDouble();
                    conta.sacar(saque);
                    break;
                case 3:
                    conta.exibirSaldo();
                    break;
                case 0:
                    executando = false;
                    System.out.println("Saindo da Operação...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();
    }
}


