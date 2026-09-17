public class IT22199058Lab7Q2A {
    public static void main(String[] args) {
        for (int row = 1; row <= 4; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print("$");
                if (col < 5) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}