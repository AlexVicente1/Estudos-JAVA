import java.util.Scanner;

public class TelefoniaPlano {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dados fixos do plano!

        double valorPlano = 50.0;
        int franquiaMinutos = 100;
        double valorMinutoExtra = 2.0;

        // Entrada do usuario (aqui ele digita a quantidade de minutos que o trouxa gastou!kkkjjjj)

        System.out.println("Quantos minutos foram utilizados do plano?");
        int minutosUsados = scanner.nextInt();

        // Agora calculamos o valor a ser pago!

        double valorAPagar = valorPlano;

        if (minutosUsados > franquiaMinutos) {
            int minutosExcedidos = minutosUsados - franquiaMinutos;
            valorAPagar += minutosExcedidos * valorMinutoExtra;


        // Aqui mostra o valor que o trouxa gastou falando com a gatinha que mora em outro estado! kkkkjj
            System.out.printf("Valor a ser pago: R$ %.2f\n", valorAPagar);



    }
    }
}
