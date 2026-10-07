import java.util.Scanner;

public class IT23362758Lab7Q1A
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int s1, s2, s3, s4;
		double average;
		
		System.out.print("Enter the marks of Subject 1: ");
		s1 = input.nextInt();
		
		System.out.print("Enter the marks of subject 2: ");
		s2 = input.nextInt();
		
		System.out.print("Enter the marks of subject 3: ");
		s3 = input.nextInt();

		System.out.print("Enter the marks of subject 3: ");
		s4 = input.nextInt();
		
		average = (s1 + s2 + s3 + s4)/ 4.0;
		
		if(average >= 75)
			System.out.println("Overall Grade is: Distinction");
		else if(average >= 50)
			
		System.out.println("Oevrall Grade is: Credit");
		
		else 
			System.out.println("Overall Grade is: Fail");
	}
}