import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade para ter acesso aos livros raros!");
        int idade = scanner.nextInt();

        boolean autorizado;


        if (idade == 25) {
            autorizado = false;
        } else {
            autorizado = true;
        }

        if (autorizado && idade >= 18) {
            System.out.println("Acesso permitido");
        } else if (!autorizado) {
            System.out.println("Acesso negado");
        } else {
            System.out.println("Idade insuficiente");
        }

        scanner.close();
    }
}



