import java.util.Scanner;

public class ExercicioTrapezio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double b, B, h, area;

        b = 8.0;
        B = 6.0;
        h = 9.0;

        area = (b + B) / 2.0 * h;

        System.out.println("O resultado da area é");
        System.out.println(area);
    }

}