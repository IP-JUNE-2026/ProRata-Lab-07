import java.util.Scanner;
   public class IT24103255Lab7Q1A{
	   public static void main(String[]args){
		   
		   Scanner Scanner= new Scanner(System.in);
		   
		   System.out.print("Enter subject mark 01: ");
		   int subject1= Scanner.nextInt();
		   
		   System.out.print("Enter subject mark 02: ");
		   int subject2= Scanner.nextInt();
		   
		   System.out.print("Enter subject mark 03: ");
		   int subject3= Scanner.nextInt();
		   
		   System.out.print("Enter subject mark 04: ");
		   int subject4= Scanner.nextInt();
		   
		   
		   double average=(subject1+subject2+subject3+subject4)/4.0;
		   System.out.println("Average is "+average);
		   
		   String grade;
           
             if(average>=75){
				 grade = "Distinction";
				 
			 }		   
		      
			  else if(average>=50){
				  grade="Credit";
				  
			  }
			  else{
				  grade="fail";
				 
			  }
		   System.out.print("Your grade is: "+grade);
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
   }