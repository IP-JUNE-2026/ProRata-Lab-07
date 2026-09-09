import java.util.Scanner;

public class it24102787lab7q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Enter subject marks
        System.out.print("Enter subject marks 1: ");
        int marks1 = input.nextInt();

        System.out.print("Enter subject marks 2: ");
        int marks2 = input.nextInt();

        System.out.print("Enter subject marks 3: ");
        int marks3 = input.nextInt();

        System.out.print("Enter subject marks 4: ");
        int marks4 = input.nextInt();

        // Calculate total
        double tot = marks1 + marks2 + marks3 + marks4;
        System.out.println("Total marks: " + tot);

        // Calculate average
        double avg = tot / 4;
        System.out.println("Average marks: " + avg);

        // determine grade
        String grade;
        if (avg >= 75 && avg <= 100 ) {
            grade = "distinction";
        }else if (avg >= 50 && avg <= 75) {
            grade = "credit";
        }else {
            grade = "fail";
        }
        System.out.println("overall grade is: " + grade);
    }
}
