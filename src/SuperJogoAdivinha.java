import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SuperJogoAdivinha {

    private int numeroSecreto;
    private int maxTentativas;
    private ArrayList<Integer> palpites;

    public SuperJogoAdivinha(int limiteTentativas) {
        Random random = new Random();
        numeroSecreto = random.nextInt(10) + 1; // número de 1 a 10
        maxTentativas = limiteTentativas;
        palpites = new ArrayList<>();
    }

    public void jogar() {
        Scanner scanner = new Scanner(System.in);
        int tentativa = 0;
        boolean acertou = false;

        System.out.println("Bem-vindo ao Super Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número de 1 a 10");
        System.out.println("Você tem " + maxTentativas + " tentativas");

        while (tentativa < maxTentativas && !acertou) {
            System.out.print("Digite seu palpite: ");
            int palpite = scanner.nextInt();

            palpites.add(palpite);

            if (palpite < 1 || palpite > 10) {
                System.out.println("SEU TROUXA! É de 1 a 10");
                continue;
            }

            if (palpite < numeroSecreto) {
                System.out.println("É maior");
            } else if (palpite > numeroSecreto) {
                System.out.println("É menor");
            } else {
                System.out.println("Parabéns, você acertou!");
                acertou = true;
            }

            tentativa++;
        }

        if (!acertou) {
            System.out.println("Acabaram as tentativas! O número era: " + numeroSecreto);
        }

        System.out.println("Seus palpites foram: " + palpites);
    }

    public static void main(String[] args) {
        SuperJogoAdivinha jogo = new SuperJogoAdivinha(5);
        jogo.jogar();
    }
}

