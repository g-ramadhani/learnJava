import java.util.Scanner;

public class Penjumlahan {
    public static void main(String[] args) {
        
        //Deklarasi & Inisialisasi
        Scanner scanner = new Scanner(System.in);
        String bil1, bil2;
        int int1, int2;

        //Read Bilangan 1 from keyboard
        System.out.printf("Bilangan ke-1 : ");
        bil1 = scanner.nextLine();
        System.out.printf("Bilangan ke-1 adalah %s%n", bil1);

        //read Bilangan 2 from keyboard
        System.out.printf("%nBilangan ke-2 : ");
        bil2 = scanner.nextLine();
        System.out.printf("Bilangan ke-2 adalah %s%n", bil2);

        //Konversi srting bilangan ke integer
        int1 = Integer.parseInt(bil1);
        int2 = Integer.valueOf(bil2);
        int int3 = int1 + int2;

        //Penjumlahan
        System.out.printf("%nPenjumlahan Bilangan 1 + Bilangan 2%n");
        System.out.printf("%d + %d = %d%n", int1, int2, int3);
    }
}