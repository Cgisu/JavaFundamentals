package book.codelisting.ch03;

import java.util.Scanner;

public class CL0314NoBreaks {
    public static void main(String[] args) {
        int number;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter 1, 2, or 3: ");
        number = keyboard.nextInt();
        switch (number) {
            case 1:
                System.out.println("You entered 1.");
            case 2:
                System.out.println("You entered 2.");
            case 3:
                System.out.println("You entered 3.");
            default:
                System.out.println("That's not 1, 2, or 3");
        }
    }
}
