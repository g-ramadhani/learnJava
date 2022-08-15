import java.util.Locale;

public class OperatorArithmetic {
    public static void main(String[] args) {
        //Declaration & Initialization, bilangan bulat integer
        int intA = 6;
        int intB = 4;
        int intC, intD, intE,intF, intG;

        intC = intA + intB;
        intD = intA - intB;
        intE = intA * intB;
        intF = intA / intB;
        intG = intA % intB;

        System.out.printf("Operator Aritmatika pada bilangan bulat%n");
        System.out.printf("%d + %d = %d%n", intA, intB, intC);
        System.out.printf("%d - %d = %d%n", intA, intB, intD);
        System.out.printf("%d * %d = %d%n", intA, intB, intE);
        System.out.printf("%d / %d = %d%n", intA, intB, intF);
        System.out.printf("%d %s %d = %d%n", intA, "%", intB, intG);

        //Declaration & Initialization, bilangan pecahan (fraction number)
        float floatA = 6;
        float floatB = 4f;
        float floatC, floatD, floatE, floatF, floatG;

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
