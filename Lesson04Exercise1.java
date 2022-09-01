import java.util.Scanner;

public class Lesson04Exercise1 {
    public static void main(String[] args) {
        int p, l, keliling, luas;

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Sisi panjang (p) : ");
        p = scanner.nextInt();
        System.out.printf("Sisi lebar   (l) : ");
        l = scanner.nextInt();

        System.out.printf("%nKeliling persegi panjang%n");
        System.out.println("= 2 x (p + l)");
        System.out.printf("= 2 x (%d + %d)%n", p, l);
        keliling = 2*(p+l);
        System.out.printf("= %d cm%n",keliling);

        System.out.printf("%nLuas persegi panjang%n");
        System.out.println("= p x l");
        System.out.printf("= %d x %d%n", p, l);
        luas = p*l;
        System.out.printf("= %d cm persegi%n",luas);
    }
}
