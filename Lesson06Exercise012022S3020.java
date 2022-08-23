import java.util.Scanner;

/**
 * Lesson06Exercise012022S3020
 * made with love g-ramadhani <3
 */
public class Lesson06Exercise012022S3020 {

     public static void main(String[ ] args)
     {
        Scanner scanner = new Scanner(System.in);
        String[] namaSiswa;
        String inputData, temp;
        int jumlahSiswa, count;
        boolean kondisi = true;

        System.out.printf("Program mengurutkan nama siswa%n");
        System.out.printf("%nJumlah siswa : ");
        inputData = scanner.nextLine();
        jumlahSiswa = Integer.parseInt(inputData);

        namaSiswa = new String[jumlahSiswa];

        System.out.printf("%n");

        for (count = 0;count < jumlahSiswa;count++){
            System.out.printf("Nama siswa ke-%d: ", count+1);
            namaSiswa[count] = scanner.nextLine();
        }

        System.out.printf("%nNama siswa diurutkan berdasarkan abjad adalah :%n");
        
        while(kondisi){
            kondisi = false;
            for (count = 0;count < jumlahSiswa - 1;count++){
                if (namaSiswa[count].compareToIgnoreCase(namaSiswa[count+1]) > 0){
                    temp = namaSiswa[count];
                    namaSiswa[count] = namaSiswa[count+1];
                    namaSiswa[count+1] = temp;
                    kondisi = true;
                }
            }
        }
        
        count = 1;
        for (String nama : namaSiswa) {
            System.out.printf("%d. %s%n", count,nama);
            count++;
        }
      }
}