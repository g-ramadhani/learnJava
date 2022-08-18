import java.util.Scanner;

public class ControlFlowIfElseIfElse {
    public static void main(String[] args) {
        //Deklarasi & Inisialisasi
        Scanner scanner = new Scanner(System.in);
        String keyboardInput;
        int maxSpeed, minSpeed, currentSpeed;

        //Read data from keyboard
        System.out.printf("Max Speed : ");
        keyboardInput = scanner.nextLine();
        maxSpeed = Integer.parseInt(keyboardInput);

        System.out.printf("Min Speed : ");
        keyboardInput = scanner.nextLine();
        minSpeed = Integer.parseInt(keyboardInput);

        System.out.printf("Current Speed : ");
        keyboardInput = scanner.nextLine();
        currentSpeed = Integer.parseInt(keyboardInput);

        //Control Flow If Else If Else
        if(currentSpeed < minSpeed)
        {
            System.out.printf("%nYour speed %d Km/hour is below minimum speed %d Km/hour, please accelerate your vehicle.%n", currentSpeed, minSpeed);
        } 
        else if (currentSpeed < maxSpeed)
        {
            System.out.printf("%nYour speed %d Km/hour is a safe speed, keep it up.%n", currentSpeed);
        }
        else
        {
            System.out.printf("%nYour speed %d Km/hour is exceed maximum speed %d Km/hour, be carefull and slow down your vehicle%n", currentSpeed, maxSpeed);
        }
    }
}