import java.util.Scanner;

public class IT26101519Lab7Q1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 3 students ku loop
        for(int i = 1; i <= 3; i++) {
            System.out.println("Student " + i);
            System.out.print("Enter marks: ");
            
            int m1 = sc.nextInt();
            int m2 = sc.nextInt();
            int m3 = sc.nextInt();
            int m4 = sc.nextInt();

            double avg = (m1 + m2 + m3 + m4) / 4.0;
            String grade;

            if (avg >= 75)
                grade = "Distinction";
            else if (avg >= 50)
                grade = "Credit";
            else
                grade = "Fail";

            System.out.println("Average is : " + avg);
            System.out.println("Overall Grade is : " + grade);
            System.out.println(); // students ku idayila gap ku
        }
        
        sc.close();
    }
}