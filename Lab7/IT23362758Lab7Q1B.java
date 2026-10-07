import java.util.Scanner;

public class IT23362758Lab7Q1B
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		for(int student = 1; student <= 3; student++)
		{
			System.out.println("\nstudent " + student);
			System.out.print("Enter the marks: ");
			
			int s1 = input.nextInt();
			int s2 = input.nextInt();
			int s3 = input.nextInt();
			int s4 = input.nextInt();
			
			double average = (s1 + s2 + s3 + s4) / 4.0;
			
			System.out.println("Average is : " + average);
			
			if(average >= 75)
				System.out.println("Overall Grade is : Distinction ");
			else if(average >= 50)
				System.out.println("Overall Grade is : Credit");
			else
				System.out.println("Overall Grade is : Fail");
		}
	}
}

