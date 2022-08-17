import java.util.Locale;
import java.util.Scanner;

/**
 * Lesson04Exercise2
 */
public class Lesson04Exercise22022S3020 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] ascii = {0x221A, 0x00B2, 0x2502, 0x002F, 0x2500, 0x005F, 0x2518, 0x2514, 0x00A0};
        double sisiDatar, sisiTegak, sisiMiring;

        System.out.printf("%nProgram menghitung sisi miring Segitiga siku-siku (Pythagoras)%n");
        System.out.printf("%n%9c%c%n", ascii[3], ascii[2]);
        System.out.printf("%8c%2c%n", ascii[3], ascii[2]);
        System.out.printf("%7c%3c%n", ascii[3], ascii[2]);
        System.out.printf("%6c%4c%n", ascii[3], ascii[2]);
        System.out.printf("%cc%3c%5c%2cb%n", ascii[8], ascii[3], ascii[2], ascii[8]);
        System.out.printf("%4c%6c%n", ascii[3], ascii[2]);
        System.out.printf("%3c%7c%n", ascii[3], ascii[2]);
        System.out.printf("%2c%c%c%c%c%c%c%c%c%n", ascii[8], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[6]);
        System.out.printf("%-5ca%n",ascii[8]);

        System.out.printf("%6c%c%c%c%c%c%c%c%n", ascii[5], ascii[5], ascii[5], ascii[5], ascii[5], ascii[5], ascii[5], ascii[5]);
        System.out.printf("c = %c a%c + b%c%n", ascii[0], ascii[1], ascii[1]);
        System.out.printf("a = Sisi datar%n");
        System.out.printf("b = Sisi tegak%n");
        System.out.printf("c = Sisi miring%n");

        System.out.printf("%nMasukkan sisi datar : ");
        sisiDatar = scanner.nextDouble();
        System.out.printf("Masukkan sisi tegak : ");
        sisiTegak = scanner.nextDouble();

        sisiMiring = Math.sqrt((sisiDatar * sisiDatar)+(sisiTegak *sisiTegak));
        System.out.printf("Perhitungan sisi miring%n");
        System.out.printf("%6c%c%c%c%c%c%c%c%c%c%c%c%c%c%n", ascii[5], ascii[5], ascii[5], ascii[5], ascii[5], ascii[5], ascii[5], ascii[5], ascii[5], ascii[5], ascii[5], ascii[5], ascii[5], ascii[5]);
        System.out.printf("c = %c %.0f%c + %.0f%c%n", ascii[0], sisiDatar, ascii[1], sisiTegak, ascii[1]);
        System.out.printf(new Locale("in","ID"),"c = %.2f%n", sisiMiring);
    }
}