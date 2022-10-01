package book.codelisting.ch03;

import javax.swing.JOptionPane;

public class CL0312VariableScope {
    public static void main(String[] args) {
        // Get user's first name.
        String firstName;
        firstName = JOptionPane.showInputDialog("Enter your " +
                "first name.");

        // Get user's last name.
        String lastName;
        lastName = JOptionPane.showInputDialog("Enter your " +
                "last name.");

        JOptionPane.showMessageDialog(null, "Hello, " +
                firstName + " " + lastName);
        System.exit(0);
    }
}
