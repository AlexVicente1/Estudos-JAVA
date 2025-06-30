import java.util.Scanner;

public class ExercicioTreino2 {

        public static void main(String[] args) {
            var scanner = new Scanner(System.in);

            System.out.println("Informe seu nome:");
            var name = scanner.nextLine();

            System.out.println("Informe seu peso:(em kg)");
            int peso = scanner.nextInt();
            scanner.nextLine(); // limpa o buffer

            boolean dentroDoPeso = false;
            boolean foraDoPeso = false;

            if (peso >= 50 && peso <=100) {
                dentroDoPeso = true;
            } else {
                    foraDoPeso = true;
                }

                if (dentroDoPeso) {
                    System.out.printf("%s, você está dentro do peso!\n", name);
                }else {
                    System.out.printf("s%, você está fora do peso!\n", name);
                }


            System.out.println("Fim da execução.");
            scanner.close();
        }
    }
