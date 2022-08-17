import java.util.Scanner;

public class ReadDataFromKeyboard1 {
    public static void main(String[] args) {
        try (//Deklarasi & Inisialisasi
        Scanner scanner = new Scanner(System.in)) {
            String inputData, studentName;
            byte studentAge;
            short numberOfIsland; // 16771
            int totalPopulation;  // 279752361
            long worldPopulation; // 7900000000
            float studentIndex;
            double idrExchange;    // 14500

            //Read string Data from Keyboard
            System.out.printf("Nama Siswa : ");
            studentName = scanner.nextLine();
            System.out.printf("Data yang diisi dari keyboard adalah %s%n", studentName);

            //Read byte Data from Keyboard
            System.out.printf("%nUmur Siswa : ");
            inputData = scanner.nextLine();
            studentAge = Byte.parseByte(inputData);
            System.out.printf("Data yang diisi dari keyboard adalah %d%n", studentAge);

            //Read short Data from Keyboard
            System.out.printf("%nJumlah Pulau Indonesia : ");
            inputData = scanner.nextLine();
            numberOfIsland = Short.parseShort(inputData);
            System.out.printf("Data yang diisi dari keyboard adalah %,d%n", numberOfIsland);

            //Read int Data from Keyboard
            System.out.printf("%nJumlah Populasi Indonesia : ");
            inputData = scanner.nextLine();
            totalPopulation = Integer.parseInt(inputData);
            System.out.printf("Data yang diisi dari keyboard adalah %,d%n", totalPopulation);

            //Read long Data from Keyboard
            System.out.printf("%nJumlah Populasi Dunia : ");
            inputData = scanner.nextLine();
            worldPopulation = Long.parseLong(inputData);
            System.out.printf("Data yang diisi dari keyboard adalah %,d%n", worldPopulation);

            //Read float Data from Keyboard
            System.out.printf("%nIPK Siswa : ");
            inputData = scanner.nextLine();
            studentIndex = Float.parseFloat(inputData);
            System.out.printf("Data yang diisi dari keyboard adalah %.2f%n", studentIndex);

            //Read double Data from Keyboard
            System.out.printf("%nNilai tukar USD -> IDR : ");
            inputData = scanner.nextLine();
            idrExchange = Double.parseDouble(inputData);
            System.out.printf("Data yang diisi dari keyboard adalah %,.2f%n", idrExchange);
        }
    }
}