public class IT22629180Lab7Q2B {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            StringBuilder sb = new StringBuilder();
            sb.append(row).append(" - ");
            for (int col = 1; col <= row; col++) {
                sb.append("*");
                if (col < row) {
                    sb.append(" ");
                }
            }
            System.out.println(sb.toString());
        }
    }
}
