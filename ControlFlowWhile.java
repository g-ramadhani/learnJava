import java.util.Scanner;

public class ControlFlowWhile {
    public static void main(String[] args) {
        //Deklarasi & Inisialisasi
        Scanner scanner = new Scanner(System.in);
        String inputData;
        int i=0, counter;

        //Read data from keyboard
        System.out.printf("Isi suatu angka : ");
        inputData = scanner.nextLine();
        counter = Integer.parseInt(inputData);

        System.out.printf("%nSebelum While........%n");
        while (i < counter) 
        {
            System.out.printf("di dalam block while i : %d%n", (i+1));
            i++;    
        }
        System.out.printf("Setelah while........%n");
    }
}
