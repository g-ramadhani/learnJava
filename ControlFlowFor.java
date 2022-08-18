import java.util.Scanner;

public class ControlFlowFor {
    public static void main(String[] args) {
        //Deklarasi & Inisialisasi
        Scanner scanner = new Scanner(System.in);
        String inputData;
        int i, counter;

        //Read data from keyboard
        System.out.printf("Isi suatu angka : ");
        inputData = scanner.nextLine();
        counter = Integer.parseInt(inputData);

        System.out.printf("%nSebelum for........%n");
        for (i=0; i < counter; i++)
        {
            System.out.printf("di dalam block for i : %d%n", (i+1));    
        }
        System.out.printf("Setelah for........%n");
    }
}
