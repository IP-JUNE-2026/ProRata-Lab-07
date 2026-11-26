import java.util.Scanner;

public class IT23394124Lab7Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Marks of the Four Subject:");
 
        int sum = 0 ;
        
        for(int i=1;i<=4;i++){
         System.out.println("Enter Subject Mark"+i+":");
         int mark = input.nextInt();
         sum = mark+sum;

        }
        
        double avg = sum/ 4 ;

        System.out.println("Avarage of the Four Subject :"+avg);

        if (avg >= 75) {
            System.out.println("Overall Grade is : Distinction");
        } else if (avg >= 50) {
            System.out.println("Overall Grade is : Credit");
        } else {
            System.out.println("Overall Grade is : Fail");
        }


        input.close();
    }
}