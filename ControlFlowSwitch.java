import java.util.Scanner;

public class ControlFlowSwitch {
    public static void main(String[] args) {
        //Deklarasi & Inisialisasi
        Scanner scanner = new Scanner(System.in);
        String keyboardInput;
        int orderDay;

        //Read data from keyboard
        System.out.printf("Number of Day (1 - 7) : ");
        keyboardInput = scanner.nextLine();
        orderDay = Integer.parseInt(keyboardInput);
        
        //Control Flow Switch
        switch (orderDay) 
        {
            case 1:
                System.out.printf("%n1st day is Sunday%n");
                break;
            case 2:
                System.out.printf("%n2nd day is Monday%n");
                break;
            case 3:
                System.out.printf("%n3rd day is Tuesday%n");
                break;
            case 4:
                System.out.printf("%n4th day is Wednesday%n");
                break;
            case 5:
                System.out.printf("%n5th day is Thursday%n");
                break;
            case 6:
                System.out.printf("%n6th day is Friday%n");
                break;
            case 7:
                System.out.printf("%n7th day is Saturday%n");
                break;
            default:
                System.out.printf("%nYour number of day %d is not recognized%n", orderDay);
                break;
        }
    }
}
