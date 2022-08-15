import java.util.Locale;
import java.util.Scanner;

public class OperatorArithmetic1 {
    public static void main(String[] args) {
        //Declaration, bilangan bulat integer
        Scanner scanner = new Scanner(System.in);
        int intA;
        int intB;
        int intC, intD, intE,intF, intG;
        String strA, strB;

        System.out.printf("Menggunakan Aritmatika pada bilangan bulat%n");
        System.out.printf("Masukkan 2 bilangan bulat%n");
        System.out.printf("Bilangan bulat ke-1 : ");
        strA = scanner.nextLine();
        System.out.printf("Bilangan bulat ke-2 : ");
        strB = scanner.nextLine();

        //Konversi input string ke integer
        intA = Integer.parseInt(strA);
        intB = Integer.parseInt(strB);

        intC = intA + intB;
        intD = intA - intB;
        intE = intA * intB;
        intF = intA / intB;
        intG = intA % intB;

        System.out.printf("%nOperator Aritmatika pada bilangan bulat%n");
        System.out.printf("%d + %d = %d%n", intA, intB, intC);
        System.out.printf("%d - %d = %d%n", intA, intB, intD);
        System.out.printf("%d * %d = %d%n", intA, intB, intE);
        System.out.printf("%d / %d = %d%n", intA, intB, intF);
        System.out.printf("%d %s %d = %d%n", intA, "%", intB, intG);

        //Declaration, bilangan pecahan (fraction number)
        float floatA;
        float floatB;
        float floatC, floatD, floatE, floatF, floatG;

        System.out.printf("%nMenggunakan Aritmatika pada bilangan pecahan%n");
        System.out.printf("Masukkan 2 bilangan pecahan%n");
        System.out.printf("Bilangan pecahan ke-1 : ");
        strA = scanner.nextLine();
        System.out.printf("Bilangan pecahan ke-2 : ");
        strB = scanner.nextLine();

        //Konversi input string ke float
        floatA = Float.parseFloat(strA);
        floatB = Float.parseFloat(strB);
        
        floatC = floatA + floatB;
        floatD = floatA - floatB;
        floatE = floatA * floatB;
        floatF = floatA / floatB;
        floatG = floatA % floatB;

        System.out.printf("%nOperator Aritmatika pada bilangan pecahan dengan format default JDK%n");
        System.out.printf("%f + %f = %f%n", floatA, floatB, floatC);
        System.out.printf("%f - %f = %f%n", floatA, floatB, floatD);
        System.out.printf("%f * %f = %f%n", floatA, floatB, floatE);
        System.out.printf("%f / %f = %f%n", floatA, floatB, floatF);
        System.out.printf("%f %s %f = %f%n", floatA, "%", floatB, floatG);

        System.out.printf("%nOperator Aritmatika pada bilangan pecahan dengan format negara Indonesia%n");
        System.out.printf(new Locale("in", "ID"),"%.0f + %.0f = %.0f%n", floatA, floatB, floatC);
        System.out.printf(new Locale("in", "ID"),"%.0f - %.0f = %.0f%n", floatA, floatB, floatD);
        System.out.printf(new Locale("in", "ID"),"%.0f * %.0f = %.0f%n", floatA, floatB, floatE);
        System.out.printf(new Locale("in", "ID"),"%.0f / %.0f = %.2f%n", floatA, floatB, floatF);
        System.out.printf(new Locale("in", "ID"),"%.0f %s %.0f = %.0f%n", floatA, "%", floatB, floatG);
    }
}