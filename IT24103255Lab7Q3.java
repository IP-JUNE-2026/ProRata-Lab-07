import java.util.Scanner;
public class IT24103255Lab7Q3{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        char c;
    double paid;
        for (int i=1;i<=5;++i) {
            System.out.println("Customer "+i);
            System.out.println("Enter total bill amount:");
            double total=scanner.nextDouble();
            
         scanner.nextLine();
          
            System.out.print("Enter the mode of payment: " );
            char mode  = scanner.nextLine().charAt(0);
            
            if(mode=='c') {
                
                double discount=total*0.05;
                System.out.println("Discount is "+discount);
            }
            
            else if(mode=='0'){
                System.out.println("No discount applicable");
                
            }
            else{
                System.out.println("Payment mode is Not Valid");
            }
            
            
            double discount=total*0.05;
            paid=total-discount;
            
            System.out.println("Amount to be paid: "+paid);
            
            
            
            
            
        }
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
}