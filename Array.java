import java.util.Arrays;
import java.util.Comparator;

public class Array {
    public static void main(String[] args) {
         String [][] matkul = new String[3][2];

         matkul[0][0] = "ipa";
         matkul[0][1] = "20";

         matkul[1][0] = "ips";
         matkul[1][1] = "30";

         matkul[2][0] = "pkn";
         matkul[2][1] = "50";

         matkul = Arrays.stream(matkul)
         .sorted(Comparator.comparing(x -> -Integer.parseInt(x[1])))
         .toArray(String[][]::new);

         System.out.println();

         for (int i = 0;i< matkul.length;i++){
            System.out.println("pelajaran : " + matkul[i][0]);
            System.out.println("nilai : " + matkul[i][1]);
         }
    }
}
