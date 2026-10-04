import java.util.Scanner;
public class IT24103255Lab7Q1B{
	public static void main(String args[]){
		
	Scanner Scanner=new Scanner(System.in);	
	
	String grade;  	
	
	for (int i=1;i<=3;++i){
	System.out.println("Enter the mark of student "+i);
	System.out.println("Enter marks :");
	int subject1=Scanner.nextInt();
	int subject2=Scanner.nextInt();
	int subject3=Scanner.nextInt();
	int subject4=Scanner.nextInt();
	
	double totalmarks=(subject1+subject2+subject3+subject4);
	System.out.println("Total mark is "+totalmarks);
	
	double average =(totalmarks)/4.0;
	System.out.println("Your average mark is "+average);
	
	
	if(average<=75){
		grade="Distinction";
	}
	else if(average<=50){
		grade="Credit";
	}
	else{
		grade="fail";
	}
	System.out.println("Your grade is: "+grade);
	}
	
	
	}
	
	
	
	
	
	
	
	
}