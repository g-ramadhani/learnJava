public class Array3 {
    public static void main(String[] args) {
        //Deklarasi
        String[] nameOfDays = {"Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jum`at", "Sabtu"};
        int count;

        //Accessing element, get element value
        System.out.printf("Accessing element array without looping%n");
        System.out.printf("nameOfDays[0] : %s%n", nameOfDays[0]);
        System.out.printf("nameOfDays[1] : %s%n", nameOfDays[1]);
        System.out.printf("nameOfDays[2] : %s%n", nameOfDays[2]);
        System.out.printf("nameOfDays[3] : %s%n", nameOfDays[3]);
        System.out.printf("nameOfDays[4] : %s%n", nameOfDays[4]);
        System.out.printf("nameOfDays[5] : %s%n", nameOfDays[5]);
        System.out.printf("nameOfDays[6] : %s%n", nameOfDays[6]);

        //Accsessing element, get element value
        System.out.printf("%nAccessing element array with looping - for%n");
        for (count = 0; count < nameOfDays.length;count++)
        {
            System.out.printf("nameOfDays[%s] : %s%n", count, nameOfDays[count]);
        }

        //Accessing element, get element value
        count = 0;
        System.out.printf("%nAccessing element array with looping - while%n");
        while (count < nameOfDays.length)
        {
            System.out.printf("nameOfDays[%s] : %s%n", count, nameOfDays[count]);   
            count++;
        }

        //Accessing element, get element value
        count = 0;
        System.out.printf("%nAccessing element array with looping - do .. while%n");
        do {
            System.out.printf("nameOfDays[%s] : %s%n", count, nameOfDays[count]);
            count++;
        } while (count < nameOfDays.length);

        //Accessing element, get element value
        count = 0;
        System.out.printf("%nAccessing element array with looping - for each%n");
        for (String day : nameOfDays)
        {
            System.out.printf("nameOfDays[%s] : %s%n", count, day);
            count++;
        }
        
    }
}
