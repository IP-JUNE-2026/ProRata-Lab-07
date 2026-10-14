import java.util.Scanner;

public class IT22925404Lab7Q1B{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 1; i <= 3; i++) {
            System.out.println("Student " + i);
            System.out.print("Enter marks: ");
			
		int mark1 = scanner.nextInt();
        int mark2 = scanner.nextInt();
        int mark3 = scanner.nextInt();
        int mark4 = scanner.nextInt();
		
		double average = (mark1 + mark2 + mark3 + mark4) / 4.0;
		
		System.out.println("Average is : " + average);
		
		if (average >= 75) {
            System.out.println("Overall Grade is: Distinction");
        } else if (average >= 55) {
			System.out.println("Overall Grade is: Credit");
        } else if (average >= 40) {
			System.out.println("Overall Grade is: Pass");
        } else {
			System.out.println("Overall Grade is: Fail");
        }
		
		System.out.println("");
		}
	}
}