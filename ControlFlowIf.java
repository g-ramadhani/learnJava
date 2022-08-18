import java.util.Scanner;

public class ControlFlowIf {
    public static void main(String[] args) {
        //Deklarasi & Inisialisasi
        Scanner scanner = new Scanner(System.in);
        String studentName, inputAge;
        int studentAge;

        //Read data from keyboard
        System.out.printf("Nama Siswa : ");
        studentName = scanner.nextLine();

        System.out.printf("Umur Siswa : ");
        inputAge = scanner.nextLine();
        studentAge = Integer.parseInt(inputAge);

        //Control Flow If
        if(studentAge < 13)
        {
            System.out.printf("Please Follow the Instruction....%n");
        }
        System.out.printf("Hi %s, please enjoy the playground%n", studentName);
    }
}
