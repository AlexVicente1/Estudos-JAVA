import java.util.Scanner;

public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);

    System.out.println("Digite sua idade para entrar na Discoteca");
    int idade = scanner.nextInt();

    boolean autorizado;

    if(idade == 15) {
        autorizado = false;
    }
    else {
        autorizado = true;
    }
    if (autorizado && idade >=18) {
        System.out.println("Você esta autorizado a entrar na Discoteca");
    } else if (!autorizado) {
        System.out.println("Você não esta autorizado a entrar na Discoteca");
    } else {
        System.out.println("Você não tem idade suficiente");
    }




}