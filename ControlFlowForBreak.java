import java.util.Scanner;

public class ControlFlowForBreak {
    public static void main(String[] args) {
        //Deklarasi & Inisialisasi
        Scanner scanner = new Scanner(System.in);
        String inputData;
        int i, limitNumber, numberOfOdd = 0;

        //Read data from keyboard
        System.out.printf("Jumlah bilangan ganjil : ");
        inputData = scanner.nextLine();
        limitNumber = Integer.parseInt(inputData);

        System.out.printf("%nSebelum For........%n");
        if (limitNumber != 0){
        for (i=1; true; i++) 
        {
            if (i % 2 == 1 )
            {
                numberOfOdd++;
                System.out.printf("%d ", i);
            }
            if (numberOfOdd == limitNumber)
            {
                break;
            }
            System.out.printf("setelah break.......%n");
        }}
        System.out.printf("%nSetelah For........%n");
    }
}
