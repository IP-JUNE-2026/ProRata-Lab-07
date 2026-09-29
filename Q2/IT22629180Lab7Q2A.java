public class IT22629180Lab7Q2A {
    public static void main(String[] args) {
        for (int row = 1; row <= 4; row++) {
            StringBuilder sb = new StringBuilder();
            for (int col = 1; col <= 5; col++) {
                sb.append("$");
                if (col < 5) {
                    sb.append(" ");
                }
            }
            System.out.println(sb.toString());
        }
    }
}
