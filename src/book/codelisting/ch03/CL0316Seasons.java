package book.codelisting.ch03;

import java.util.Scanner;

public class CL0316Seasons {
    public static void main(String[] args) {
        String input;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the name of a season: ");
        input = keyboard.nextLine();

        switch (input) {
            case "spring":
                System.out.println("la primavera");
                break;
            case "summer":
                System.out.println("el verano");
                break;
            case "autumn":
            case "fall":
                System.out.println("el otono");
                break;
            case "winter":
                System.out.println("el invierno");
                break;
            default:
                System.out.println("Please enter one of these words: \n" +
                        "spring, summer , autumn, fall, or winter.");
        }
    }
}
