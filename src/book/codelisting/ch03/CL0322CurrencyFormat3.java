package book.codelisting.ch03;

import javax.swing.JOptionPane;

public class CL0322CurrencyFormat3 {
    public static void main(String[] args) {
        double monthlyPay = 5000.0d;
        double annualPay = monthlyPay * 12;

        JOptionPane.showMessageDialog(null,
                String.format("Your annual pay is $%,.2f", annualPay));
        System.exit(0);
    }
}
