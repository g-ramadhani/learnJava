import java.util.Scanner;

public class ReadDataFromKeyboard {
    public static void main(String[] args) {
        try (//Deklarasi & Inisialisasi
        Scanner scanner = new Scanner(System.in)) {
            String inputData;

            //Read Data from Keyboard
            System.out.printf("Nama Siswa : ");
            inputData = scanner.nextLine();
            System.out.printf("Data yang diisi dari keyboard adalah %s", inputData);
        }
    }
}