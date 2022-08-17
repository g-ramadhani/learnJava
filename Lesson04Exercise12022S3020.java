import java.util.Scanner;

/**
 * Lesson04Exercise1
 */
public class Lesson04Exercise12022S3020 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] ascii = {0x221A, 0x00B2, 0x2502, 0x250C, 0x2500, 0x2510, 0x2518, 0x2514, 0x00A0};
        double panjang, lebar, keliling, luas;

        System.out.printf("%nProgram menghitung Keliling dan Luas Persegi Panjang%n");
        System.out.printf("%n%4c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%n", ascii[3], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[5]);
        System.out.printf("%3c%-16c%c%n", ascii[8], ascii[2], ascii[2]);
        System.out.printf("%3c%-16c%-2cl%n", ascii[8], ascii[2], ascii[2]);
        System.out.printf("%3c%-16c%c%n", ascii[8], ascii[2], ascii[2]);
        System.out.printf("%4c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%n", ascii[7], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[6]);
        System.out.printf("%11cp%n", ascii[8]);

        System.out.printf("%nMasukkan sisi panjang (p) : ");
        panjang =scanner.nextDouble();
        System.out.printf("Masukkan sisi lebar   (l) : ");
        lebar = scanner.nextDouble();

        keliling = 2 * (panjang + lebar);
        System.out.printf("%nKeliling persegi panjang%n");
        System.out.printf("= 2 x (p + l)%n");
        System.out.printf("= 2 x (%.0f + %.0f)%n", panjang, lebar);
        System.out.printf("= %.0f cm%n",keliling);

        luas = panjang * lebar;
        System.out.printf("%nLuas persegi panjang%n");
        System.out.printf("= p x l%n");
        System.out.printf("= %.0f x %.0f%n", panjang, lebar);
        System.out.printf("= %.0f cm persegi%n",luas);
    }
}