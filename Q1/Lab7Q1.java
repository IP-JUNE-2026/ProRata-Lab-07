import java.util.Scanner;

public class Lab7Q1{
	
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		
		double average = 0;
		double sum = 0;
		
		System.out.print("Enter Subject Mark 1 :");
		int num1 = input.nextInt();
		
		System.out.print("Enter Subject Mark 2 :");
		int num2 = input.nextInt();
		
		System.out.print("Enter Subject Mark 3 :");
		int num3 = input.nextInt();
		
		System.out.print("Enter Subject Mark 4 :");
		int num4 = input.nextInt();
		
		sum = (num1 + num2 + num3 + num4);
		average = (sum / 4);
		
		if ( average >= 75 && average <= 100 ){
			
			System.out.print("Overoll Credit Is Distinction");
			
		}
		
		else if ( average >= 50 && average < 75 ){
			
			System.out.print("Overoll Credit Is Credit");
			
		}
		
		else {
			
			System.out.print("Overoll Credit Is Fail");
			
		}
		
	}	
	
}