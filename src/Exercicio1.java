import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        // Criar a tela que irá ler os dados do teclado
        Scanner scanner = new Scanner (System.in);

        // Solicitar o nome do Amigo
        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();

        // Solicitar a idade do Amigo
        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        //Tela que vai exibir a mensagem formatada
        System.out.printf("Olá %s. você tem %d anos.\n",nome,idade);

    }
}
