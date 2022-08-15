public class OperatorUnary1 {
    public static void main(String[] args) {
        //Declaration & Initialization
        int intA = 5;
        int intB = 5;

        System.out.printf("Nilai Awal Variabel%n");
        System.out.printf("intA = %d%n", intA);
        System.out.printf("intB = %d%n",intB);

        System.out.printf("%nNilai variabel pada  waktu Operator unary ++ digunakan%n");
        System.out.printf("intA = %d%n", intA++);
        System.out.printf("intB = %d%n", ++intB);

        System.out.printf("%nNilai variabel setelah Operator unary  ++ digunakan%n");
        System.out.printf("intA = %d%n", intA);
        System.out.printf("intB = %d%n", intB);
    }
}