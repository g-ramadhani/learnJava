import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        //Deklarasi & inisialisasi
        Scanner scanner = new Scanner (System.in);
        String[] nameOfColors;
        String inputData;
        int numberOfColors, count;

        //read data from keyboard
        System.out.printf("Jumlah warna yang akan dicatat : ");
        inputData = scanner.nextLine();
        numberOfColors = Integer.parseInt(inputData);

        //instantiation
        nameOfColors = new String[numberOfColors];

        //Accessing element, change element value
        for (count = 0; count < numberOfColors; count++)
        {
            System.out.printf("Warna ke-%d : ",  count+1);
            nameOfColors[count] = scanner.nextLine();
        }

        System.out.printf("%nWarna yang akan dicatat sebanyak : %d%n", numberOfColors);
        System.out.printf("Nama warna yang akan dicatat adalah : ");
        for ( count = 0; count < numberOfColors; count++)
        {
            if (count > 0) {
                System.out.printf(", ");
            }
            System.out.printf("%s", nameOfColors[count]);
        }



    }
}