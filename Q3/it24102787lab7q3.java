import java.util.Scanner;

public class it24102787lab7q3{
    public static void main(String[] args) {

        final double  DISCOUNT = 0.05;

        Scanner input = new Scanner(System.in);

        for (int costomer=1;costomer<=5;costomer++){
            System.out.println("Costomer"+costomer);

            System.out.print("Enter the total bill amount:  ");
            double amount = input.nextDouble();

            System.out.print("Enter the mod of payment ( C for cash, O for other) : ");
            char method =input.next().charAt(0);

            switch (method){

                case 'c','C':
                    double discountamount = amount * DISCOUNT;
                    System.out.println("Discount is : "+ discountamount);
                    double total = amount - discountamount;
                    System.out.println("Amount to be paid : " + total);
                    break;

                case 'o','O':
                    System.out.println("No discount applicable");
                    System.out.println("Amount to be paid : " + amount);
                    break;

                default:
                    System.out.println("Payment method is not valid");
            }
            System.out.println();

        }
    }
}
