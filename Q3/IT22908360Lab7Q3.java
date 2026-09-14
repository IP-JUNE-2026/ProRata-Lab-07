import java.util.Scanner;

public class IT22908360Lab7Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double totalBill;
        double discount;
        double amountToPay;
        char paymentMode;

        for (int customer = 1; customer <= 5; customer++) {

            System.out.println("Customer " + customer);

            System.out.print("Enter total bill amount: ");
            totalBill = input.nextDouble();

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            paymentMode = input.next().charAt(0);

            if (paymentMode == 'C' || paymentMode == 'c') {

                discount = totalBill * 5 / 100;
                amountToPay = totalBill - discount;

                System.out.println("Discount is: " + discount);
                System.out.println("Amount to be paid: " + amountToPay);

            } else if (paymentMode == 'O' || paymentMode == 'o') {

                discount = 0;
                amountToPay = totalBill;

                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + amountToPay);

            } else {

                System.out.println("Payment Mode is Not Valid");
            }

            System.out.println();
        }
    }
}