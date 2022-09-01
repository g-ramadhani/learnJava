public class SystemOutPrintf {
    public static void main(String[] args) {
        String nama = "Gilang Ramadhani";
        int umur = 24;
        int tingguBdn = 170;

        System.out.printf("Ini baris 1");
        System.out.printf("Ini baris 2");

        System.out.printf("%n%n");

        System.out.printf("Ini baris 1%n");
        System.out.printf("Ini baris 2");

        System.out.printf("%n%n");

        System.out.printf("Nama : %s, Umur : %d tahun, Tinggin Badan : %d cm", nama, umur, tingguBdn);
    }
}
