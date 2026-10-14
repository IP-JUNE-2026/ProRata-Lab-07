import java.util.Scanner;

public class IT22168986Lab6Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sumOfSquares = 0; 
        int count = 0;           

        System.out.println("Enter positive integers (terminate input with -99):");

        while (true) {
			System.out.print("Enter a number: ");
            int number = input.nextInt();

            if (number == -99) {
                break;
            }

            if (number < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate.");
                continue;
            }

            // Add the square of the number to the sum
            sumOfSquares += Math.pow(number, 2);
            count++;
        }

        // Ensure at least one valid number was entered
        if (count == 0) {
            System.out.println("No numbers entered. Cannot calculate RMS.");
        } else {
            // Calculate Root Mean Square (RMS)
            double rms = Math.sqrt(sumOfSquares / count);
            System.out.println("The Root Mean Square (RMS) is: " + rms);
        }

    }
}
