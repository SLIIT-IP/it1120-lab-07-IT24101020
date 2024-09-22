import java.util.Scanner;

public class IT24101020Lab7Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double discountRate = 0.05; 
        int customerCount = 5;

        for (int i = 1; i <= customerCount; i++) {
            System.out.println("Enter the total bill amount for customer " + i + ": ");
            double billAmount = scanner.nextDouble();

            System.out.println("Enter the mode of payment for customer " + i + " (C for Cash or O for Other): ");
            char paymentMode = scanner.next().charAt(0);

            if (paymentMode == 'C' || paymentMode == 'c') {
                double discount = billAmount * discountRate;
                double amountToBePaid = billAmount - discount;
                System.out.println("Customer " + i + " is eligible for a 5% discount.");
                System.out.println("Discount: $" + discount);
                System.out.println("Amount to be paid: $" + amountToBePaid);
            } else if (paymentMode == 'O' || paymentMode == 'o') {
                System.out.println("Customer " + i + " is not eligible for a discount.");
                System.out.println("Amount to be paid: $" + billAmount);
            } else {
                System.out.println("Payment Mode is Not Valid");
            }
            System.out.println();
        }

        scanner.close();
    }
}
