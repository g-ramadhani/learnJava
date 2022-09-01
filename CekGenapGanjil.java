import java.util.Scanner;

public class CekGenapGanjil {
    public static void main (String[] args){
        String divider = "-------------------------------------";
        String hasil;
        int angka;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Program Cek Bilangan Ganjil dan Genap");
            System.out.println(divider);
            System.out.print("Masukkan bilangan yang ingin di cek : ");
            angka = scanner.nextInt();
        }

        if (angka%2 == 1) {
            hasil = "Ganjil";
        }
        else{
            hasil = "Genap";
        }

        System.out.printf("%nBilangan %d merupakan bilangan %s", angka, hasil);
    }
    
}
