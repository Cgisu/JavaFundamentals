package book.codelisting.ch03;

public class CL0319LeadingZero {
    public static void main(String[] args) {
        double num1 = 1.234;
        double num2 = 12.345;
        double num3 = 123.456;

        System.out.printf("%09.2f\n", num1);
        System.out.printf("%09.2f\n", num2);
        System.out.printf("%09.2f\n", num3);
    }
}
