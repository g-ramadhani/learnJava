public class OperatorConditional {
    public static void main(String[] args) {
        //Deklarasi & Inisialisasi
        boolean bFalse = false, bTrue = true;
        boolean trueAndTrue, trueAndFalse, falseAndTrue, falseAndFalse;
        boolean trueOrTrue, trueOrFalse, falseOrTrue, falseOrFalse;
        
        trueAndTrue = bTrue && bTrue;
        trueAndFalse = bTrue && bFalse;
        falseAndTrue = bFalse &&  bTrue;
        falseAndFalse = bFalse && bFalse;

        System.out.printf("Operator conditional &&%n");
        System.out.printf("%-5b && %-5b -> %-5b%n", bTrue, bTrue, trueAndTrue);
        System.out.printf("%-5b && %-5b -> %-5b%n", bTrue, bFalse, trueAndFalse);
        System.out.printf("%-5b && %-5b -> %-5b%n", bFalse, bTrue, falseAndTrue);
        System.out.printf("%-5b && %-5b -> %-5b%n", bFalse, bFalse, falseAndFalse);

        trueOrTrue = bTrue || bTrue;
        trueOrFalse = bTrue || bFalse;
        falseOrTrue = bFalse ||  bTrue;
        falseOrFalse = bFalse || bFalse;

        System.out.printf("%nOperator conditional ||%n");
        System.out.printf("%-5b || %-5b -> %-5b%n", bTrue, bTrue, trueOrTrue);
        System.out.printf("%-5b || %-5b -> %-5b%n", bTrue, bFalse, trueOrFalse);
        System.out.printf("%-5b || %-5b -> %-5b%n", bFalse, bTrue, falseOrTrue);
        System.out.printf("%-5b || %-5b -> %-5b%n", bFalse, bFalse, falseOrFalse);

        int maxSpeed = 100;
        int currentSpeed = 90;
        String warningMessage = (currentSpeed >= maxSpeed) ? "Be carefull, pleas slow your speed" : "You're in right speed.";
        System.out.printf("%nMax Speed : %d Km/hour%n", maxSpeed);
        System.out.printf("Your Speed : %d Km/hour%n", currentSpeed);
        System.out.println(warningMessage);

        int minimumHeight = 170;
        int currentHeight = 169;
        String applyMessage = (currentHeight >= minimumHeight) ? "You can apply." : "Sorry, you cannot apply.";
        System.out.printf("%nMinimum Height Candidate : %d Cm%n", minimumHeight);
        System.out.printf("Your Height : %d Cm%n", currentHeight);
        System.out.println(applyMessage);
    }
}
