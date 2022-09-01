import java.util.Scanner;

public class Variable2 {
    public static void main(String[] args) {
        try (//Declaration & Initialization
        Scanner scanner = new Scanner(System.in)) {
            int bil1 = 15;
            int bil2 = 10;
            double bil3 = 16;

            //Declaration
            int bil4;
            double bil5;
            String actorName;

            //Math Operation
            bil4 = bil1 + bil2;

            //Method return value
            bil5 = Math.sqrt(bil3);

            //read input from keyboard
            System.out.printf("Nama aktor : ");
            actorName = scanner.nextLine();

            System.out.printf("Menjumlahkan 2 bilangan %n");
            System.out.printf("%d + %d - %d%n",bil1,bil2,bil4);

            System.out.printf("%nMencari akar pangkat 2 suatu bilangan%n");
            System.out.printf("Akar pangkat 2 dari %.0f adalah %.0f%n", bil3,bil5);

            System.out.printf("Menampilkan nama aktor %s%n",actorName);
        }
    }
}
