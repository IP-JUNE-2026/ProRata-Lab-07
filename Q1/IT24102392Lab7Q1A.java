import java .util.Scanner;

public class IT24102392Lab7Q1A{

public static void main(String args[]){

Scanner input=new Scanner(System.in);

System.out.print("Enter subject Mark 1: ");
int subject1=input.nextInt();

System.out.print("Enter subject Mark 2: ");
int subject2=input.nextInt();

System.out.print("Enter subject Mark 3: ");
int subject3=input.nextInt();

System.out.print("Enter subject Mark 4: ");
int subject4=input.nextInt();

/*int total=0;
total=subject1+subject2+subject3+subject4;
double avg;
avg=total/4.0;
System.out.print("Average is:"+avg);*/


double avg;
avg=(subject1+subject2+subject3+subject4)/4.0;
System.out.println("Average is:"+avg);

if((100>=avg)||(avg>=75))
{

System.out.println("Overrall Grade is:Distinction");
}

else if((75>=avg)||(avg>=50))
{
System.out.println("Overrall Grade is:Credit");
}

else if {
System.out.println("Overrall Grade is:Fail");
}
}
}