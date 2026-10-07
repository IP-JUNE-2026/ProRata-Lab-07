import java.util.Scanner;

public class IT23362758Lab7Q3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        for(int customer = 1; customer <= 5; customer++)
        {
            System.out.println("\nCustomer " + customer);

            System.out.print("Enter total bill amount: ");
            double bill = input.nextDouble();

            System.out.print("Enter payment mode (C for Cash, O for Other): ");
            char mode = input.next().charAt(0);

            double discount = 0;
            double amountToPay;

            if(mode == 'C' || mode == 'c')
            {
                discount = bill * 0.05;
            }
            else if(mode == 'O' || mode == 'o')
            {
                discount = 0;
            }
            else
            {
                System.out.println("Payment Mode is Not Valid");
                continue;
            }

            amountToPay = bill - discount;

            System.out.println("Discount = " + discount);
            System.out.println("Amount to be Paid = " + amountToPay);
        }
    }
}
  