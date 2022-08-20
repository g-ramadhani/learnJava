/**
 * Bintang
 */
public class Bintang {
    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.println("");

        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                System.out.print("* ");
                if (i==j){
                    break;
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                System.out.print("* ");
                if (i+j==4){
                    break;
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                System.out.print("* ");
                if (i==j){
                    break;
                }else if (i+j == 8) {
                    break;
                }
            }
            System.out.print("\n");
        }
        System.out.println("");

        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                if ( (i+j) > 12){
                    break;
                }
                else if ( (j >= 4) && (j-i) > 4){
                    break;
                }
                else if ( (j <= 4) && (i+j) < 4){
                    System.out.print(i+" ");
                    continue;
                }
                else if ( (i >= 4) && (i-j) > 4){
                    System.out.print(j+" ");
                    continue;
                }
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.println(4>4);
    }
}