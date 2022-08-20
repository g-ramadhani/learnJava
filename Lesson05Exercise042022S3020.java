import java.util.Scanner;

/**
 * Lesson05Exercise042022S3020
 * made with love g-ramadhani <3
 */
public class Lesson05Exercise042022S3020 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String keyboardInput, arahKerucut;
        int tinggiSegitiga;

        System.out.printf("%nProgram membuat Segitiga sama sisi%n%n");
    
        do {
            System.out.printf("Arah kerucut Segitiga [U]Atas, [T]Bawah, [B]Atas Bawah : ");
            arahKerucut = scanner.nextLine();
        }while(!arahKerucut.equalsIgnoreCase("U") && !arahKerucut.equalsIgnoreCase("T") && !arahKerucut.equalsIgnoreCase("B"));
    
        do {
            System.out.printf("%nTinggi segitiga (3 - 15) : ");
            keyboardInput = scanner.nextLine();
            tinggiSegitiga = Integer.parseInt(keyboardInput);

            if (tinggiSegitiga < 3 || tinggiSegitiga > 15) {
                System.out.printf("Tinggi segitiga harus antara (3-15)%n");
            }else {
                break;
            }
        }while (true);
        
        switch (arahKerucut.toUpperCase()) {
            case "U":
                System.out.printf("%n");
                for (int i = 0;i < tinggiSegitiga;i++){
                    for (int j = 0;j <tinggiSegitiga * 2 - 1;j++){
                    if ((j-i) == tinggiSegitiga){
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
                break;

            case "T":
                System.out.printf("%n");
                for (int i= 0;i < tinggiSegitiga;i++){
                    for (int j = 0;j < tinggiSegitiga * 2 - 1;j++){
                        if ((i+j) == tinggiSegitiga * 2 - 1){
                            break;
                        }
                        else if (j < i){
                            System.out.printf(" ");
                        }else{
                            System.out.printf("*");
                        }
                    }
                    System.out.printf("%n");
                }
                break;
            case "B":
                System.out.printf("%n");
                for (int i=0;i < tinggiSegitiga * 2 - 1;i++){
                    for (int j=0;j < tinggiSegitiga * 2 - 1;j++){
                        if ((i+j) >= tinggiSegitiga * 3 - 2){
                            break;
                        }
                        else if(j-i >= tinggiSegitiga ){
                            break;
                        }
                        else if((i+j) < tinggiSegitiga- 1){
                            System.out.printf(" ");  
                        }
                        else if (i-j > tinggiSegitiga - 1){
                            System.out.printf(" ");  
                        }else{
                           System.out.printf("*");
                        }
                    }
                    System.out.printf("%n");
                }
                break;
            }
    }
}