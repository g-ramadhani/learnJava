import java.util.Locale;

public class OperatorArithmetic2 {
    public static void main(String[] args) {
        //Declaration & Initialization
        int intA = 2;
        int intB = 3;
        int intC = 4;
        int intD = 5;
        int intE,intF, intG, intH, intI, intJ;

        intE = intA + intB - intC;
        intF = intD * intC / intA;
        intG = intA +intB * intC - intD;
        intH = intD - intC / intA + intB;
        intI = (intA + intB) * (intC - intD);
        intJ = (intD - intC) / (intA + intB);

        System.out.printf("Prioritas Operator Aritmatika%n");
        System.out.printf("%d + %d - %d = %d%n", intA, intB, intC, intE);
        System.out.printf("%d * %d / %d = %d%n", intD, intC, intA, intF);
        System.out.printf("%d + %d * %d - %d = %d%n", intA, intB, intC, intD, intG);
        System.out.printf("%d - %d / %d + %d = %d%n", intD, intB, intA, intB, intH);
        System.out.printf("(%d + %d) * (%d - %d) = %d%n", intA, intB, intC, intD, intI);
        System.out.printf("(%d - %d) / (%d + %d) = %d%n", intD, intC, intA, intB, intJ);

        //Declaration & Initialization, bilangan pecahan (fraction number)
        float floatA = 2;
        float floatB = 3;
        float floatC = 4;
        float floatD = 5;
        float floatE,floatF, floatG, floatH, floatI, floatJ;

        floatE = floatA + floatB - floatC;
        floatF = floatD * floatC / floatA;
        floatG = floatA + floatB * floatC - floatD;
        floatH = floatD - floatC / floatA + floatB;
        floatI = (floatA + floatB) * (floatC - floatD);
        floatJ = (floatD - floatC) / (floatA + floatB);

        System.out.printf("%nPrioritas Operator Aritmatika%n");
        System.out.printf("%f + %f - %f = %f%n", floatA, floatB, floatC, floatE);
        System.out.printf("%f * %f / %f = %f%n", floatD, floatC, floatA, floatF);
        System.out.printf("%f + %f * %f - %f = %f%n", floatA, floatB, floatC, floatD, floatG);
        System.out.printf("%f - %f / %f + %f = %f%n", floatD, floatB, floatA, floatB, floatH);
        System.out.printf("(%f + %f) * (%f - %f) = %f%n", floatA, floatB, floatC, floatD, floatI);
        System.out.printf("(%f - %f) / (%f + %f) = %f%n", floatD, floatC, floatA, floatB, floatJ);

        System.out.printf("%nPrioritas Operator Aritmatika%n");
        System.out.printf(new Locale("in", "ID"),"%.1f + %.1f - %.1f = %.1f%n", floatA, floatB, floatC, floatE);
        System.out.printf(new Locale("in", "ID"),"%.1f * %.1f / %.1f = %.1f%n", floatD, floatC, floatA, floatF);
        System.out.printf(new Locale("in", "ID"),"%.1f + %.1f * %.1f - %.1f = %.1f%n", floatA, floatB, floatC, floatD, floatG);
        System.out.printf(new Locale("in", "ID"),"%.1f - %.1f / %.1f + %.1f = %.1f%n", floatD, floatB, floatA, floatB, floatH);
        System.out.printf(new Locale("in", "ID"),"(%.1f + %.1f) * (%.1f - %.1f) = %.1f%n", floatA, floatB, floatC, floatD, floatI);
        System.out.printf(new Locale("in", "ID"),"(%.1f - %.1f) / (%.1f + %.1f) = %.2f%n", floatD, floatC, floatA, floatB, floatJ);
    }
}
