public class OperatorAssignment {
    public static void main(String[] args) {
        //Deklarasi & Inisialisasi
        int intA = 5;
        int intB = 6;
        int intC = 7, intD = 8, intE =9;

        System.out.printf("Nilai awal variabel%n");
        System.out.printf("intA : %d%n", intA);
        System.out.printf("intB : %d%n", intB);
        System.out.printf("intC : %d%n", intC);
        System.out.printf("intD : %d%n", intD);
        System.out.printf("intE : %d%n", intE);
        
        intA += 2; //intA = intA + 2
        intB -= 2; //intA = intA - 2
        intC *= 2; //intA = intA * 2
        intD /= 2; //intA = intA / 2
        intE %= 2; //intA = intA % 2
        
        System.out.printf("%nNilai variabel setelah penggunaan operator%n");
        System.out.printf("intA += 2 : %d%n", intA);
        System.out.printf("intB -= 2 : %d%n", intB);
        System.out.printf("intC *= 2 : %d%n", intC);
        System.out.printf("intD /= 2 : %d%n", intD);
        System.out.printf("intE %%= 2 : %d%n", intE);
    }
}