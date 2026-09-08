import java.util.Scanner;

public class IT22921130Lab7Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {

            System.out.println("\nCustomer " + i);

            System.out.print("Enter Bill Amount: ");
            double bill = input.nextDouble();

            System.out.print("Enter Payment Mode (C/O): ");
            char mode = input.next().charAt(0);

            double discount = 0;
            double amountToPay = bill;

            if (mode == 'C' || mode == 'c') {

                discount = bill * 0.05;
                amountToPay = bill - discount;

                System.out.println("Discount = " + discount);
                System.out.println("Amount to Pay = " + amountToPay);

            } else if (mode == 'O' || mode == 'o') {

                System.out.println("Discount = 0.0");
                System.out.println("Amount to Pay = " + bill);

            } else {

                System.out.println("Payment Mode is Not Valid");
            }
        }
    }
}