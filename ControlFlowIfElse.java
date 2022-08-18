import java.util.Scanner;

public class ControlFlowIfElse {
    public static void main(String[] args) {
        //Deklarasi & Inisialisasi
        Scanner scanner = new Scanner(System.in);
        String keyboardInput;
        int maxSpeed, currentSpeed;

        //Read data from keyboard
        System.out.printf("Max Speed : ");
        keyboardInput = scanner.nextLine();
        maxSpeed = Integer.parseInt(keyboardInput);

        System.out.printf("Current Speed : ");
        keyboardInput = scanner.nextLine();
        currentSpeed = Integer.parseInt(keyboardInput);

        //Control Flow If
        if(currentSpeed > maxSpeed)
        {
            System.out.printf("%nBe Carefull, Please slow your speed%n");
        } else 
        {
            System.out.printf("You're in the right speed%n");
        }
    }
}
