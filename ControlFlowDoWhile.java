import java.util.Scanner;

public class ControlFlowDoWhile {
    public static void main(String[] args) {
        //Deklarasi & Inisialisasi
        Scanner scanner = new Scanner(System.in);
        String inputData;
        int i=0, counter;

        //Read data from keyboard
        System.out.printf("Isi suatu angka : ");
        inputData = scanner.nextLine();
        counter = Integer.parseInt(inputData);

        System.out.printf("%nSebelum Do - While........%n");
        do
        {
            System.out.printf("di dalam block Do - while i : %d%n", (i+1));
            i++;    
        } while (i < counter);
        System.out.printf("Setelah Do - While........%n");
    }
}
