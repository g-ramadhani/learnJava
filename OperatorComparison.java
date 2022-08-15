public class OperatorComparison {
    public static void main(String[] args) {
     //Declaration & Initialization
     int bil1 =10, bil2 = 11;
     boolean lessThan, greaterThan, lessThanEqual;
     boolean greaterThanEqual, equal, notEqual;
     
     lessThan = bil1 < bil2;
     greaterThan = bil1 > bil2;
     lessThanEqual = bil1 <= bil2;
     greaterThanEqual = bil1 >= bil2;
     equal = bil1 == bil2;
     notEqual = bil1 != bil2;

     System.out.printf("%nOperator Relational%n");
     System.out.printf("%d < %d -> %b%n", bil1, bil2, lessThan);
     System.out.printf("%d > %d -> %b%n", bil1, bil2, greaterThan);
     System.out.printf("%d <= %d -> %b%n", bil1, bil2, lessThanEqual);
     System.out.printf("%d >= %d -> %b%n", bil1, bil2, greaterThanEqual);
     System.out.printf("%d == %d -> %b%n", bil1, bil2, equal);
     System.out.printf("%d != %d -> %b%n", bil1, bil2, notEqual);
    }
}