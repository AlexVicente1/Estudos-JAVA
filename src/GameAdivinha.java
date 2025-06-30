import java.util.Scanner;

public class GameAdivinha {

    // Aqui aprendi sobre while e loop!

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = 7; // número fixo para adivinhar
        int palpite = 0;

        System.out.println("Bem-vindo ao Jogo de Adivinhação do Leo!");
        System.out.println("Tente adivinhar o número de 1 a 10.");

        while (palpite != numeroSecreto) {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();

            if (palpite > 10) {
                System.out.println("SEU IDIOTA! É NO MÁXIMO ATÉ 10!");
            } else if (palpite < numeroSecreto) {
                System.out.println("É maior!");
            } else if (palpite > numeroSecreto) {
                System.out.println("É menor!");
            } else {
                System.out.println("Parabéns, você acertou!");
            }
        }
    }
}

