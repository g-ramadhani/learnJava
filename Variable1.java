import java.util.Locale;

public class Variable1 {
    public static void main(String[] args) {
        //initialization
        byte umur = 24;
        short tinggiBdn = 170;
        int jumlahSekolah = 35432;
        long jumlahPenduduk = 320000000;
        float hargaMotor = 22000000;
        double hargaRumah = 1500000000;
        //char oneChar = 'A';
        //boolean isFinish = false;
        String nama = "Gilang Ramadhani";

        System.out.printf("%nMenampilkan data tanpa format%n");
        System.out.printf("Nama : %s%n",nama);
        System.out.printf("Umur : %d tahun%n",umur);
        System.out.printf("Tinggin badan : %d cm%n",tinggiBdn);
        System.out.printf("Jumlah Sekolah : %d %n",jumlahSekolah);
        System.out.printf("Jumlah Penduduk : %d jiwa%n",jumlahPenduduk);
        System.out.printf("Harga Motor : Rp. %f %n",hargaMotor);
        System.out.printf("Harga Rumah : Rp. %f %n",hargaRumah);

        System.out.printf("%nMenampilkan data bilangan dengan format pemisah pecahan, ribuan default JDK%n");
        System.out.printf("Nama : %s%n",nama);
        System.out.printf("Umur : %d tahun%n",umur);
        System.out.printf("Tinggin badan : %d cm%n",tinggiBdn);
        System.out.printf("Jumlah Sekolah : %,d %n",jumlahSekolah);
        System.out.printf("Jumlah Penduduk : %,d jiwa%n",jumlahPenduduk);
        System.out.printf("Harga Motor : Rp. %,f %n",hargaMotor);
        System.out.printf("Harga Rumah : Rp. %,f %n",hargaRumah);

        System.out.printf("%nMenampilkan data bilangan dengan format pemisah pecahan, ribuan sesuai negara%n");
        System.out.printf("Nama : %s%n",nama);
        System.out.printf("Umur : %d tahun%n",umur);
        System.out.printf("Tinggin badan : %d cm%n",tinggiBdn);
        System.out.printf(new Locale("in","ID"),"Jumlah Sekolah : %,d %n",jumlahSekolah);
        System.out.printf(new Locale("in","ID"),"Jumlah Penduduk : %,d jiwa%n",jumlahPenduduk);
        System.out.printf(new Locale("in", "ID"),"Harga Motor : Rp. %,f %n",hargaMotor);
        System.out.printf(new Locale("in","ID"),"Harga Rumah : Rp. %,f %n",hargaRumah);

        System.out.printf("%nMenampilkan data bilangan dengan pengaturan lebar data yang ditampilkan%n");
        System.out.printf("Nama : %s%n",nama);
        System.out.printf("Umur : %d tahun%n",umur);
        System.out.printf("Tinggin badan : %d cm%n",tinggiBdn);
        System.out.printf(new Locale("in","ID"),"Jumlah Sekolah : %,d %n",jumlahSekolah);
        System.out.printf(new Locale("in","ID"),"Jumlah Penduduk : %,d jiwa%n",jumlahPenduduk);
        System.out.printf(new Locale("in","ID"),"Harga Motor : Rp. %,13.0f %n",hargaMotor);
        System.out.printf(new Locale("in","ID"),"Harga Rumah : Rp. %,13.0f %n",hargaRumah);
    }
}