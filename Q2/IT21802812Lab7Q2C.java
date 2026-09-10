public class IT21802812Lab7Q2C {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            int number = 6 - row;
            for (int col = 1; col <= number; col++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}