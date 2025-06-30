import java.math.BigDecimal;
import java.util.Scanner;

public class KmPlano {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dados de KM
        BigDecimal valorPlano = new BigDecimal("3500.00");
        int franquiaKm = 5000;
        BigDecimal valorKmExtra = new BigDecimal("0.60");

        // Entrada do usuário
        System.out.println("Quantos kms foram utilizados?");
        int kmUsados = scanner.nextInt();

        // Calcular valor
        BigDecimal valorApagar = valorPlano;

        if (kmUsados > franquiaKm) {
            BigDecimal kmExcedidos = BigDecimal.valueOf(kmUsados - franquiaKm);
            valorApagar = valorApagar.add(kmExcedidos.multiply(valorKmExtra));
        }

        // Mostrar resultado
        System.out.println("Valor a pagar: R$ " + valorApagar.setScale(2));
    }
}

