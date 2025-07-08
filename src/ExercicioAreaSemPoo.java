import java.util.Scanner;

public class ExercicioAreaSemPoo {

    // Classe interna
    public static class TrianguloPoo {
        public double a;
        public double b;
        public double c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TrianguloPoo x, y;
        x = new TrianguloPoo();
        y = new TrianguloPoo();

        System.out.println("Entre com as medidas do triângulo X:");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();

        System.out.println("Entre com as medidas do triângulo Y:");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();

        double p = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        System.out.printf("Área do triângulo X: %.4f%n", areaX);
        System.out.printf("Área do triângulo Y: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Triângulo X tem a maior área.");
        } else {
            System.out.println("Triângulo Y tem a maior área.");
        }

        scanner.close();
    }
}
