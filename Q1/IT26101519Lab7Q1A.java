import java.util.Scanner;

public class IT26101519Lab7Q1A { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks for four subjects:");
        
        System.out.print("Enter Subject Mark 1: ");
        int m1 = sc.nextInt();
        
        System.out.print("Enter Subject Mark 2: ");
        int m2 = sc.nextInt();
        
        System.out.print("Enter Subject Mark 3: ");
        int m3 = sc.nextInt();
        
        System.out.print("Enter Subject Mark 4: ");
        int m4 = sc.nextInt();

        double avg = (m1 + m2 + m3 + m4) / 4.0;
        String grade;

        if (avg >= 75)
            grade = "Distinction";
        else if (avg >= 50)
            grade = "Credit";
        else
            grade = "Fail";

        System.out.println();
        System.out.println("Average is : " + avg);
        System.out.println("Overall Grade is : " + grade);
        
        sc.close();
    }
}