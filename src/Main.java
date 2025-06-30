import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro número:");
        var value1 = scanner.nextInt();

        System.out.println("Informe o segundo número:");
        var value2 = scanner.nextInt();

        System.out.println("Escolha a operação");
        System.out.println("1 - Soma (+)");
        System.out.println("2 - Subtração (-)");
        System.out.println("3 - Multiplicação (*)");
        System.out.println("4 - Divisão (/)");

        int operacao = scanner.nextInt();

        switch (operacao) {
            case 1:
                System.out.printf("%d + %d = %d\n", value1, value2, value1 + value2);
                break;
            case 2:
                System.out.printf("%d - %d = %d\n", value1, value2, value1 - value2);
                break;
            case 3:
                System.out.printf("%d * %d = %d\n", value1, value2, value1 * value2);
                break;
            case 4:
                if (value2 != 0) {
                    System.out.printf("%d / %d = %.2f\n", value1, value2, (double) value1 / value2);
                } else {
                    System.out.println("Erro! DIVISÃO POR ZERO NÃO É PERMITIDA.");
                }
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }

        scanner.close();
    }
}







