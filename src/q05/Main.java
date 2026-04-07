import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String shape = sc.next().toLowerCase();
        double area = 0;

        switch (shape) {

            case "circle":
                double r = sc.nextDouble();
                area = Math.PI * r * r;
                break;

            case "rectangle":
                double l = sc.nextDouble();
                double w = sc.nextDouble();
                area = l * w;
                break;

            case "triangle":
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();

                double s = (a + b + c) / 2.0;
                area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                break;

            default:
                System.out.println("Invalid shape");
                return;
        }

        System.out.printf("Area: %.2f\n", area);

        sc.close();
    }
}
