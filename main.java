public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int intOperandA = 22;
        int intOperandB = 25;
        int intSum = true;
        int intProduct = true;
        int intDifference = true;
        int intQuotient = true;
        int intModulo = true;
        double doubleOperandA = 39.32;
        double doubleOperandB = 49.37;
        double doubleSum = 22.5;
        double doubleProduct = 1.15;
        double doubleDifference = 18.26;
        double doubleQuotient = 44.15;
        double doubleModulo = 1.5;
        int intSum = intOperandA + intOperandB;
        System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB + " is " + intSum);
        int intDifference = intOperandA - intOperandB;
        System.out.println("The difference using ints of " + intOperandA + " and " + intOperandB + " is " + intDifference);
        int intProduct = intOperandA * intOperandB;
        System.out.println("The product using ints of " + intOperandA + " and " + intOperandB + " is " + intProduct);
        int intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient using ints of " + intOperandA + " and " + intOperandB + " is " + intQuotient);
        int intModulo = intOperandA % intOperandB;
        System.out.println("The modulo using ints of " + intOperandA + " and " + intOperandB + " is " + intModulo);
        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);
        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);
        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);
        doubleQuotient = doubleOperandA / (double)intOperandB;
        System.out.println("The difference using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);
        doubleModulo = doubleOperandA % doubleOperandB;
        System.out.println("The modulo using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleModulo);
    }
}
