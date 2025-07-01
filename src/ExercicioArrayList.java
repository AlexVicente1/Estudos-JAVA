import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioArrayList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        System.out.println("Digite 3 Nomes");

        for (int i = 0; i < 3; i++) {
            System.out.println("Nomes" + (i + 1) + ":");
            String nome = scanner.nextLine();
            nomes.add(nome);

        }
        System.out.println("Você Digitou");
        for (String nome : nomes) {
            System.out.println(nomes);


        }
    }
}