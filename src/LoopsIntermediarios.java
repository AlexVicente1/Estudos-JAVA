import java.util.Scanner;

public class LoopsIntermediarios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        int totalAlunos = 5;

        for (int i = 1; i <= totalAlunos; i++) {
            System.out.println("Digite a nota do aluno");
            double nota = scanner.nextDouble();
            soma +=nota;
        }
        double media = soma / totalAlunos;
        System.out.println("A media do aluno é" + media);

    }
}

