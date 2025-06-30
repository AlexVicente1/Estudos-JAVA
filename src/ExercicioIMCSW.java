import java.util.Scanner;

public class ExercicioIMCSW {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Coleta de dados
        System.out.println("Informe seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Informe sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Informe seu peso (em kg):");
        double peso = scanner.nextDouble();

        System.out.println("Informe sua altura em metros (ex: 1.80):");
        double altura = scanner.nextDouble();

        // Cálculo do IMC
        double imc = peso / (altura * altura);

        // Classificação do IMC
        String classificacao;
        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc < 24.9) {
            classificacao = "Peso Normal";
        } else if (imc < 29.9) {
            classificacao = "Sobrepeso";
        } else if (imc < 34.9) {
            classificacao = "Obesidade grau 1";
        } else if (imc < 39.9) {
            classificacao = "Obesidade grau 2";
        } else {
            classificacao = "Obesidade grau 3";
        }

        // Saída
        System.out.printf("%s, %d anos, seu IMC é: %.2f\n", nome, idade, imc);
        System.out.println("Classificação: " + classificacao);

        System.out.println("Fim da execução.");
        scanner.close();
    }
}
