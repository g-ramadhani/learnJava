import java.util.Scanner;

/**
 * Lesson05Exercise032022S3020
 * made with love g-ramadhani <3
 */
public class Lesson05Exercise032022S3020 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String keyboardInput, posisiRata;
        int jmlKakiSegitiga;

        System.out.printf("%nProgram membuat Segitiga sama kaki siku-siku%n%n");
    
        do {
            System.out.printf("Sisi tegak rata [L]Kiri, [R]Kanan : ");
            posisiRata = scanner.nextLine();
        }while(!posisiRata.equalsIgnoreCase("L") && !posisiRata.equalsIgnoreCase("R"));
    
        do {
            System.out.printf("%nPanjang kaki segitiga (3 - 15) : ");
            keyboardInput = scanner.nextLine();
            jmlKakiSegitiga = Integer.parseInt(keyboardInput);

            if (jmlKakiSegitiga < 3 || jmlKakiSegitiga > 15) {
                System.out.printf("Kaki segitiga harus antara (3-15)%n");
            }else {
                break;
            }
        }while (true);
        
        switch (posisiRata.toUpperCase()) {
            case "R":
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
                break;

            case "L":
                System.out.printf("%n");
                for (int i= 0;i < jmlKakiSegitiga;i++){
                    for (int j = 0;j < jmlKakiSegitiga;j++){
                        System.out.printf("*");
                        if (i == j) {
                            break;
                        }
                    }
                    System.out.printf("%n");
                }

                break;
            }
    }
}