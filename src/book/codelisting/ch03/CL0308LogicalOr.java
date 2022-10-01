package book.codelisting.ch03;

import javax.swing.JOptionPane;

public class CL0308LogicalOr {
    public static void main(String[] args) {
        double salary, yearsOnJob;
        String input;

        input = JOptionPane.showInputDialog("Enter your annual salary.");
        salary = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Enter the number of years" +
                " at your current job.");
        yearsOnJob = Double.parseDouble(input);

        if (salary >= 30000 || yearsOnJob >= 2) {
            JOptionPane.showMessageDialog(null, "you" +
                    " qualify for the loan.");
        } else {
            JOptionPane.showMessageDialog(null, "You do not" +
                    "qualify for the loan.");
        }

        System.exit(0);
    }
}
