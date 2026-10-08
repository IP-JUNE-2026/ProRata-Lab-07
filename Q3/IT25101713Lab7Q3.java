import java.util.Scanner;
public class  IT25101713Lab7Q3{
    public static void main(String []args){

        Scanner in=new Scanner(System.in);

        int std=1;

        while (std<=5) {

            System.out.println("Customer "+std);

            System.out.print("Enter total bill amount: ");
            int bill=in.nextInt();

            System.out.print("Enter mode of payment (C for cash, 0 for other): ");
            char modeOfPayment=in.next().charAt(0);

            if(modeOfPayment=='C' || modeOfPayment=='c'){

                double dis=(bill*5)/100.0;
                System.out.println("Discount is: "+dis);
                
                double amount=bill-dis;
                System.out.println("Amount to be paid: "+amount);
            }
            else if(modeOfPayment=='O' || modeOfPayment=='o'){
                System.out.println("No discount applicable");

                double dis=(bill*0)/100.0;
                
                double amount=bill-dis;
                System.out.println("Amount to be paid: "+amount);
            }
            else{
                System.out.println("Payment Mode is Not Valid");
            }

            System.out.println(" ");

            std++;
        }

    }
}