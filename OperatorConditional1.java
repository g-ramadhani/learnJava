public class OperatorConditional1 {
    public static void main(String[] args) {
        //Deklarasi & Inisialisasi
        int bilA =5, bilB = 5;
        int bilC = 10, bilD = 11;
        boolean boolAnd1, boolAnd2;
        boolean boolOr1, boolOr2;

        boolAnd1 = bilA < bilB && bilC < bilD;
        boolAnd2 = bilA <= bilB && bilC < bilD;
        boolOr1 = bilA < bilB || bilC < bilD;
        boolOr2 = bilA < bilB || bilC == bilD;

        System.out.printf("Operator Conditional && dan ||%n");
        System.out.printf("%d  <  %d && %d <  %d -> %b%n", bilA, bilB, bilC, bilD, boolAnd1);
        System.out.printf("%d  <= %d && %d <  %d -> %b%n", bilA, bilB, bilC, bilD, boolAnd2);
        System.out.printf("%d  <  %d || %d <  %d -> %b%n", bilA, bilB, bilC, bilD, boolOr1);
        System.out.printf("%d  <  %d || %d == %d -> %b%n", bilA, bilB, bilC, bilD, boolOr2);
    }
}