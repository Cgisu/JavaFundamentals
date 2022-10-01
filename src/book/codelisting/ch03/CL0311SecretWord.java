package book.codelisting.ch03;

import java.util.Scanner;

public class CL0311SecretWord {
    public static void main(String[] args) {
        String input;

        Scanner keybaord = new Scanner(System.in);
        System.out.print("Enter a secret word: ");
        input = keybaord.nextLine();

        if (input.equalsIgnoreCase("PROSPERO")) {
            System.out.println("Congratulations! You know the" +
                    " secret word!");
        } else {
            System.out.println("Sorry, that is NOT the secret" +
                    " word!");
        }
    }
}
