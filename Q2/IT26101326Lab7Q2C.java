public class IT26101326Lab7Q2C {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {       // 5,4,3,2,1
            for (int j = 1; j <= i; j++) {   // i times repeat
                System.out.print(i);
            }
            System.out.println();
        }
    }
}