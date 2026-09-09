public class it24102787lab7q2B {
    public static void main(String[] args) {
        // loop number
        int i;
        for (i = 1; i <= 5; i++) {

        System.out.print(i + " -");

        for(int j = 1; j <= i; j++) {
          System.out.print("* ");
        }
       System.out.println();
        }
    }
}