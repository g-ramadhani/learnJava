/**
 * Bintang dengan method
 */
public class BintangWithMethod {
    public static void main(String[] args) {
        
        persegi(5);

        System.out.println("luas persegi adalah "+luasPersegi(5));

        //Segitiga Rata Kiri Bawah
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

        //Segitiga Rata Kiri Atas
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

        //Segitiga sama sisi Kiri
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

        //Belah Ketupat
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                if ( (i+j) > 12){
                    break;
                }
                else if ( (j >= 4) && (j-i) > 4){
                    break;
                }
                else if ( (j <= 4) && (i+j) < 4){
                    System.out.print(" ");
                    continue;
                }
                else if ( (i >= 4) && (i-j) > 4){
                    System.out.print(" ");
                    continue;
                }
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    private static void persegi(int sisi){
        //Persegi
        for (int i=0;i<sisi;i++){
            for (int j=0;j<sisi;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.println("");
    }

    private static int luasPersegi(int sisi){
        //Luas persegi
        int hasil = sisi * sisi;
        return hasil;    
    }
}