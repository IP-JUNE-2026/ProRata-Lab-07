import java.util.Scanner;

public class IT24100150Lab7Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
        
        for (int i = 1; i <= 3; i++) {
			
            System.out.println("Student " + i );
            System.out.print("Enter marks: ");
            int m1 = scanner.nextInt();
            int m2 = scanner.nextInt();
            int m3 = scanner.nextInt();
            int m4 = scanner.nextInt();
            
            double average = (m1 + m2 + m3 + m4) / 4.0;
            System.out.println("Average is: " + average);
            
            if (average >= 75 && average <= 100) {
                System.out.println("Overall Grade is: Distinction");
            } 
			
			else if (average >= 50 && average < 75) {
                System.out.println("Overall Grade is: Credit");
            } 
			
			else if (average >= 0 && average < 50) {
                System.out.println("Overall Grade is: Fail");
            }
			
			System.out.println();
        }
        
    }
}