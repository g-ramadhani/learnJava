import java.util.Scanner;
import java.util.Arrays;

/**
 * Lesson06Exercise022022S3020
 * made with love g-ramadhani <3
 */
public class Lesson06Exercise022022S3020 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] hasilUjian;
        String inputData, namaSiswa, temp;
        int jumlahPelajaran, count;
        boolean kondisi = true;

        System.out.printf("Program mengelola nilai siswa%n");
        System.out.printf("%nNama Siswa : ");
        namaSiswa = scanner.nextLine();
        
        System.out.printf("Jumlah Pelajaran : ");
        inputData = scanner.nextLine();
        jumlahPelajaran = Integer.parseInt(inputData);

        hasilUjian = new String[jumlahPelajaran][2];

        for (count = 0;count < jumlahPelajaran;count++){
            System.out.printf("%nPelajaran ke-%d%n", count+1);
            for (int j = 0;j < 2;j++){
                if (j == 0) {
                    System.out.printf("Nama  : ");
                    hasilUjian[count][j] = scanner.nextLine();
                }else{
                    System.out.printf("Nilai : ");
                    hasilUjian[count][j] = scanner.nextLine();
                }
            }


        }

        while (kondisi) {
            kondisi = false;
            for (count = 0;count < jumlahPelajaran-1;count++){
                if (hasilUjian[count][1].compareToIgnoreCase(hasilUjian[count+1][1]) < 0) {
                    temp = hasilUjian[count][1];
                    hasilUjian[count][1] = hasilUjian[count+1][1];
                    hasilUjian[count+1][1] = temp;
                    kondisi = true;
                }
            }
        }

        System.out.printf("%nInformasi Nilai Siswa%n");
        System.out.printf("Nama Siswa : %s%n", namaSiswa);
        System.out.printf("%nHasil ujian pelajaran siswa diurutkan berdasarkan%n");
        System.out.printf("No  Pelajaran       Nilai%n");
        System.out.printf("=========================%n");

        count = 1;
        for (String[] hasil : hasilUjian) {
            System.out.printf("%d %s%n", count, Arrays.toString(hasil));
            count++;
        }

        for (int i = 0;i < hasilUjian.length;i++){
            System.out.println(Arrays.toString(hasilUjian[i]));
        }
    }
}