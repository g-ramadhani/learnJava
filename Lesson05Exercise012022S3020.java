import java.util.Scanner;

/**
 * Lesson05Exercise012022S3020
 * made with love g-ramadhani <3
 */
public class Lesson05Exercise012022S3020 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String keyboardInput;
        int jmlKakiSegitiga;

        System.out.printf("%nProgram membuat Segitiga sama kaki siku-siku%n");
        System.out.printf("%nPanjang kaki segitiga (3 - 15) : ");
        keyboardInput = scanner.nextLine();
        jmlKakiSegitiga = Integer.parseInt(keyboardInput);
        
        if (jmlKakiSegitiga < 3 || jmlKakiSegitiga > 15) {
            System.out.printf("Kaki segitiga harus antara (3-15)%n");
        }else{
            System.out.printf("%n");
            for (int i = 0;i < jmlKakiSegitiga;i++){
                for (int j = 0;j < jmlKakiSegitiga;j++){
                    if ((i+j) < (jmlKakiSegitiga-1)){
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