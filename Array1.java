public class Array1 {
    public static void main(String[] args) {
        //Deklarasi
        String[] nameOfDays;
        int[] numberOfDays;
        String nameOfFirstDay;
        String nameOfLastDay;
        int dayOfFirstMonth;
        int dayOfLastMonth;

        //Instantiation
        nameOfDays = new String[7];
        numberOfDays = new int[12];

        //Accessing element, get element value
        nameOfFirstDay = nameOfDays[0];
        nameOfLastDay = nameOfDays[6];

        dayOfFirstMonth = numberOfDays[0];
        dayOfLastMonth = numberOfDays[11];

        System.out.printf("Sebelum nilai elemen diubah%n");
        System.out.printf("Hari pertama  -> nameOfDays[0] adalah %s%n", nameOfFirstDay);
        System.out.printf("Hari terakhir -> nameOfDays[6] adalah %s%n", nameOfLastDay);
        System.out.printf("Jumlah hari bulan pertama -> numberOfDays[0] adalah %s%n", dayOfFirstMonth);
        System.out.printf("Jumlah hari bulan terkahir -> numberOfDays[11] adalah %s%n", dayOfLastMonth);

        //Accessing element, change element value
        System.out.printf("%nSetelah nilai elemen diubah%n");
        nameOfDays[0] = "Minggu";
        nameOfDays[1] = "Senin";
        nameOfDays[6] = "Sabtu";

        numberOfDays[0] = 31;
        numberOfDays[1] = 29;
        numberOfDays[11]= 31;

         //Accessing element, get element value
         nameOfFirstDay = nameOfDays[0];
         nameOfLastDay = nameOfDays[6];
 
         dayOfFirstMonth = numberOfDays[0];
         dayOfLastMonth = numberOfDays[11];

        System.out.printf("Hari pertama  -> nameOfDays[0] adalah %s%n", nameOfFirstDay);
        System.out.printf("Hari terakhir -> nameOfDays[6] adalah %s%n", nameOfLastDay);
        System.out.printf("Jumlah hari bulan pertama  -> numberOfDays[0] adalah %s%n", dayOfFirstMonth);
        System.out.printf("Jumlah hari bulan terkahir -> numberOfDays[11] adalah %s%n", dayOfLastMonth);
    }
}
