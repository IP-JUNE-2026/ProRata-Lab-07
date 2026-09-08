import java.util.Scanner;

public class IT22921130Lab7Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter mark 1: ");
        int m1 = input.nextInt();

        System.out.print("Enter mark 2: ");
        int m2 = input.nextInt();

        System.out.print("Enter mark 3: ");
        int m3 = input.nextInt();

        System.out.print("Enter mark 4: ");
        int m4 = input.nextInt();

        double average = (m1 + m2 + m3 + m4) / 4.0;

        System.out.println("Average = " + average);

        if (average >= 75)
            System.out.println("Grade = Distinction");
        else if (average >= 50)
            System.out.println("Grade = Credit");
        else
            System.out.println("Grade = Fail");
    }
}