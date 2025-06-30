import java.util.Scanner;

public class ExercicioWhileFor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos visitantes vão tentar entrar?");
        int totalVisitantes = scanner.nextInt();

        int[] idades = new int[totalVisitantes];
        String[] resultados = new String[totalVisitantes];

        int i = 0;

        // WHILE começa aqui
        while (i < totalVisitantes) {
            System.out.println("Digite a idade do visitante #" + (i + 1) + ":");
            int idade = scanner.nextInt();
            idades[i] = idade;

            boolean autorizado;
            if (idade == 25) {
                autorizado = false;
            } else {
                autorizado = true;
            }

            if (autorizado && idade >= 18) {
                resultados[i] = "Acesso permitido";
            } else if (!autorizado) {
                resultados[i] = "Acesso negado";
            } else {
                resultados[i] = "Idade insuficiente";
            }

            i++; // INCREMENTA o contador do while
        }

        // FOR para mostrar o resultado DOS VISITANTES - fora do WHILE!
        System.out.println("\n===== Relatório de Visitantes =====");

        for (int j = 0; j < totalVisitantes; j++) {
            System.out.println("Visitante #" + (j + 1) + " (idade: " + idades[j] + "): " + resultados[j]);
        }

        scanner.close();
    }
}
