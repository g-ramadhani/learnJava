import java.util.Scanner;

/**
 * Lesson04Exercise3
 */
public class Lesson04Exercise32022S3020 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] ascii = {0x221A, 0x00B2, 0x2500, 0x005F, 0x00A0};
        double a, b, c, x1, x2;

        System.out.printf("%nProgram persamaan kuadrat%n");
        System.out.printf("%nax%c + bx + c = 0%n", ascii[1]);
        System.out.printf("%12c%c%c%c%c%c%c%c%c%n", ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3]);
        System.out.printf("%5c-b + %c b%c - 4ac%n", ascii[4], ascii[0], ascii[1]);
        System.out.printf("x1 = %c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%n", ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2]);
        System.out.printf("%11c2a%n", ascii[4]);
        System.out.printf("%12c%c%c%c%c%c%c%c%c%n", ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3]);
        System.out.printf("%5c-b - %c b%c - 4ac%n", ascii[4], ascii[0], ascii[1]);
        System.out.printf("x2 = %c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%n", ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2]);
        System.out.printf("%11c2a%n", ascii[4]);

        System.out.printf("%nIsi nilai a,b, dan c%n");
        System.out.printf("a : ");
        a = scanner.nextDouble();
        System.out.printf("b : ");
        b = scanner.nextDouble();
        System.out.printf("c : ");
        c = scanner.nextDouble();

        x1 = ((-b + Math.sqrt((b * b)- (4 * a * c))) / (2 * a));

        System.out.printf("%12c%c%c%c%c%c%c%c%c%10c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%n", ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3]);
        System.out.printf("%5c-b + %c b%c - 4ac %2c-%.0f + %c %.0f%c - 4 x %.0f x %.0f%n", ascii[4], ascii[0], ascii[1], ascii[4], b, ascii[0], b, ascii[1], a, c);
        System.out.printf("x1 = %c%c%c%c%c%c%c%c%c%c%c%c%c%c%c = %c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%n", ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2]);
        System.out.printf("%11c2a%19c2 x %.0f%n", ascii[4], ascii[4], a);
        System.out.printf("x1 = %.2f%n",x1);

        x2 = ((-b - Math.sqrt((b * b)- (4 * a * c))) / (2 * a)); 

        System.out.printf("%12c%c%c%c%c%c%c%c%c%10c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%n", ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3], ascii[3]);
        System.out.printf("%5c-b - %c b%c - 4ac %2c-%.0f - %c %.0f%c - 4 x %.0f x %.0f%n", ascii[4], ascii[0], ascii[1], ascii[4], b, ascii[0], b, ascii[1], a, c);
        System.out.printf("x1 = %c%c%c%c%c%c%c%c%c%c%c%c%c%c%c = %c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%n", ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2], ascii[2]);
        System.out.printf("%11c2a%19c2 x %.0f%n", ascii[4], ascii[4], a);
        System.out.printf("x2 = %.2f%n",x2);
    }
}