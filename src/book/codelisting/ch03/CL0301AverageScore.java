package book.codelisting.ch03;

import javax.swing.*;

/**
 * This program demonstrates the if statement.
 */
public class CL0301AverageScore {
    public static void main(String[] args) {
        double score1;  // To hold score #1
        double score2;  // To hold score #2
        double score3;  // To hold score #3
        double average; // To hold the average score
        String input;   // To hold the user's input

        // Get the first score.
        input = JOptionPane.showInputDialog("Enter score #1");
        score1 = Double.parseDouble(input);

        // Get the second score.
        input = JOptionPane.showInputDialog("Enter score #2");
        score2 = Double.parseDouble(input);

        // Get the third score.
        input = JOptionPane.showInputDialog("Enter socre #3");
        score3 = Double.parseDouble(input);

        // Calculate the average score.
        average = (score1 + score2 + score3) / 3;

        // Display the average score.
        JOptionPane.showMessageDialog(null, "The average is " +
                + average);

        // Decision structure.
        if (average > 95) {
            JOptionPane.showMessageDialog(null, "That's a great score!");
        }

        // End the program.
        System.exit(0);
    }
}
