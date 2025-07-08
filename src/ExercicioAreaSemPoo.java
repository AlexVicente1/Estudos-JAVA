import java.util.Scanner;

public class ExercicioAreaSemPoo {

    // Classe interna COM metodo de area! Mas eu coloquei ela aqui de novo pra fica mais uniforme! Mas da pra criar uma subclasse e importar ela também!
    public static class TrianguloPoo {
        public double a;
        public double b;
        public double c;

        public double area() {
            double p = (a + b + c) / 2.0;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
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

        double areaX = x.area();
        double areaY = y.area();

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
