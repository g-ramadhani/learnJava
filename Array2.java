public class Array2 {
    public static void main(String[] args) {
        //Deklarasi
        String[] nameOfDays = {"Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jum`at", "Sabtu"};
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String nameOfFirstDay;
        String nameOfLastDay;
        int dayOfFirstMonth;
        int dayOfLastMonth;

        //Accessing element, get element value
        nameOfFirstDay = nameOfDays[0];
        nameOfLastDay = nameOfDays[6];

        dayOfFirstMonth = numberOfDays[0];
        dayOfLastMonth = numberOfDays[11];

        System.out.printf("Hari pertama  -> nameOfDays[0] adalah %s%n", nameOfFirstDay);
        System.out.printf("Hari terakhir -> nameOfDays[6] adalah %s%n", nameOfLastDay);
        System.out.printf("Jumlah hari bulan pertama -> numberOfDays[0] adalah %s%n", dayOfFirstMonth);
        System.out.printf("Jumlah hari bulan terkahir -> numberOfDays[11] adalah %s%n", dayOfLastMonth);
    }
}
