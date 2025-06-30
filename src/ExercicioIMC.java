import java.util.Scanner;

public class ExercicioIMC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Coleta de dados
        System.out.println(" Informe seu nome");
        String nome = scanner.nextLine();

        System.out.println("Informe sua idade");
        int idade = scanner.nextInt();

        System.out.println(" Informe seu peso (em kg)");
        double peso = scanner.nextDouble();

        System.out.println("Informe sua altura (em metros ex:1.75)");
        double altura = scanner.nextDouble();

        // Calculo do IMC
        double imc = peso / (altura * altura);

        // Resultado aparece aqui!

        System.out.printf(" %s, %d anos, seu IMC é %.2f\n", nome, idade, imc);

        // Classificação

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc < 24.9) {
            System.out.println("Classificação : Peso Normal");
        } else if (imc < 29.9) {
            System.out.println("Classificação : Sobrepeso");
        } else if (imc < 34.9) {
            System.out.println("Classificação : Obesidade grau 1");
        } else if (imc <39.9) {
            System.out.println("Classificação : Obesidade grau 2");
        } else {
            System.out.println("Classificação : Obesidade grau 3 (morbida");
        }

        System.out.println("Fim da execução");
        scanner.close();

    }
}
