package book.codelisting.ch03;

import javax.swing.*;

public class CL0304NestedDecision {
    public static void main(String[] args) {
        int testScore;
        String input;

        input = JOptionPane.showInputDialog("Enter your numberic" +
                "test score and I will tell you the grade: ");
        testScore = Integer.parseInt(input);

        if (testScore < 60) {
            JOptionPane.showMessageDialog(null, "Grade is F.");
        } else {
            if (testScore < 70) {
                JOptionPane.showMessageDialog(null, "Grade is D.");
            } else {
                if (testScore < 80) {
                    JOptionPane.showMessageDialog(null, "Grade is C.");
                } else {
                    if (testScore < 90) {
                        JOptionPane.showMessageDialog(null, "Grade is B.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Grade is A.");
                    }
                }
            }
        }

        System.exit(0);
    }
}
