import java.util.Scanner;

public class IT22908360Lab7Q1B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double mark1, mark2, mark3, mark4;
        double average;

        for (int student = 1; student <= 3; student++) {

            System.out.println("Student " + student);
            System.out.print("Enter marks: ");

            mark1 = input.nextDouble();
            mark2 = input.nextDouble();
            mark3 = input.nextDouble();
            mark4 = input.nextDouble();

            average = (mark1 + mark2 + mark3 + mark4) / 4;

            System.out.println("Average is : " + average);

            if (average >= 75) {
                System.out.println("Overall Grade is : Distinction");
            } else if (average >= 50) {
                System.out.println("Overall Grade is : Credit");
            } else {
                System.out.println("Overall Grade is : Fail");
            }

            System.out.println();
        }
    }
}