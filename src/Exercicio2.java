import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        var name = scanner.nextLine();

        System.out.println("Informe sua idade:");
        var age = scanner.nextInt();
        scanner.nextLine(); // limpa o buffer

        boolean isEmancipated = false;
        if (age == 16) {
            System.out.println("Você é emancipado? (s/n)");
            isEmancipated = scanner.nextLine().equalsIgnoreCase("s");
        }

        boolean podeDirigir = false;

        if (age >= 18 && age <= 80) {
            podeDirigir = true;
        } else if (age == 16 && isEmancipated) {
            podeDirigir = true;
        }

        if (podeDirigir) {
            System.out.printf("%s, você pode dirigir.\n", name);
        } else {
            System.out.printf("%s, você não pode dirigir.\n", name);
        }

        System.out.println("Fim da execução.");
        scanner.close();
    }
}



