import java.util.Scanner;

public class IT23394124Lab7Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Marks of the Four Subject:");
 
        
        
        for(int student = 1 ; student<=3 ; student++){
           
           System.out.println("Student " + student);
           System.out.print("Enter marks: ");
           int sum = 0 ;
           for(int i=1;i<=4;i++){
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
          System.out.println();
        
         }

        input.close();
    }
}