import java.util.Scanner;

/**
 * Lesson06Exercise022022S3020
 * made with love g-ramadhani <3
 */
public class Lesson06Exercise022022S3020 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] hasilUjian;
        String inputData, namaSiswa, temp, temp1;
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
                    temp1 = hasilUjian[count][0];
                    hasilUjian[count][1] = hasilUjian[count+1][1];
                    hasilUjian[count][0] = hasilUjian[count+1][0];
                    hasilUjian[count+1][1] = temp;
                    hasilUjian[count+1][0] = temp1;
                    kondisi = true;
                }
            }
        }

        System.out.printf("%nInformasi Nilai Siswa%n");
        System.out.printf("Nama Siswa : %s%n", namaSiswa);
        System.out.printf("%nHasil ujian pelajaran siswa diurutkan berdasarkan nilai tertinggi :%n");
        System.out.printf("No  Pelajaran       Nilai%n");
        System.out.printf("=========================%n");

        count = 1;
        for (int i = 0;i < hasilUjian.length;i++){
            if(i >= 0){
                System.out.printf("%3d ",count);
            }
            for (int j = 0;j < 2;j++){
                System.out.printf("%-16s", hasilUjian[i][j]);
            }
            count++;
            System.out.printf("%n");
        }
        System.out.printf("=========================%n");
    }
}