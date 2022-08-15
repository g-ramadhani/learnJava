public class OperatorUnary {
    public static void main(String[] args) {
        //Declaration & Initialization
        int intA = 5;
        int intB = 5;
        int intC = 15, intD = 15;
        int intE = 10, intF = -11;
        int intG = -17, intH = 23;
        boolean start = false;
        boolean finish = true;

        System.out.printf("Operator ++ pada tipe data bilangan bulat%n");
        System.out.printf("Sebelum penggunaan Operator ++%n");
        System.out.printf("intA = %d%n", intA);
        System.out.printf("intB = %d%n",intB);

        intA++;
        ++intB;
        System.out.printf("Setelah penggunaan Operator ++%n");
        System.out.printf("intA = %d%n", intA);
        System.out.printf("intB = %d%n", intB);

        System.out.printf("%nOperator -- pada tipe data bilangan bulat%n");
        System.out.printf("Sebelum penggunaan Operator ++%n");
        System.out.printf("intC = %d%n", intC);
        System.out.printf("intD = %d%n",intD);

        intC--;
        --intD;
        System.out.printf("Setelah penggunaan Operator --%n");
        System.out.printf("intC = %d%n", intC);
        System.out.printf("intD = %d%n", intD);

        System.out.printf("%nOperator + atau - pada tipe data bilangan bulat%n");
        System.out.printf("Sebelum menggunakan Operator + atau -%n");
        System.out.printf("intE = %d%n", intE);
        System.out.printf("intF = %d%n", intF);
        System.out.printf("intG = %d%n", intG);
        System.out.printf("intH = %d%n", intH);

        intE = +intE;
        intF = -intF;
        intG = +intG;
        intH = -intH;

        System.out.printf("Setelah menggunakan Operator + atau -%n");
        System.out.printf("intE = %d%n", intE);
        System.out.printf("intF = %d%n", intF);
        System.out.printf("intG = %d%n", intG);
        System.out.printf("intH = %d%n", intH);

        System.out.printf("%nOperator ! pada tipe data boolean%n");
        System.out.printf("Sebelum menggunakan Operator !%n");
        System.out.printf("start  = %b%n", start);
        System.out.printf("finish = %b%n", finish);

        start = !start;
        finish = !finish;

        System.out.printf("Setelah menggunakan Operator !%n");
        System.out.printf("start  = %b%n", start);
        System.out.printf("finish = %b%n", finish);
    }
}
