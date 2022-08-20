import java.util.Scanner;

/**
 * Lesson05Exercise022022S3020
 * made with love g-ramadhani <3
 */
public class Lesson05Exercise022022S3020 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String keyboardInput;
        int tinggiSegitiga;

        System.out.printf("%nProgram membuat Segitiga sama sisi%n");
        System.out.printf("%nTinggi segitiga (3 - 15) : ");
        keyboardInput = scanner.nextLine();
        tinggiSegitiga = Integer.parseInt(keyboardInput);
        
        if (tinggiSegitiga < 3 || tinggiSegitiga > 15) {
            System.out.printf("%nTinggi segitiga harus antara (3-15)%n");
        }else{
            System.out.printf("%n");
            for (int i = 0;i < tinggiSegitiga;i++){
                    for (int j = 0;j <tinggiSegitiga * 2 - 1;j++){
                    if (j >= tinggiSegitiga && (j-i) == tinggiSegitiga){
                        break;
                    }
                    else if ((i+j) < (tinggiSegitiga-1)){
                        System.out.printf(" ");
                    }else{
                        System.out.printf("*");
                    }
                }
                System.out.printf("%n");
            }
        }
    }
}