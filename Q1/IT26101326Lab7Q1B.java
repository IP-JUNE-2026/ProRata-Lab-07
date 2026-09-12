import java.util.Scanner;

public class IT26101326Lab7Q1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 1; i <= 3; i++) {
            System.out.println("Student " + i);
            System.out.print("Enter marks: ");
            
            int m1 = sc.nextInt();
            int m2 = sc.nextInt();
            int m3 = sc.nextInt();
            int m4 = sc.nextInt();
            
            double average = (m1 + m2 + m3 + m4) / 4.0;
            
            String grade;
            if (average >= 75) {
                grade = "Distinction";
            } else if (average >= 50) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }
            
            System.out.println("Average is : " + average);
            System.out.println("Overall Grade is : " + grade);
            System.out.println();
        }
    }
}