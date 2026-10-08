import java.util.Scanner;

public class Lab7Q1b {
	
    public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);

        for (int student = 1; student <= 3; student++) {
		
            System.out.println("\nEnter 4 subject marks for Student " + student + " ");

            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int num3 = input.nextInt();
            int num4 = input.nextInt();

            double average = (num1 + num2 + num3 + num4) / 4.0;

            System.out.println("Student " + student + " Average Marks = " + average);

            if (average >= 75 && average <= 100) 
				
			{
                System.out.println("Overall Grade: Distinction");
            } 
			
			else if (average >= 50 && average < 75) 
			
			{
                System.out.println("Overall Grade: Credit");
            } 
			
			else if (average >= 0 && average < 50) 
			
			{
                System.out.println("Overall Grade: Fail");
            } 
			
			else 
			{
                System.out.println("Invalid Marks Entered!");
            }
			
        }

        
    }
}
