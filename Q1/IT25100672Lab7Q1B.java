import java.util.Scanner;

public class IT25100672Lab7Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Student " + i);
            System.out.print("Enter marks: ");
            double m1 = scanner.nextDouble();
            double m2 = scanner.nextDouble();
            double m3 = scanner.nextDouble();
            double m4 = scanner.nextDouble();

            double avg = (m1 + m2 + m3 + m4) / 4.0;
            System.out.println("Average is: " + avg);

            String grade;
            if (avg >= 75) {
                grade = "Distinction";
            } else if (avg >= 50) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }

            System.out.println("Overall Grade is: " + grade);
            System.out.println();
        }

       
    }
}