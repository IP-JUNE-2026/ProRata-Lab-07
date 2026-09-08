import java.util.Scanner;

public class IT23240506Lab7Q1A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[4];
        int sum = 0;

        System.out.println("Enter marks for four subjects:");

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter Subject Mark " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            sum += marks[i];
        }

        double avg = sum / 4.0;

        String grade;
        if (avg >= 75) {
            grade = "Distinction";
        } else if (avg >= 50) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }

        System.out.println("");
        System.out.println("Average is : " + avg);
        System.out.println("Overall Grade is : " + grade);

    }
}