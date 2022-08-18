import java.util.Scanner;

public class ControlFlowSwitch1 {
    public static void main(String[] args) {
        //Deklarasi & Inisialisasi
        Scanner scanner = new Scanner(System.in);
        String grade;

        //Read data from keyboard
        System.out.printf("Mathematics Grade (A - E) : ");
        grade = scanner.nextLine();

        //Control Flow Switch
        switch (grade.toUpperCase()) 
        {
            case "A":
                System.out.printf("%nYour grade is Very Good%n");
                break;
            case "B":
                System.out.printf("%nYour grade is Good%n");
                break;
            case "C":
                System.out.printf("%nYour grade is Satisfying%n");
                break;
            case "D":
                System.out.printf("%nYour grade is Sufficient%n");
                break;
            case "E":
                System.out.printf("%nYour grade is Insufficient%n");
                break;
            default:
                System.out.printf("%nYour grade %s is not recognized%n", grade);
                break;
        }
    }
}
