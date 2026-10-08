import java.util.Scanner;
public class IT25101713Lab7Q1B{
	public static void main(String[]args){
		
		Scanner io=new Scanner(System.in);
		
		int std = 1;
		while(std <=3 ){
			
			System.out.println("student" + std);
	
		
		System.out.print("Enter mark : ");
		int mark1=io.nextInt();
		int mark2=io.nextInt();
		int mark3=io.nextInt();
		int mark4=io.nextInt();
		
		double avg=(mark1 + mark2 + mark3 + mark4)/4;
		
		System.out.println("Average is : " +avg);
		
		if(avg >=75 && avg <=100){
			System.out.println("overall Grade is : Distinction");
		}
		
		else if (avg <=74 && avg >=50 ){
			System.out.println("Overall Grade is : Credit");
		}
		
		else{
			System.out.println("Overall Grade is : Fail");
		}
		std=std+1;
		}
	}
}

	



