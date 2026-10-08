import java.util.Scanner;
public class IT25101713Lab7Q1A{
	public static void main(String[]args){
		
		Scanner io=new Scanner(System.in);
		
		System.out.println("Enter mark for four subjects : ");
		
		
		System.out.print("Enter subject mark 1  : ");
		int mark1=io.nextInt();
		
		System.out.print("Enter subject mark 2 : ");
		int mark2=io.nextInt();
		
		System.out.print("Enter subject mark 3 : ");
		int mark3=io.nextInt();
		
		System.out.print("Enter subject mark 4 : ");
		int mark4=io.nextInt();
		
		double avg=(mark1 + mark2 + mark3 + mark4)/4;
		
		System.out.println("Average is : " +avg);
		
		if(avg >=75 && avg <=100){
			System.out.print("overall Grade is : Distinction");
		}
		
		else if (avg <=74 && avg >=50 ){
			System.out.print("Overall Grade is : Credit");
		}
		
		else{
			System.out.print("Overall Grade is : Fail");
		}
	}
}
